package fa.training;

import fa.training.controller.HomeController;
import fa.training.model.Book;
import fa.training.service.BookService;

import java.util.Date;
import java.util.HashSet;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*System.out.println("Hello World!");
        Book book1 = new Book("123", new HashSet<String>(), "US", 1990, "Manning", new Date());
        Book book2 = new Book("456", new HashSet<String>(), "VN", 2009, "Oreilly", new Date());

        BookService bookService = new BookService();
        bookService.create(book1);
        bookService.readAll().forEach(eachBook -> eachBook.display());
        System.out.println("==================================");
        bookService.create(book2);
        bookService.readAll().forEach(eachBook -> eachBook.display());
        System.out.println("==================================");
        bookService.addAuthorToBook("456", "Martin Taylor");
        bookService.readAll().forEach(eachBook -> eachBook.display());
        System.out.println("==================================");
        System.out.println("Search word: 123");
        bookService.searchBook("123").forEach(eachBook -> eachBook.display());
        System.out.println("==================================");
        System.out.println("Search word: Ma");
        bookService.searchBook("Ma").forEach(eachBook -> eachBook.display());*/

        HomeController homeController = new HomeController();
        while (true) {
            homeController.getHome();
        }
    }
}
