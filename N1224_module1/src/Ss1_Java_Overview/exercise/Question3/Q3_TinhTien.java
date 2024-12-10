package Ss1_Java_Overview.exercise.Question3;

import java.util.Scanner;

public class Q3_TinhTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tên sản phẩm : ");
        String tensanpham = sc.nextLine();

        System.out.println("Số lượng : ");
        int sl = sc.nextInt();

        System.out.println("Đơn giá : ");
        int dg = sc.nextInt();

        double thanhtien = sl * dg;
        double thue = 0.1 * thanhtien;

        System.out.println("Tên sản phẩm là :" +tensanpham);
        System.out.println("Thành tiền :" +thanhtien);
        System.out.println("Thuế :" +thue);

    }
}
