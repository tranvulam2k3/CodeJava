package ss1_java_overview.exercise;

import java.util.Scanner;

public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao tu: ");
        tu = sc.nextInt();

        do {
            System.out.print("Nhap vao mau: ");
            mau = sc.nextInt();
        }while(mau == 0);
    }

    public void rutgon(){
        int ucln = uocchunglonnhat(tu, mau);
        tu /= ucln;
        mau /= ucln;

        if(mau<0){
            tu = -tu;
            mau = -mau;
        }

    }
    public int uocchunglonnhat(int a, int b){
        if(a == 0 || b == 0){
            return 1;
        }
        a = Math.abs(a);

        for(int i = a ; i>=1 ; i--){
            if(a%i == 0 && b%i == 0){
                return i;
            }
        }
        return 1;
    }

    public void xuat(){
        rutgon();
        if(mau == 1){
            System.out.println(tu);
        }else {
            System.out.println(tu + "/" + mau);
        }
    }

    public PhanSo tong(PhanSo ps){
        PhanSo tong = new PhanSo();
        tong.tu = this.tu * ps.mau + this.mau * ps.tu;
        tong.mau = this.mau * ps.mau;

        return tong;
    }
}
