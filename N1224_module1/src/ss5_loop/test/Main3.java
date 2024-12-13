package ss5_loop.test;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                if (i % 6 == 0) {
                    System.out.print(-i + " ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
