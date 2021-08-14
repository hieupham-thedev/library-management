package fa.training.view;

import java.util.Scanner;

public class AddAuthorToBookPage {
    public String insertIsbnOfBook() {
        System.out.println("====== 4. Add author to book ======");
        System.out.print("Insert ISBN: ");
        Scanner sc = new Scanner(System.in);
        String isbn = sc.nextLine();
        return isbn;
    }

    public void bookIsbnNotFound() {
        System.out.println("Book isbn not found!");
    }

    public String insertAuthor() {
        System.out.print("Insert author: ");
        Scanner sc = new Scanner(System.in);
        String author = sc.nextLine();
        return author;
    }
}
