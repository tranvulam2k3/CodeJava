package ss9_array.exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("n phải lớn hơn 0");
            }
        } while (n <= 0);

        int[] arr = new int[n];
        inputArray(arr);
        System.out.print("Mảng vừa nhập là: ");
        printArray(arr);

        // Checking properties
        System.out.println(ktrChan(arr) ? "\nMảng toàn số chẵn" : "\nMảng không toàn số chẵn");
        System.out.println(checkSoNguyenTo(arr) ? "\nMảng toàn số nguyên tố" : "\nMảng không toàn số nguyên tố");
        System.out.println(checkTangDan(arr) ? "\nMảng tăng dần" : "\nMảng không tăng dần");

        // Calculations
        System.out.println("Tổng các số dương lẻ trong mảng: " + sumOddPositive(arr));
        System.out.println("Số lượng phần tử chia hết cho 4 nhưng không chia hết cho 5: " + countDivisibleBy4Not5(arr));
        System.out.println("Tổng các phần tử trong mảng: " + sumArray(arr));

        // Searching
        int x;
        System.out.print("Nhập x: ");
        x = sc.nextInt();
        System.out.printf("Vị trí cuối cùng của %d là: %d\n", x, findLastX(arr, x));
        System.out.println("Vị trí số nguyên tố đầu tiên: " + findFirstPrimeIndex(arr));
        System.out.println("Số dương nhỏ nhất trong mảng: " + (findSmallestPositive(arr) != -1 ? findSmallestPositive(arr) : "Không có số dương"));

        int k;
        System.out.print("Nhập k: ");
        k = sc.nextInt();
        checkOccurrences(arr, k);

        System.out.println("Giá trị lớn nhất trong mảng: " + findMax(arr));
        System.out.println("Giá trị nhỏ nhất trong mảng: " + findMin(arr));
    }

    public static void inputArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static boolean ktrChan(int[] arr) {
        for (int item : arr) {
            if (item % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumOddPositive(int[] arr) {
        int sum = 0;
        for (int item : arr) {
            if (item > 0 && item % 2 != 0) {
                sum += item;
            }
        }
        return sum;
    }

    public static boolean checkSoNguyenTo(int[] arr) {
        for (int item : arr) {
            if (!isPrime(item)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countDivisibleBy4Not5(int[] arr) {
        int count = 0;
        for (int item : arr) {
            if (item % 4 == 0 && item % 5 != 0) {
                count++;
            }
        }
        return count;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        return sum;
    }

    public static int findLastX(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1; // Not found
    }

    public static int findFirstPrimeIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                return i;
            }
        }
        return -1; // Not found
    }

    public static int findSmallestPositive(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int item : arr) {
            if (item > 0 && item < min) {
                min = item;
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void checkOccurrences(int[] arr, int k) {
        boolean found = false;
        System.out.print("Các vị trí của " + k + " trong mảng: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("Không tìm thấy");
        }
        System.out.println();
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int item : arr) {
            if (item > max) {
                max = item;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int item : arr) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }

    public static boolean checkTangDan(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}