package ss5_loop.test;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int f1 = 0;
        int f2 = 1;
        int fn = 1;

        while (fn <= n) {
            System.out.print(fn + "\t");

            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }

    }
}
