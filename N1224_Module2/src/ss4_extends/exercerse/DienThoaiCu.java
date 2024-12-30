package ss4_extends.exercerse;

import java.util.Random;
import java.util.Scanner;

public class DienThoaiCu extends DienThoai {
    private int tinhTrangPin;
    private String moTaThem;

    public DienThoaiCu() {
    }

    public DienThoaiCu(String id, String tenDienThoai, double giaDienThoai, int timeBaoHanh, String hangSanXuat, int tinhTrangPin, String moTaThem) {
        super(id, tenDienThoai, giaDienThoai, timeBaoHanh, hangSanXuat);
        this.tinhTrangPin = tinhTrangPin;
        this.moTaThem = moTaThem;
    }

    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        super.input();

        System.out.println("Tinh trang pin (%): ");
        this.tinhTrangPin = Integer.parseInt(input.nextLine());

        System.out.println("MoTa them : ");
        this.moTaThem = input.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Tinh trang pin (%): " + this.tinhTrangPin);
        System.out.println("MoTa them : " + this.moTaThem);
    }

    public int getTinhTrangPin() {
        return tinhTrangPin;
    }

    public void setTinhTrangPin(int tinhTrangPin) {
        this.tinhTrangPin = tinhTrangPin;
    }

    public String getMoTaThem() {
        return moTaThem;
    }

    public void setMoTaThem(String moTaThem) {
        this.moTaThem = moTaThem;
    }
}
