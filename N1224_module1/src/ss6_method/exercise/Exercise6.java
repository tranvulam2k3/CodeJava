package ss6_method.exercise;

import java.util.Scanner;

public class Exercise6 {
    static String hoTen;
    static boolean isMale = true;
    static int tuoi;
    static double mucLuong;
    static double diemTrungBinh;

    static void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin của bạn");

        System.out.print("Nhập vào tên: ");
        hoTen = sc.nextLine();

        int choose;
        do {
            System.out.println("=== Gioi Tinh ===");
            System.out.println("1.Nam");
            System.out.println("2.Nu");

            System.out.println("Moi ban chon gioi tinh: ");
            choose = sc.nextInt();

            if (choose != 1 && choose != 2) {
                System.out.println("Lua chon k hop le , vui long nhap lai!");
            }
        } while (choose != 1 && choose != 2);

        boolean isMale = choose == 1;


        System.out.print("Nhập vào tuổi: ");
        tuoi = sc.nextInt();

        System.out.print("Nhập vào mức lương: ");
        mucLuong = sc.nextDouble();

        System.out.print("Nhập vào điểm trung bình: ");
        diemTrungBinh = sc.nextDouble();
    }

    static void xuatThongTin() {
        System.out.println("========================");
        System.out.println("Thông tin của bạn là");
        System.out.println("Tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Giới tính: " + (isMale ? "Male" : "Female"));
        System.out.println("Mức lương: " + mucLuong);
        System.out.println("Điểm trung bình: " + diemTrungBinh);

    }

    public static void main(String[] args) {
        nhapThongTin();
        xuatThongTin();
    }
}
