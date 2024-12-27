package ss2_contructer_access_modifier.exercise2;

public class KiemTraThoiGian {
    public static void main(String[] args) {
        ThoiGian a = new ThoiGian();
        a.output();

        ThoiGian b = new ThoiGian(6);
        b.output();

        ThoiGian c = new ThoiGian(7, 30);
        c.output();

        ThoiGian d = new ThoiGian(7, 3, 23);
        d.output();

        ThoiGian e = new ThoiGian(d);
        e.output();
    }
}
