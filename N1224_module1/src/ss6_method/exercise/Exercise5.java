package ss6_method.exercise;

import java.util.Scanner;

public class Exercise5 {
    static void printFibonacci(int n) {
        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(fn + "\t");

            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của dãy Fibonacci: ");
        int n = sc.nextInt();

        System.out.printf("%d phần tử của dãy Fibonacci", n);
        printFibonacci(n);
    }
}
