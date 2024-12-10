package Ss1_Java_Overview.exercise.Question4;

import java.util.Scanner;

public class Q4TinhDiemTrungBinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập điểm toán :");
        double diemToan = sc.nextDouble();
        System.out.print("Nhập hệ số toán :");
        double hsToan = sc.nextDouble();

        System.out.print("Nhập điểm lý :");
        double diemLy = sc.nextDouble();
        System.out.print("Nhập hệ số lý :");
        double hsLy = sc.nextDouble();

        System.out.print("Nhập điểm anh :");
        double diemAnh = sc.nextDouble();
        System.out.print("Nhập hệ số anh :");
        double hsAnh = sc.nextDouble();

        double diemtrungbinh = (diemToan * hsToan + diemLy * hsLy + diemAnh * hsAnh) /
                                (hsToan + hsLy + hsAnh);

        System.out.println("Điểm trung bình :" + diemtrungbinh);
    }
}
