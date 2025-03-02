package final_test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class GoiBaoHiem {
    private String tenGoiBaoHiem;
    private String thoiHanDong;
    private double mucPhiDong;
    private String mucDich;
    private String cachThucDong;
    private LocalDate thoiGianBatDau;

    public GoiBaoHiem() {
    }

    public void nhapBaoHiem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten bao hiem: ");
        tenGoiBaoHiem = sc.nextLine();

        System.out.print("Nhap thoi han dong bao hiem: ");
        thoiHanDong = sc.nextLine();

        System.out.print("Nhap muc phi dong: ");
        mucPhiDong = Double.parseDouble(sc.nextLine());

        System.out.print("Nhap muc dich: ");
        mucDich = sc.nextLine();

        System.out.print("Nhap cach thuc dong(đóng một lần hoặc đóng theo tháng): ");
        cachThucDong = sc.nextLine();

        System.out.print("Nhap thoi gian bat: ");
        thoiGianBatDau = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void xuatBaoHiem() {
        System.out.println("Ten bao hiem: " + tenGoiBaoHiem);
        System.out.println("Thoi han dong bao hiem: " + thoiHanDong);
        System.out.println("muc phi dong: " + mucPhiDong);
        System.out.println("muc dich: " + mucDich);
        System.out.println("Cach thuc dong: " + cachThucDong);
        System.out.println("Thoi gian bat: " + thoiGianBatDau.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public GoiBaoHiem(String tenGoiBaoHiem, String thoiHanDong, double mucPhiDong, String mucDich, String cachThucDong, LocalDate thoiGianBatDau) {
        this.tenGoiBaoHiem = tenGoiBaoHiem;
        this.thoiHanDong = thoiHanDong;
        this.mucPhiDong = mucPhiDong;
        this.mucDich = mucDich;
        this.cachThucDong = cachThucDong;
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public String getTenGoiBaoHiem() {
        return tenGoiBaoHiem;
    }

    public void setTenGoiBaoHiem(String tenGoiBaoHiem) {
        this.tenGoiBaoHiem = tenGoiBaoHiem;
    }

    public LocalDate getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(LocalDate thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public String getThoiHanDong() {
        return thoiHanDong;
    }

    public void setThoiHanDong(String thoiHanDong) {
        this.thoiHanDong = thoiHanDong;
    }

    public double getMucPhiDong() {
        return mucPhiDong;
    }

    public void setMucPhiDong(double mucPhiDong) {
        this.mucPhiDong = mucPhiDong;
    }

    public String getMucDich() {
        return mucDich;
    }

    public void setMucDich(String mucDich) {
        this.mucDich = mucDich;
    }

    public String getCachThucDong() {
        return cachThucDong;
    }

    public void setCachThucDong(String cachThucDong) {
        this.cachThucDong = cachThucDong;
    }
}
