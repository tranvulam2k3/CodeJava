package ss5_loop.test;

import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Giá tiền hàng hóa: ");
        int giaBanDo = scanner.nextInt();

        System.out.print("Tiền khách đưa: ");
        int tienKhachHangTra = scanner.nextInt();

        int tienThoiLai = tienKhachHangTra - giaBanDo;
        int menhGiaTien;
        System.out.println("Số tiền còn lại là: " + tienThoiLai);

        for (int i = 2; i >= 0; i--) {
            int heSo = (int) Math.pow(10, i);

            menhGiaTien = 5000 * heSo;
            if (tienThoiLai >= menhGiaTien) {
                System.out.printf("%d tờ %d\n", tienThoiLai / menhGiaTien, menhGiaTien);
                tienThoiLai %= menhGiaTien;
            }

            menhGiaTien = 2000 * heSo;
            if (tienThoiLai >= menhGiaTien) {
                System.out.printf("%d tờ %d\n", tienThoiLai / menhGiaTien, menhGiaTien);
                tienThoiLai %= menhGiaTien;
            }
            menhGiaTien = 1000 * heSo;
            if (tienThoiLai >= menhGiaTien) {
                System.out.printf("%d tờ %d\n", tienThoiLai / menhGiaTien, menhGiaTien);
                tienThoiLai %= menhGiaTien;
            }
        }
    }
}
