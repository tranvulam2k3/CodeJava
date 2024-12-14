package ss3_java_overview.exercise.exercise2;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số b: ");
        int b = sc.nextInt();

        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = (double) a / b;

        System.out.println("a+b = " + tong);
        System.out.println("a-b = " + hieu);
        System.out.println("a*b = " + tich);
        System.out.println("a/b = " + thuong);

    }
}
