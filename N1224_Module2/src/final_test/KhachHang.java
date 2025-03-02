package final_test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KhachHang extends GoiBaoHiem{
    private String hoTen;
    private LocalDate ngaySinh;
    private String noiCuTru;
    private String soCMT;


    public KhachHang() {
    }

    public KhachHang(String tenGoiBaoHiem, String thoiHanDong, double mucPhiDong, String mucDich, String cachThucDong, LocalDate thoiGianBatDau, String hoTen, LocalDate ngaySinh, String noiCuTru, String soCMT) {
        super(tenGoiBaoHiem, thoiHanDong, mucPhiDong, mucDich, cachThucDong, thoiGianBatDau);
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.noiCuTru = noiCuTru;
        this.soCMT = soCMT;
    }

    public void nhapKhachHang() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ho ten khach hang: ");
        hoTen = sc.nextLine();

        System.out.print("Nhap ngay sinh: ");
        ngaySinh = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("Nhap noi cu tru: ");
        noiCuTru = sc.nextLine();

        System.out.print("Nhap so cmt : ");
        soCMT = sc.nextLine();

    }

    public void xuatKhachHang() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Noi cu tru: " + noiCuTru);
        System.out.println("So cmt : " + soCMT);
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNoiCuTru() {
        return noiCuTru;
    }

    public void setNoiCuTru(String noiCuTru) {
        this.noiCuTru = noiCuTru;
    }

    public String getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }
}
