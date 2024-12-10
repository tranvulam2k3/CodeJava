package Ss1_Java_Overview.exercise.Question6;

import java.util.Scanner;

public class Q6TongNut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập biển số xe của bạn :");
        int n = sc.nextInt();

        int sum = n % 10;
        n = n / 10 ;

        sum = sum + n % 10;
        n = n / 10 ;

        sum = sum + n % 10;
        n = n / 10 ;

        sum = sum + n % 10;
        n = n / 10 ;

        sum = sum + n;

        System.out.println("Số nút :"+sum);
    }
}
