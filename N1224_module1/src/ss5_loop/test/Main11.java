package ss5_loop.test;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        double sum = 0.0;
        StringBuilder str = new StringBuilder("S = ");

        for (int i = 1; i < n; i++) {
            int fact = 1;

            for (int j = 1; j <= (2 * i - 1); j++) {
                fact *= j;
            }

            sum += 1.0 / fact;
            if (i == 1) {
                str.append("1");
            } else {
                str.append(" + 1/").append((2 * i - 1)).append("!");
            }
        }
        System.out.println(str.toString() + " = " + sum);
    }
}
