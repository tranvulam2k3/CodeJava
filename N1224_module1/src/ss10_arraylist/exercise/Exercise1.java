package ss10_arraylist.exercise;

import java.util.*;

public class Exercise1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập n: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Nhập vào số nguyên dương (n > 0) ");
            }
        } while (n <= 0);

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập vào phần tử thứ %d: ", i + 1);
            arr.add(scanner.nextInt());
        }

        System.out.println("Các phần tử trong danh sách: " + arr);

        System.out.println("Số lượng phần tử lẻ: " + countOddNumbers(arr));

        System.out.println("Tổng số dương lẻ: " + sumOddNumbers(arr));

        System.out.print("Nhập vào giá trị k: ");
        int k = scanner.nextInt();

        ArrayList<Integer> indices = locationOfK(arr, k);

        if (indices.isEmpty()) {
            System.out.println("Không tìm thấy phần tử k.");
        } else {
            System.out.println("Các vị trí xuất hiện: " + indices);
        }

        Collections.sort(arr);
        System.out.println("Danh sách sau khi sắp xếp tăng dần: " + arr);

        Collections.reverse(arr);
        System.out.println("Danh sách sau khi đảo ngược: " + arr);

        System.out.print("Nhập vào phần tử x bạn muốn xóa: ");
        int x = scanner.nextInt();
        arr.removeAll(Arrays.asList(x));
        System.out.println("Danh sách sau khi xóa: " + arr);

        System.out.print("Nhập vào giá trị muốn chèn: ");
        int value = scanner.nextInt();
        System.out.print("Nhập vào vị trí muốn chèn: ");
        int index = scanner.nextInt();
        if (index >= 0 && index <= arr.size()) {
            arr.add(index, value);
        }
        System.out.println("Danh sách sau khi chèn: " + arr);

        System.out.println("Giá trị lớn nhất: " + Collections.max(arr));

        System.out.println("Giá trị nhỏ nhất: " + Collections.min(arr));

        arr.removeAll(Arrays.asList(Collections.max(arr)));
        System.out.println("Giá trị lớn nhì: " + arr.get(0));
    }

    public static int countOddNumbers(ArrayList<Integer> a) {
        int count = 0;
        for (int item : a) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int sumOddNumbers(ArrayList<Integer> a) {
        int total = 0;
        for (int item : a) {
            if (item > 0 && item % 2 != 0) {
                total += item;
            }
        }
        return total;
    }

    public static ArrayList<Integer> locationOfK(ArrayList<Integer> a, int k) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == k) {
                indices.add(i);
            }
        }
        return indices;
    }
}