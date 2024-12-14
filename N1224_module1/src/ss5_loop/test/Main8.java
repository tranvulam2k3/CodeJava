package ss5_loop.test;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int fn = 1;

        while (fn < n) {
            System.out.print(fn + "\t");
            fn = fn * 2 + 1;
        }
    }
}
