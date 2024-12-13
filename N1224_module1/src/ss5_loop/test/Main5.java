package ss5_loop.test;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 2 * num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
