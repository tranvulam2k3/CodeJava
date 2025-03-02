package final_test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BaoHiemHopDong extends GoiBaoHiem {
    private LocalDate thoiGianKetThuc;
    private String sanPhamDiKem;

    public BaoHiemHopDong() {
    }

    public BaoHiemHopDong(String tenGoiBaoHiem, String thoiHanDong, double mucPhiDong, String mucDich, String cachThucDong, LocalDate thoiGianBatDau, LocalDate thoiGianKetThuc, String sanPhamDiKem) {
        super(tenGoiBaoHiem, thoiHanDong, mucPhiDong, mucDich, cachThucDong, thoiGianBatDau);
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.sanPhamDiKem = sanPhamDiKem;
    }

    public void nhapBaoHiemHopDong() {
        Scanner sc = new Scanner(System.in);
        super.nhapBaoHiem();
        System.out.print("Nhap thoi gian ket thuc: ");
        thoiGianKetThuc = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("San Pham Di Kem(bao gồm: bệnh hiểm nghèo, trợ cấp nằm viện và bảo hiểm thương tật vĩnh viễn).: ");
        sanPhamDiKem = sc.nextLine();
    }

    public void xuatBaoHiemHopDong() {
        super.xuatBaoHiem();
        System.out.print("Thoi gian ket thuc: " + thoiGianKetThuc);
        System.out.println("San Pham Di Kem: " + sanPhamDiKem);
    }

    public LocalDate getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(LocalDate thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getSanPhamDiKem() {
        return sanPhamDiKem;
    }

    public void setSanPhamDiKem(String sanPhamDiKem) {
        this.sanPhamDiKem = sanPhamDiKem;
    }
}
