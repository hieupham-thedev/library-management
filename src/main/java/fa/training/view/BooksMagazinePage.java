package fa.training.view;

import fa.training.model.Book;
import fa.training.model.Magazine;

import java.util.List;

public class BooksMagazinePage {

    private List<Book> books;
    private List<Magazine> magazines;

    public BooksMagazinePage(List<Book> books, List<Magazine> magazines) {
        this.books = books;
        this.magazines = magazines;
    }

    public void display() {
        System.out.println("====== 3. Display books and magazines ======");
        System.out.println("- Book list:");
        books.forEach(book -> book.display());
        System.out.println("- Magazine list:");
        magazines.forEach(magazine -> magazine.display());
    }
}
