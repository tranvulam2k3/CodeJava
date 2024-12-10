package Ss1_Java_Overview.exercise.Question1;

import java.util.Scanner;

public class Q1TinhTuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào năm sinh của bạn :");
        int n = sc.nextInt();

        int namhientai = java.time.Year.now().getValue();

        int tuoi = namhientai - n ;

        System.out.println("Tuổi của bạn là :"+tuoi);
    }
}
