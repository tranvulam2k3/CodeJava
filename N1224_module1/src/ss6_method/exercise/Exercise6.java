package ss6_method.exercise;

import java.util.Scanner;

public class Exercise6 {
    static String hoTen;
    static String gioiTinh;
    static int tuoi;
    static double mucLuong;
    static double diemTrungBinh;

    static void nhapThongTin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin của bạn");

        System.out.print("Nhập vào tên: ");
        hoTen = sc.nextLine();

        System.out.print("Nhập vào giới tính: ");
        gioiTinh = sc.nextLine();

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
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Mức lương: " + mucLuong);
        System.out.println("Điểm trung bình: " + diemTrungBinh);

    }

    public static void main(String[] args) {
        nhapThongTin();
        xuatThongTin();
    }
}
