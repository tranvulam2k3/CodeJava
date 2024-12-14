package ss5_loop.test;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        double sum = 0.0;
        StringBuilder str = new StringBuilder("S = ");

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            if (i == 1) {
                str.append("1");
            } else {
                str.append(" + 1/").append(i);
            }
        }

        System.out.println(str.toString() + " = " + sum);
    }
}
