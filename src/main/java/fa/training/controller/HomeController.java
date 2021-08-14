package fa.training.controller;

import fa.training.dao.BookDao;
import fa.training.model.Book;
import fa.training.model.Magazine;
import fa.training.service.BookService;
import fa.training.service.MagazineService;
import fa.training.view.*;

public class HomeController {

    private BookService bookService;

    private MagazineService magazineService;

    public HomeController() {
        this.bookService = new BookService();
        this.magazineService = new MagazineService();
    }

    public void getHome() {
        HomePage homePage = new HomePage();
        Integer option = homePage.showOption();
        switch (option) {
            case 1:
                addBook();
                break;
            case 2:
                addMagazine();
                break;
            case 3:
                displayBooksAndMagazines();
                break;
            case 4:
                addAuthorToBook();
                break;
            case 5:
                displayTopTenMagazinesByVolume();
                break;
            case 6:
                searchBook();
                break;
            case 0:
                System.exit(0);
            default:
                break;
        }
    }

    private void addAuthorToBook() {
        AddAuthorToBookPage page = new AddAuthorToBookPage();
        String isbn = page.insertIsbnOfBook();
        if (bookService.isBookIsbnExisted(isbn)){
            String author = page.insertAuthor();
            bookService.addAuthorToBook(isbn,author);
        } else {
            page.bookIsbnNotFound();
        }
    }

    private void addMagazine() {
        AddMagazinePage addMagazinePage = new AddMagazinePage();
        Magazine magazine = addMagazinePage.showMagazineForm();
        magazineService.create(magazine);
    }

    private void addBook() {
        AddBookPage addBookPage = new AddBookPage();
        Book book = addBookPage.showBookForm();
        bookService.create(book);
    }

    private void displayBooksAndMagazines() {
        BooksMagazinePage page = new BooksMagazinePage(bookService.readAll(), magazineService.readAll());
        page.display();
    }

    private void displayTopTenMagazinesByVolume() {
        TopTenMagazinesbyVolumPage page = new TopTenMagazinesbyVolumPage(magazineService.getTopTenMagazineByVolume());
        page.display();
    }

    private void searchBook() {
        SearchBookPage page = new SearchBookPage();
        String searchWord = page.inputSearchWord();
        page.showSearchResult(bookService.searchBook(searchWord));
    }
}
