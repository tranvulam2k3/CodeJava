package ss6_method.exercise;

import java.util.Scanner;

public class Exercise4 {
    static int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        if (max % min == 0) {
            return min;
        }

        for (int i = min / 2; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào số nguyên A: ");
        int a = sc.nextInt();
        System.out.print("Nhập vào số nguyên B: ");
        int b = sc.nextInt();

        System.out.printf("Ước số chung của 2 số %d và %d là: %d", a, b, ucln(a, b));
    }
}
