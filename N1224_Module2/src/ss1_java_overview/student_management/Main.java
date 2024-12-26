package ss1_java_overview.student_management;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        Student s1;
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.printf("=========Nhap vao nhan vien thu %d=========\n",i);
            s1 = new Student();
            s1.input();
            students.add(s1);
        }
        for (Student s : students) {
            System.out.printf("=========Thong tin nhan vien thu %d=========\n");
            s.output();
        }

    }
}
