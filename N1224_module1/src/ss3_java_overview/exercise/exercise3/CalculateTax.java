package ss3_java_overview.exercise.exercise3;

import java.util.Scanner;

public class CalculateTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tên sản phẩm : ");
        String tenSanPham = sc.nextLine();

        System.out.print("Số lượng : ");
        int sl = sc.nextInt();

        System.out.print("Đơn giá : ");
        int dg = sc.nextInt();

        double thanhTien = sl * dg;
        double thue = 0.1 * thanhTien;

        System.out.println("Tên sản phẩm là :" + tenSanPham);
        System.out.println("Thành tiền :" + thanhTien);
        System.out.println("Thuế :" + thue);

    }
}
