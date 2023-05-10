import java.util.Scanner;

public class StudentUI {

    private Scanner scanner;
    private StudentService studentService;

    public StudentUI() {
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

                default:
                    System.out.println("Invalid Option.");
                    break;
            }
        } while (choice != 3);
    }

    public void menu() {
        System.out.println("Press 1>> Add student");
        System.out.println("Press 2>> List Of Name");
        System.out.println("Press 3>> For Exit");
        System.out.println("Enter Your Choice");
    }

    private void addName() {
        System.out.println("Enter Name");
        studentService.name(scanner.nextLine());
        System.out.println("Name Added.");
    }

    private void retriveName() {
        System.out.println("Name List");
        System.out.println("-----------------");
        studentService.names().forEach(System.out::println);
        System.out.println("-----------------");
    }

}
