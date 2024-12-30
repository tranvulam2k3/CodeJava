package ss4_extends.exercerse;

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
        System.out.print("Nhap vao so luong: ");
        this.soLuong = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void output() {
        super.output();
        System.out.println("So luong: " + this.soLuong);
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
