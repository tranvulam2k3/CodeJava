package ss9_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap vao so lượng phan tu của mang: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("k hop le");
            }
        } while (n < 1);

        int[] arr = new int[n];

        inputArray(arr, sc);

        outputArray(n, arr);

        checkMangChan(arr);
        if (checkMangChan(arr)) {
            System.out.println("mang toan chan");
        } else {
            System.out.println("mang khong chan");
        }


    }

    static boolean checkMangChan(int[] arr) {
        boolean checkMangChan = true;
        for (int j : arr) {
            if (j % 2 != 0) {
                checkMangChan = false;
            }
        }
        return checkMangChan;

    }


    static void outputArray(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    static void inputArray(int[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhap vao phan tu a[%d]: ", i);
            arr[i] = sc.nextInt();
        }
    }


}
