package ss5_loop.test;

import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int a = sc.nextInt(); //12

        System.out.print("Enter number B: ");
        int b = sc.nextInt(); //18

        int ucln = 1; //ucln là 1 số: nghĩa là số đó sẽ chia hết cho tất cả các số ước
        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
                break;
            }
        }

        int bcnn;
        for (int i = a; true; i++) {
            if (i % a == 0 && i % b == 0) {
                bcnn = i;
                break;
            }
        }

        System.out.printf("UCNN %d : %d is %d", a, b, ucln);
        System.out.printf("\nBCNN %d : %d is %d", a, b, bcnn);
    }
}
