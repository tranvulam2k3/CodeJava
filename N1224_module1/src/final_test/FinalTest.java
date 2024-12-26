package final_test;

import java.util.ArrayList;
import java.util.Scanner;

public class FinalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j >= i; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i * 2 - 1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        int[] arr = new int[n];
//
//        inputArray(arr, sc);
//        System.out.println("Tong cac so chan trong mang la: " + sumChan(arr));
//        System.out.println("Tong cac so le trong mang la: " + sumLe(arr));

        System.out.print("Nhập vào 1 chuỗi: ");
        String str = sc.nextLine();
        if (demInHoa(str) != 0) {
            System.out.println(demInHoa(str));
        } else {
            System.out.println("Chuỗi k chứa kí tự in hoa");
        }

    }

    static void inputArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap vao phan tu a[%d]: ", i);
            arr[i] = sc.nextInt();
        }
    }

    static int sumChan(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                sum += j;
            }
        }
        return sum;
    }

    static int sumLe(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                sum += j;
            }
        }
        return sum;
    }

    static int demInHoa(String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (checkInHoa(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    static boolean checkInHoa(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }


}
