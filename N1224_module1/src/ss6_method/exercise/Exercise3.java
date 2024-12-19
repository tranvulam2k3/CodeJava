package ss6_method.exercise;

import java.util.Scanner;

public class Exercise3 {

    static int calSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static int calSumTotal(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    static double calSumFractions(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    static int calMultiply(int n) {
        int Multiply = 1;
        for (int i = 1; i <= n; i++) {
            Multiply *= i;
        }
        return Multiply;
    }

    static int sumFactorial(int n) {
        int sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            sum += fact;
        }
        return sum;


    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Nhập n: ");
        int n = s.nextInt();

        System.out.println("Câu a: ");
        System.out.println("Kết quả: " + calSum(n));

        System.out.println("Câu b: ");
        System.out.println("Kết quả: " + calSumTotal(n));

        System.out.println("Câu c: ");
        System.out.println("Kết quả: " + calSumFractions(n));

        System.out.println("Câu d: ");
        System.out.println("Kết quả: " + calMultiply(n));

        System.out.println("Câu e: ");
        System.out.println("Kết quả: " + sumFactorial(n));
    }
}
