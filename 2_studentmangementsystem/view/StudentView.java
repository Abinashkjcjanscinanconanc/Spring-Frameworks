package view;

import java.util.Scanner;

import model.Student;
import service.StudentService;

public class StudentView {
    private Scanner scanner;
    private StudentService studentService;

    public StudentView() {
        scanner = new Scanner(System.in);
        studentService = new StudentService();
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
        System.out.println("Press 1>> Add Student");
        System.out.println("Press 2>> List Of Student");
        System.out.println("Press 3>> For Exit");
        System.out.println("Press 4>> Home Page");
        System.out.println("Enter Your Choice");
    }

    private void addName() {
        System.out.println("Enter Name");
        var name = scanner.nextLine();

        System.out.println("Enter Roll");
        var roll = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Fee");
        var fee = Double.parseDouble(scanner.nextLine());

        var student = new Student(name, roll, fee);
        studentService.addStudent(student);
        System.out.println("Student added");
    }

    private void retriveName() {
        System.out.println("Student List");
        System.out.println("------------------");
        studentService.students().forEach(System.out::println);
        System.out.println("------------------");
    }
}
