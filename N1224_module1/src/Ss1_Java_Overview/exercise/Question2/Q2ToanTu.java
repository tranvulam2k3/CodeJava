package Ss1_Java_Overview.exercise.Question2;

import java.util.Scanner;

public class Q2ToanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số a: ");
        int a = sc.nextInt();

        System.out.println("Nhập số b");
        int b = sc.nextInt();

        int tong = a+b;
        int hieu = a-b;
        int tich = a*b;
        double thuong = (double) a /b;

        System.out.println("a+b = " + tong);
        System.out.println("a-b = " + hieu);
        System.out.println("a*b = " + tich);
        System.out.println("a/b = " + thuong);

    }
}
