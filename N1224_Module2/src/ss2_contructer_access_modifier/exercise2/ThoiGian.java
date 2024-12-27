package ss2_contructer_access_modifier.exercise2;

public class ThoiGian {
    private int gio;
    private int phut;
    private int giay;

    public ThoiGian() {
        gio = 0;
        phut = 0;
        giay = 0;
    }

    public ThoiGian(int gio) {
        this.gio = gio;
        phut = 0;
        giay = 0;
    }

    public ThoiGian(int gio, int phut) {
        this.gio = gio;
        this.phut = phut;
        giay = 0;
    }

    public ThoiGian(int gio, int phut, int giay) {
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public ThoiGian(ThoiGian thoiGian) {
        this.gio = thoiGian.gio;
        this.phut = thoiGian.phut;
        this.giay = thoiGian.giay;
    }

    public void output() {
        System.out.printf("%02d:%02d:%02d\n", gio, phut, giay);
    }
}
