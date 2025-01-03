package ss5_overrice_overloading.exercise1;

public class Main {
    public static void main(String[] args) {
        //override
        HocVien hv = new SinhVien();
        hv.a();
        ((SinhVien)hv).b();

        HocVien hv2 = new HocSinh();
        hv2.a();

        //overloading
        HocVien hv3 = new HocVien();
        hv3.c(1,2);
        hv3.d(1,4,5);
        hv3.e(5,6,7,8);
    }
}
