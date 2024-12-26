package ss1_java_overview.exercise2;

public class Main {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo();
        ps1.nhap();

        PhanSo ps2 = new PhanSo();
        ps2.nhap();

        PhanSo tong = ps1.tong(ps2);
        tong.xuat();
    }
}
