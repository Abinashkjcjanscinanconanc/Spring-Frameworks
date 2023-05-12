package org.jt.view;

import java.util.Scanner;

import org.jt.model.Course;
import org.jt.service.CourseService;

public class CourseView {
    private final Scanner scanner;
    private final CourseService courseService;

    public CourseView() {
        scanner = new Scanner(System.in);
        courseService = new CourseService();
    }

    public void homePage() {
        int choice;

        do {
            menu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> addName();
                case 2 -> retriveName();
                case 4 -> new MainView().home();
            }
        } while (choice != 3);
    }

    private void menu() {
        System.out.println("Press 1>> Add Course");
        System.out.println("Press 2>> List Of Course");
        System.out.println("Press 3>> For Exit");
        System.out.println("Press 4>> Home Page");
        System.out.println("Enter Your Choice");
    }

    private void addName() {
        System.out.println("Enter course id");
        var id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter course Name");
        var name = scanner.nextLine();

        var course = Course.builder().courseId(id).courseName(name).build();
        courseService.addCourse(course);
        System.out.println("Course added");
    }

    private void retriveName() {
        System.out.println("Course List");
        System.out.println("------------------");
        courseService.courses().forEach(System.out::println);
        System.out.println("------------------");
    }
}

