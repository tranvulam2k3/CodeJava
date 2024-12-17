package ss5_loop.test;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("Hinh 1");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Hinh 2");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Hinh 3");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Hinh 4");
        for (int i = 1; i <= n; i++) { //i=2
            for (int j = 1; j <= i - 1; j++) { //j 2
                System.out.print("  ");
            }

            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Hinh 5");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Hinh 6");
        for (int i = 1; i <= n; i++) { //i=2
            for (int j = 1; j <= i - 1; j++) { //j 2
                System.out.print("  ");
            }

            for (int j = n; j >= i*2-1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
