package ss6_method.exercise;


import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Exercise1 {

    public static char toLowerCase(char s) {
//        if (s >= 'A' && s <= 'Z') {
//            s += 32;
//        }
//        return s;
        return (char)(s >= 'A' && s <= 'Z' ? s += 32 : s);
    }

    public static void giaiPTBN(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình vô số nghiệm");
            }
        } else {
            System.out.println("Phương trình có nghiệm là: " + -b / a);
        }
    }

    public static void giaiPTBH(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / 2 * a;
        double x2 = (-b - Math.sqrt(delta)) / 2 * a;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm ");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                System.out.println("Phương trình có nghiệm: " + -c / b);
            }
        } else {
            if (delta == 0) {
                System.out.println("Phương trình có 1 nghiệm kép: " + -b / (2 * a));
            } else if (delta > 0) {
                System.out.println("Phương trình có 2 nghiệm: " + x1 + " và " + x2);
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }

    public static int min(int a, int b, int c, int d) {
        int min = Math.min(a, b);
        min = Math.min(min, c);
        min = Math.min(min, d);
        return min;

    }

//    public static int min(int ...arr) {
//        int min = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            min = Math.min(min, arr[i]);
//        }
//        return min;
//
//    }

    public static void main(String[] args) {
        do {
            System.out.println("========================================");
            System.out.println("Menu");
            System.out.println("1. Chuyen thuong sang hoa");
            System.out.println("2. Giai phuong trinh bac 1");
            System.out.println("3. Giai phuong trinh bac 2");
            System.out.println("4. Min");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chương trình: ");
            int n = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.print("Nhập ký tự: ");
                    char s = scanner.next().charAt(0);

                    char toLowerCase = toLowerCase(s);
                    System.out.println(toLowerCase);
                    break;
                case 2:
                    System.out.print("Nhập a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Nhập b: ");
                    double b = scanner.nextDouble();
                    giaiPTBN(a, b);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Giải phương trình bậc 2");
                    System.out.print("Nhập x: ");
                    double x = scanner.nextDouble();
                    System.out.print("Nhập y: ");
                    double y = scanner.nextDouble();
                    System.out.print("Nhập z: ");
                    double z = scanner.nextDouble();
                    giaiPTBH(x, y, z);
                    break;
                case 4:
                    System.out.print("Số thứ 1: ");
                    int so1 = scanner.nextInt();
                    System.out.print("Số thứ 2: ");
                    int so2 = scanner.nextInt();
                    System.out.print("Số thứ 3: ");
                    int so3 = scanner.nextInt();
                    System.out.print("Số thứ 4: ");
                    int so4 = scanner.nextInt();

                    int min = min(so1, so2, so3, so4);
                    System.out.println("Min: " + min);
                    break;
                default:
                    return;
            }
        } while (true);
    }
}

