package ss4_extends.exercerse;

import java.util.Scanner;

public class DienThoai {
    private String id;
    private String tenDienThoai;
    private double giaDienThoai;
    private int timeBaoHanh;
    private String hangSanXuat;

    public DienThoai() {
    }

    public DienThoai(String id, String tenDienThoai, double giaDienThoai, int timeBaoHanh, String hangSanXuat) {
        this.id = id;
        this.tenDienThoai = tenDienThoai;
        this.giaDienThoai = giaDienThoai;
        this.timeBaoHanh = timeBaoHanh;
        this.hangSanXuat = hangSanXuat;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ten dien thoai: ");
        this.tenDienThoai = sc.nextLine();

        System.out.print("Gia dien thoai: ");
        this.giaDienThoai = Double.parseDouble(sc.nextLine());

        System.out.print("Thoi gian bao hanh: ");
        this.timeBaoHanh = Integer.parseInt(sc.nextLine());

        System.out.print("Hang dien thoai: ");
        this.hangSanXuat = sc.nextLine();
    }

    public void output() {
        System.out.println("Id dien thoai: " + this.id);
        System.out.println("Ten dien thoai: " + this.tenDienThoai);
        System.out.println("Gia dien thoai: " + this.giaDienThoai);
        System.out.println("Thoi gian bao hanh: " + this.timeBaoHanh);
        System.out.println("Hang dien thoai: " + this.hangSanXuat);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDienThoai() {
        return tenDienThoai;
    }

    public void setTenDienThoai(String tenDienThoai) {
        this.tenDienThoai = tenDienThoai;
    }

    public double getGiaDienThoai() {
        return giaDienThoai;
    }

    public void setGiaDienThoai(double giaDienThoai) {
        this.giaDienThoai = giaDienThoai;
    }

    public int getTimeBaoHanh() {
        return timeBaoHanh;
    }

    public void setTimeBaoHanh(int timeBaoHanh) {
        this.timeBaoHanh = timeBaoHanh;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
}
