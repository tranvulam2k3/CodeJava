package ss6_method.exercise;

import java.util.Scanner;

public class Exercise2 {

    public static int daoSo(int n) {
        int a = 0;
        while (n != 0) {
            int digit = n % 10;
            a = a * 10 + digit;
            n /= 10;
        }
        return a;
    }

    public static boolean soDoiXung(int number) {
        String str = String.valueOf(number);
        boolean isSoDoiXung = true;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                System.out.println("Không phải số đối xứng");
                isSoDoiXung = false;
                break;
            }
        }
        if (isSoDoiXung) {
            System.out.println("Đây là số đối xứng");
        }
        return isSoDoiXung;
    }

    public static boolean soChinhPhuong(int number) {
        return Math.sqrt(number) % 1 == 0;
    }

    static boolean soNguyenTo(int number) {
        boolean isSoNguyenTo = true;
        for (int i = 1; i <= number; i++) {
            if (number < 2) {
                isSoNguyenTo = false;
                break;
            }
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    isSoNguyenTo = false;
                    break;
                }
            }
            if (isSoNguyenTo) {
            }
        }
        return isSoNguyenTo;
    }

    static int sumSoLe(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static int tongSoNguyenTo(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (soNguyenTo(digit)) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    static int tongSoChinhPhuong(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (soChinhPhuong(digit)) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        do {
            System.out.println("========================================");
            System.out.println("Menu");
            System.out.println("1. Đảo số");
            System.out.println("2. Số đối xứng");
            System.out.println("3. Số chính phương");
            System.out.println("4. Số nguyên tố");
            System.out.println("5. Số lẻ");
            System.out.println("6. Tổng các số nguyên tố");
            System.out.println("7. Tổng các số Chính phương");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chương trình: ");
            int n = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.print("Nhập số đảo: ");
                    int sodao = scanner.nextInt();
                    System.out.println("Đảo số:" + daoSo(sodao));
                    break;
                case 2:
                    System.out.print("Nhập số đối xứng: ");
                    int sds = scanner.nextInt();
                    soDoiXung(sds);
                    break;
                case 3:
                    System.out.print("Nhập số chính phương: ");
                    int scp = scanner.nextInt();
                    boolean soChinhPhuong = soChinhPhuong(scp);
                    if (soChinhPhuong == true) {
                        System.out.println(scp + " là số chính phương");
                    } else {
                        System.out.println(scp + " không phải là số chính phương");
                    }
                    break;
                case 4:
                    System.out.print("Nhập số nguyên tố: ");
                    int snt = scanner.nextInt();
                    boolean soNguyenTo = soNguyenTo(snt);
                    if (soNguyenTo == true) {
                        System.out.println(snt + " là số nguyên tố");
                    } else {
                        System.out.println(snt + " không phải là số nguyên tố");
                    }
                    break;
                case 5:
                    System.out.println("Nhập vào 1 số: ");
                    int so1 = scanner.nextInt();
                    int sum = sumSoLe(so1);
                    System.out.println("Tổng lẻ là: " + sum);
                case 6:
                    System.out.println("Nhập vào 1 số: ");
                    int so2 = scanner.nextInt();
                    int sumNT = tongSoNguyenTo(so2);
                    System.out.println("Tổng số nguyên tố là: " + sumNT);
                    break;
                case 7:
                    System.out.println("Nhập vào 1 số: ");
                    int so3 = scanner.nextInt();
                    int sumCP = tongSoChinhPhuong(so3);
                    System.out.println("Tổng số chinhs phương là: " + sumCP);
                default:
                    return;
            }
        } while (true);
    }
}