package sss_newyear;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Student> students = new ArrayList<Student>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        while (true) {
            do {
                System.out.println("1. Add Student");
                System.out.println("2. Get Student");
                System.out.println("=======================");
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        getStudent();
                        break;
                    default:
                        System.out.println("Invalid choice");
                        return;
                }
            } while (true);
        }
    }

    public static void addStudent() {
        Student newStudent = new Student();
        newStudent.input();
        students.add(newStudent);
    }

    public static void getStudent() {
        for (Student student : students) {
            student.output();
        }
    }
}
