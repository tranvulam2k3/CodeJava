package ss1_java_overview.student_management;

import java.util.Scanner;

public class Student {
    private int id;
    String name;
    double score;

    public Student(){}

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student id: ");
        id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter student score: ");
        score = Double.parseDouble(sc.nextLine());
    }

    void output() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Score: " + score);
    }
}
