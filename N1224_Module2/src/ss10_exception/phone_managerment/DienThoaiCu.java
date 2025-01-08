package ss10_exception.phone_managerment;

import java.math.BigDecimal;
import java.util.Scanner;

public class DienThoaiCu extends DienThoai implements Discount {
    private int tinhTrangPin;
    private String moTaThem;

    public DienThoaiCu() {
    }

    public DienThoaiCu(String id, String tenDienThoai, BigDecimal giaDienThoai, int timeBaoHanh, String hangSanXuat, int tinhTrangPin, String moTaThem) {
        super(id, tenDienThoai, giaDienThoai, timeBaoHanh, hangSanXuat);
        this.tinhTrangPin = tinhTrangPin;
        this.moTaThem = moTaThem;
    }

    @Override
    public void input() {
        super.input();

        this.tinhTrangPin = PhoneValidation.inputBatteryPercentage("Tình trạng pin (%) ");
        this.moTaThem = PhoneValidation.inputDescription("Mô tả thêm ");
    }

    @Override
    public void output() {
        super.output();
        System.out.println("TÌNH TRẠNG PIN (%): " + this.tinhTrangPin);
        System.out.println("MÔ TẢ THÊM: " + this.moTaThem);
    }

    @Override
    public BigDecimal calculateTotalPrice() {
        return getGiaDienThoai();
    }

    @Override
    public void applyDiscount(BigDecimal discountPercentage) {
        BigDecimal discountFactor = BigDecimal.ONE.subtract(discountPercentage.divide(BigDecimal.valueOf(100)));
        BigDecimal discountedPrice = getGiaDienThoai().multiply(discountFactor);
        setGiaDienThoai(discountedPrice);
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
