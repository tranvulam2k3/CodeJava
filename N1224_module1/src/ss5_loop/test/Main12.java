package ss5_loop.test;

import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n /= 10;
        }
        System.out.println("The product is: " + product);
        System.out.println("The sum is: " + sum);
    }
}
