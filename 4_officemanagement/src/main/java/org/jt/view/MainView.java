package org.jt.view;

import java.util.Scanner;

public class MainView {
    private final Scanner scanner;

    public MainView() {
        scanner = new Scanner(System.in);
    }

    public void home() {
        int choice;

        do {
            menu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> new StudentView().homePage();
                case 2 -> new EmployeeView().homePage();
                case 3 -> new CourseView().homePage();
            }
        } while (choice != 4);
    }

    private void menu() {
        System.out.println("Press 1>> For Student");
        System.out.println("Press 2>> For Employee");
        System.out.println("Press 3>> For Course");
        System.out.println("Press 4>> For Exit");
        System.out.println("Enter Your Choice");
    }
}

