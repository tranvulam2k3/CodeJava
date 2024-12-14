package ss4_conditon.test.square_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        double squareRoot = Math.sqrt(num);

        if (squareRoot % 1 == 0) {
            System.out.printf("The number of %d is a square root", num);
        } else {
            System.out.printf("The number of %d is not a square root", num);
        }
    }
}
