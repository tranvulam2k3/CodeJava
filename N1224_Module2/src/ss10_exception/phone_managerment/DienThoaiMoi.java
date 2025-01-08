package ss10_exception.phone_managerment;

import java.math.BigDecimal;
import java.util.Scanner;

public class DienThoaiMoi extends DienThoai {
    private double soLuong;

    public DienThoaiMoi() {
    }

    public DienThoaiMoi(String id, String tenDienThoai, BigDecimal giaDienThoai, int timeBaoHanh, String hangSanXuat, double soLuong) {
        super(id, tenDienThoai, giaDienThoai, timeBaoHanh, hangSanXuat);
        this.soLuong = soLuong;
    }

    @Override
    public void input() {
        super.input();
        this.soLuong = PhoneValidation.inputQuantity("Số lượng ");
    }

    @Override
    public void output() {
        super.output();
        System.out.println("SỐ LƯỢNG: " + this.soLuong);
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        return getGiaDienThoai().multiply(BigDecimal.valueOf(this.soLuong));
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
