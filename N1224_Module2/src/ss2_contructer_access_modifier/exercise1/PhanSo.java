package ss2_contructer_access_modifier.exercise1;

public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
        tu = 0;
        mau = 1;
    }

    public PhanSo(int tu) {
        this.tu = tu;
        mau = 1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
        rutGon();
    }

    private void rutGon() {
        int ucln = uocChungLonNhat(tu, mau);
        tu /= ucln;
        mau /= ucln;

        if (mau < 0) {
            tu = -tu;
            mau = -mau;
        }
    }

    private int uocChungLonNhat(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }
        a = Math.abs(a);

        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public void xuat() {
        if (mau == 1) {
            System.out.println(tu);
        } else {
            System.out.println(tu + "/" + mau);
        }
    }

    public PhanSo coppy() {
        return new PhanSo(tu, mau);
    }

    public void cong(int value) {
        tu += value * mau;
        rutGon();
    }
}
