package fa.training.service;

import fa.training.dao.BookDao;
import fa.training.model.Book;

import java.util.List;

public class BookService {

    private BookDao bookDao;

    public BookService() {
        bookDao = new BookDao();
    }

    public void create(Book book) {
        bookDao.getBooks().add(book);
    }

    public List<Book> readAll() {
        return bookDao.getBooks();
    }

    public boolean isBookIsbnExisted(String isbn) {
        return bookDao.getBookByIsbn(isbn) != null ? true : false;
    }

    public void addAuthorToBook(String isbn, String author) {
        Book book = bookDao.getBookByIsbn(isbn);
        if (book != null) {
            book.getAuthors().add(author);
        } else {
            System.out.println("[BookService]: isbn not found");
        }
    }

    public List<Book> searchBook(String searchWord) {
        return bookDao.searchByIsbnAuthorPublisher(searchWord);
    }
}
