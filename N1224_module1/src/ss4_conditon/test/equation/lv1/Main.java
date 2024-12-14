package ss4_conditon.test.equation.lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số a: ");
        double a = sc.nextInt();

        System.out.print("Nhập vào số b: ");
        double b = sc.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            double x = -b / a;
            System.out.println("Phương trình có 1 nghiệm duy nhất: " + x);
        }
    }
}
