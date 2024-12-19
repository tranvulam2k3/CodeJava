package ss7_debug_string.exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào chuỗi a: ");
        String a = sc.nextLine();

        System.out.print("Nhập vào chuỗi b: ");
        String b = sc.nextLine();

        int compare = a.compareTo(b);
        if (compare < 0) {
            System.out.println("a < b");
        } else if (compare == 0) {
            System.out.println("a = b");
        } else {
            System.out.println("a > b");
        }
    }
}
