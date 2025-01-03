package ss5_overrice_overloading.exercise2;

public class Main {
    public static void main(String[] args) {
        HocVien hocVien1 = new HocVien();
        HocVien hocVien2 = (SinhVien) hocVien1;
        ChuyenVien hocVien3 = (ChuyenVien) hocVien2;
        NVChinhThuc hocVien4 = hocVien3;
        HocVien hocVien5 = hocVien3;
        HocVien hocVien6 = (HocVien) hocVien2;
        HocVien hocVien7 = (NVQuanLy) hocVien6;
        NVChinhThuc hocVien8 = (NVChinhThuc) hocVien7;
        //       SinhVien hocVien9 = (SinhVien) hocVien3;
    }
}
