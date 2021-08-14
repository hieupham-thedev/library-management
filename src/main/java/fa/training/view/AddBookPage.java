package fa.training.view;

import fa.training.model.Book;
import fa.training.util.ValidateUtil;

import java.util.HashSet;
import java.util.Scanner;

public class AddBookPage {
    public Book showBookForm() {
        System.out.println("====== 1. Add a book ======");
        Scanner sc = new Scanner(System.in);

        String isbn = null;
        while (!ValidateUtil.isNonEmptyString(isbn)) {
            System.out.print("ISBN: ");
            isbn = sc.nextLine();
        }

        String publicationPlace = null;
        while (!ValidateUtil.isNonEmptyString(publicationPlace)) {
            System.out.print("Publication place: ");
            publicationPlace = sc.nextLine();
        }

        String publicationYear = null;
        while (!ValidateUtil.isValidNumber(publicationYear)) {
            System.out.print("Publication year: ");
            publicationYear = sc.nextLine();
        }

        String publisher = null;
        while (!ValidateUtil.isNonEmptyString(publisher)) {
            System.out.print("Publisher: ");
            publisher = sc.nextLine();
        }

        String publicationDate = null;
        while (!ValidateUtil.isValidDate(publicationDate)) {
            System.out.print("Publication date: ");
            publicationDate = sc.nextLine();
        }

        return new Book(isbn, new HashSet<>(), publicationPlace, Integer.valueOf(publicationYear), publisher, ValidateUtil.formatDate(publicationDate));
    }
}
