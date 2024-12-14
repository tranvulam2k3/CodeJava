package ss2_conditon.test.equation.lv2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number a: ");
        double a = sc.nextInt();

        System.out.print("Enter number b: ");
        double b = sc.nextInt();

        System.out.print("Enter number c: ");
        double c = sc.nextInt();

        double delta = Math.pow(b, 2) - 4 * a * c;

        double x1, x2;
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has 2 solutions x1: " + x1 + " x2: " + x2);
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("The equation has a double solutions x: " + x1);
        } else {
            System.out.println("Equation with no solution !");
        }

    }
}
