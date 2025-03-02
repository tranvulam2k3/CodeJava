package final_test;

import java.time.LocalDate;
import java.util.Scanner;

public class BaoHiemTuVong extends GoiBaoHiem {
    private String truongHopDong;
    private String thoiGianToiThieuThamGia;

    public BaoHiemTuVong() {
    }

    public void nhapBaoHiemTuVong() {
        Scanner sc = new Scanner(System.in);
        super.nhapBaoHiem();
        System.out.println("Truong hop dong(Trường hợp tử kỳ - người không còn sống - Trường hợp trọn đời): ");
        truongHopDong = sc.nextLine();
        System.out.println("Thoi Gian Toi Thieu Tham Gia: ");
        thoiGianToiThieuThamGia = sc.nextLine();
    }

    public void xuatThongTinBaoHiemTuVong() {
        super.xuatBaoHiem();
        System.out.println("Truong hop dong: " + truongHopDong);
        System.out.println("Thoi Gian Toi Thieu Tham Gia: " + thoiGianToiThieuThamGia);
    }

    public BaoHiemTuVong(String tenGoiBaoHiem, String thoiHanDong, double mucPhiDong, String mucDich, String cachThucDong, LocalDate thoiGianBatDau, String truongHopDong, String thoiGianToiThieuThamGia) {
        super(tenGoiBaoHiem, thoiHanDong, mucPhiDong, mucDich, cachThucDong, thoiGianBatDau);
        this.truongHopDong = truongHopDong;
        this.thoiGianToiThieuThamGia = thoiGianToiThieuThamGia;
    }

    public String getTruongHopDong() {
        return truongHopDong;
    }

    public void setTruongHopDong(String truongHopDong) {
        this.truongHopDong = truongHopDong;
    }

    public String getThoiGianToiThieuThamGia() {
        return thoiGianToiThieuThamGia;
    }

    public void setThoiGianToiThieuThamGia(String thoiGianToiThieuThamGia) {
        this.thoiGianToiThieuThamGia = thoiGianToiThieuThamGia;
    }
}
