package final_test;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhâp vào số lượng phần tử của mảng: ");
        n = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        inputArray(list, n);
        for (int i = 0; i < list.size(); i++) {
            if (!checkNguyenTo(list.get(i))) {
                list.remove(i);
            }
        }
        System.out.println("Mảng chứa số nguyên tố: "+list);
    }

    private static void inputArray(ArrayList<Integer> list, int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử mảng [%d]: ", i);
            list.add(scanner.nextInt());
        }
    }

    static boolean checkNguyenTo(int n) {
            if (n < 2) {
                return false;
            }
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    return false;
                }
            }

        return true;
    }

}
