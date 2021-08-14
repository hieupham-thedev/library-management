package fa.training.view;

import fa.training.model.Book;

import java.util.List;
import java.util.Scanner;

public class SearchBookPage {

    public String inputSearchWord() {
        System.out.println("====== 6. Search book by (isbn, author, publisher) ======");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input search word: ");
        String searchWord = sc.nextLine();
        return searchWord;
    }

    public void showSearchResult(List<Book> books) {
        System.out.println("Search result books:");
        if (books.size() > 0) {
            books.forEach(book -> book.display());
        } else {
            System.out.println("No book found!");
        }
    }
}
