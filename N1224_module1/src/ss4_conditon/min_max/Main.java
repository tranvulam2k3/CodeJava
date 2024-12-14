package ss4_conditon.min_max;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number A: ");
        int a = sc.nextInt();

        System.out.print("Enter number B: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("MAX :" + a);
        } else {
            System.out.println("MAX :" + b);
        }

        if (a < b) {
            System.out.println("MIN :" + a);
        } else {
            System.out.println("MIN :" + b);
        }
    }
}
