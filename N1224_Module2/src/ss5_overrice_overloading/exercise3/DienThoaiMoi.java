package ss5_overrice_overloading.exercise3;

import java.math.BigDecimal;
import java.util.Scanner;

public class DienThoaiMoi extends DienThoai {
    private int soLuong;

    public DienThoaiMoi() {
    }

    public DienThoaiMoi(String id, String tenDienThoai, double giaDienThoai, int timeBaoHanh, String hangSanXuat, int soLuong) {
        super(id, tenDienThoai, giaDienThoai, timeBaoHanh, hangSanXuat);
        this.soLuong = soLuong;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("NHẬP SỐ LƯỢNG: ");
        this.soLuong = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void output() {
        super.output();
        System.out.println("SỐ LƯỢNG: " + this.soLuong);
    }

    @Override
    public double calculateTotalPrice() {
        return getGiaDienThoai() * this.soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
