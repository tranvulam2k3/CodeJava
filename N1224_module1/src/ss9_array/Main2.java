package ss9_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhap vao so lượng phan tu của mang: ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("k hop le");
            }
        } while (n < 1);

        ArrayList<Integer> arrayList = new ArrayList<>();

        inputArray(arrayList , n);

        outputArray(arrayList);
    }

    static void outputArray(ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + "\t");
        }
    }

    static void inputArray(ArrayList<Integer> arrayList ,int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu a[%d]: ", i);
            arrayList.add(sc.nextInt());
        }
    }
}
