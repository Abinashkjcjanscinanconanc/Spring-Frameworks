package view;

import java.util.Scanner;

public class MainView {
    private Scanner scanner;

    public MainView() {
        scanner = new Scanner(System.in);
    }

    public void home() {
        int choice;

        do {
            menu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    new StudentView().homePage();
                    break;
                case 2:
                    new EmployeeView().homePage();
                    break;
            }
        } while (choice != 3);
    }

    private void menu() {
        System.out.println("Press 1>> For Student");
        System.out.println("Press 2>> For Employee");
        System.out.println("Press 3>> For Exit");
        System.out.println("Enter Your Choice");
    }
}
