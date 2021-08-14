package fa.training.view;

import fa.training.model.Magazine;
import fa.training.util.ValidateUtil;

import java.util.Scanner;

public class AddMagazinePage {
    public Magazine showMagazineForm() {
        System.out.println("====== 2. Add a magazine ======");
        Scanner sc = new Scanner(System.in);

        String author = null;
        while (!ValidateUtil.isNonEmptyString(author)) {
            System.out.print("Author: ");
            author = sc.nextLine();
        }

        String volume = null;
        while (!ValidateUtil.isValidNumber(volume)) {
            System.out.print("Volume: ");
            volume = sc.nextLine();
        }

        String edition = null;
        while (!ValidateUtil.isValidNumber(edition)) {
            System.out.print("Edition: ");
            edition = sc.nextLine();
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

        return new Magazine(author, Integer.valueOf(volume), Integer.valueOf(edition), Integer.valueOf(publicationYear), publisher, ValidateUtil.formatDate(publicationDate));
    }
}
