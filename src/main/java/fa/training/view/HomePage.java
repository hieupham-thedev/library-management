package fa.training.view;

import java.util.Scanner;

public class HomePage {
    public Integer showOption() {
        System.out.println("====== LIBRARY MANAGEMENT SYSTEM ======");
        System.out.println("1. Add a book");
        System.out.println("2. Add a magazine");
        System.out.println("3. Display books and magazines");
        System.out.println("4. Add author to book");
        System.out.println("5. Display top 10 of magazines by volume");
        System.out.println("6. Search book by (isbn, author, publisher)");
        System.out.println("0. Exit");
        boolean validOption = false;
        Scanner sc = new Scanner(System.in);
        Integer option = null;
        while (!validOption) {
            try {
                System.out.print("Please choose function you'd like to do: ");
                option = Integer.valueOf(sc.nextLine());
                if (option < 0 || option > 6) {
                    throw new Exception();
                }
                validOption = true;
            } catch (Exception e) {
                System.out.println("Invalid option");
            }
        }
        return option;
    }
}
