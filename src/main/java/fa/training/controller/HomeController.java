package fa.training.controller;

import fa.training.dao.BookDao;
import fa.training.service.BookService;
import fa.training.service.MagazineService;
import fa.training.view.BooksMagazinePage;
import fa.training.view.HomePage;
import fa.training.view.SearchBookPage;
import fa.training.view.TopTenMagazinesbyVolumPage;

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
            case 3:
                displayBooksAndMagazines();
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
