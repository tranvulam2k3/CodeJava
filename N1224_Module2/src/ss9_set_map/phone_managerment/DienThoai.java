package ss9_set_map.phone_managerment;

import java.math.BigDecimal;
import java.util.Scanner;

public abstract class DienThoai implements Comparable<DienThoai>{
    private String id;
    private String tenDienThoai;
    private BigDecimal giaDienThoai;
    private int timeBaoHanh;
    private String hangSanXuat;

    public DienThoai() {
    }

    public DienThoai(String id, String tenDienThoai, BigDecimal giaDienThoai, int timeBaoHanh, String hangSanXuat) {
        this.id = id;
        this.tenDienThoai = tenDienThoai;
        this.giaDienThoai = giaDienThoai;
        this.timeBaoHanh = timeBaoHanh;
        this.hangSanXuat = hangSanXuat;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("TÊN ĐIỆN THOẠI: ");
        this.tenDienThoai = sc.nextLine();

        System.out.print("GIÁ ĐIỆN THOẠI: ");
        String giaInput = sc.nextLine();
        this.giaDienThoai = new BigDecimal(giaInput);

        System.out.print("THỜI GIAN BẢO HÀNH: ");
        this.timeBaoHanh = Integer.parseInt(sc.nextLine());

        System.out.print("HÃNG ĐIỆN THOẠI: ");
        this.hangSanXuat = sc.nextLine();
    }

    public void output() {
        System.out.println("ID ĐIỆN THOẠI: " + this.id);
        System.out.println("TÊN ĐIỆN THOẠI: " + this.tenDienThoai);
        System.out.println("GIÁ ĐIỆN THOẠI: " + this.giaDienThoai);
        System.out.println("THỜI GIAN BẢO HÀNH: " + this.timeBaoHanh);
        System.out.println("HÃNG ĐIỆN THOẠI: " + this.hangSanXuat);
    }

    public abstract BigDecimal calculateTotalPrice();

    @Override
    public int compareTo(DienThoai o) {
        return this.getGiaDienThoai().compareTo(o.getGiaDienThoai());
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

    public BigDecimal getGiaDienThoai() {
        return giaDienThoai;
    }

    public void setGiaDienThoai(BigDecimal giaDienThoai) {
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
