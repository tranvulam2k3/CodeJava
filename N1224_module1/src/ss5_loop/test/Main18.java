package ss5_loop.test;

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        //Tính tổng giai thừa 3 số nguyên dương
        Scanner sc = new Scanner(System.in);

        int x, y, z;
        int factA = 1, factB = 1, factC = 1;

        do {
            System.out.println("Nhập số nguyên x: ");
            x = sc.nextInt();

            if (x <= 0) {
                System.out.println("Vui lòng nhập số nguyên dương, xin vui lòng nhập lại");
            }
        } while (x <= 0);

        do {
            System.out.println("Nhập số nguyên y: ");
            y = sc.nextInt();

            if (y <= 0) {
                System.out.println("Vui lòng nhập số nguyên dương, xin vui lòng nhập lại");
            }
        } while (y <= 0);

        do {
            System.out.println("Nhập số nguyên z: ");
            z = sc.nextInt();

            if (z <= 0) {
                System.out.println("Vui lòng nhập số nguyên dương, xin vui lòng nhập lại");
            }
        } while (z <= 0);

        for (int i = 1; i <= x; i++) {
            factA *= i;
        }
        for (int i = 1; i <= y; i++) {
            factB *= i;
        }
        for (int i = 1; i <= z; i++) {
            factC *= i;
        }
        int sum = factA + factB + factC;
        System.out.printf("Tổng giai thừa của 3 số nguyên dương %d! + %d! + %d! = %d", x, y, z, sum);
    }
}
