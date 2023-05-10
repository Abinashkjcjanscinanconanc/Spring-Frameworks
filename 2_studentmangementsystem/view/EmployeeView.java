package view;

import java.util.Scanner;

import model.Employee;
import service.EmployeeService;

public class EmployeeView {
    private Scanner scanner;
    private EmployeeService EmployeeService;

    public EmployeeView() {
        scanner = new Scanner(System.in);
        EmployeeService = new EmployeeService();
    }

    public void homePage() {
        int choice;

        do {
            menu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addName();
                    break;
                case 2:
                    retriveName();
                    break;
                case 4:
                    new MainView().home();
                    break;
            }
        } while (choice != 3);
    }

    private void menu() {
        System.out.println("Press 1>> Add Employee");
        System.out.println("Press 2>> List Of Employee");
        System.out.println("Press 3>> For Exit");
        System.out.println("Press 4>> Home Page");
        System.out.println("Enter Your Choice");
    }

    private void addName() {
        System.out.println("Enter id");
        var id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Name");
        var name = scanner.nextLine();

        System.out.println("Enter Fee");
        var salary = Double.parseDouble(scanner.nextLine());

        var Employee = new Employee(id, name, salary);
        EmployeeService.addEmployee(Employee);
        System.out.println("Employee added");
    }

    private void retriveName() {
        System.out.println("Employee List");
        System.out.println("------------------");
        EmployeeService.employees().forEach(System.out::println);
        System.out.println("------------------");
    }
}
