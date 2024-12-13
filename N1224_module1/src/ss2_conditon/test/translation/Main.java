package ss2_conditon.test.translation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so 1 den 10: ");
        int n = sc.nextInt();

        String englishNumber;
        //cach 1
        if (n == 1) {
            englishNumber = "One";
        } else if (n == 2) {
            englishNumber = "Two";
        } else if (n == 3) {
            englishNumber = "Three";
        } else if (n == 4) {
            englishNumber = "Four";
        } else if (n == 5) {
            englishNumber = "Five";
        } else if (n == 6) {
            englishNumber = "Six";
        } else if (n == 7) {
            englishNumber = "Seven";
        } else if (n == 8) {
            englishNumber = "Eight";
        } else if (n == 9) {
            englishNumber = "Nine";
        } else if (n == 10) {
            englishNumber = "Ten";
        } else {
            englishNumber = "Khong hop le";
        }



        System.out.println("tieng anh cua so " + n + ": " + englishNumber);
    }
}
