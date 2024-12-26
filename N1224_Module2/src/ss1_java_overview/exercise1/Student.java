package ss1_java_overview.exercise1;

import java.util.Scanner;

public class Student {
    String name;
    double mathScore;
    double literatureScore;

    public Student() {
    }


    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter math score: ");
        mathScore = Double.parseDouble(sc.nextLine());

        System.out.print("Enter literature score: ");
        literatureScore = Double.parseDouble(sc.nextLine());
    }

    double averageScore() {
        return (mathScore + literatureScore) / 2;
    }

    void output() {
        System.out.println("===== Information Student =====");
        System.out.println("Student Name: " + name);
        System.out.println("Math Score: " + mathScore);
        System.out.println("Literature Score: " + literatureScore);
        System.out.println("Average Score: " + averageScore());
    }
}
