package final_test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BaoHiemSinhKy extends GoiBaoHiem{
    private LocalDate thoiGianKetThuc;
    private String thoiGianTroCap;

    public BaoHiemSinhKy() {
    }

    public void nhapBaoHiemSinhKy() {
        Scanner sc = new Scanner(System.in);
        super.nhapBaoHiem();
        System.out.println("Thoi Gian tro cap(bao gồm: trợ cấp trong khoản thời gian xác định hoặc cho đến khi mất).: ");
        thoiGianTroCap = sc.nextLine();
        if(getThoiHanDong() == null){
            System.out.print("Thoi gian Ket Thuc: ");
        }else{
            System.out.print("Thoi gian Ket Thuc: ");
            thoiGianKetThuc = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }
    }

    public void xuatThongTinBaoHiemTuVong() {
        super.xuatBaoHiem();
        if(getThoiHanDong() == null){
            System.out.print("Thoi gian Ket Thuc: null");
        }else{
            System.out.print("Thoi gian Ket Thuc: " + thoiGianKetThuc.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }
        System.out.print("Thoi Gian tro cap: " + thoiGianTroCap);
    }

    public BaoHiemSinhKy(String tenGoiBaoHiem, String thoiHanDong, double mucPhiDong, String mucDich, String cachThucDong, LocalDate thoiGianBatDau, LocalDate thoiGianKetThuc, String thoiGianTroCap) {
        super(tenGoiBaoHiem, thoiHanDong, mucPhiDong, mucDich, cachThucDong, thoiGianBatDau);
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.thoiGianTroCap = thoiGianTroCap;
    }

    public LocalDate getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(LocalDate thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getThoiGianTroCap() {
        return thoiGianTroCap;
    }

    public void setThoiGianTroCap(String thoiGianTroCap) {
        this.thoiGianTroCap = thoiGianTroCap;
    }
}
