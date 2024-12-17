package ss5_loop.test;

import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a: ");
        int a = scanner.nextInt();

        System.out.println("Nhập b: ");
        int b = scanner.nextInt();

        boolean isSoDoiXung = true, isSoNguyenTo = true, isSoChinhPhuong = true;

        int demSDX = 0;
        int sumSDX = 0;

        int demSNT = 0;
        int sumSNT = 0;

        int demSCP = 0;
        int sumSCP = 0;

        for (int i = a; i <= b; i++) {

            //Số đối xứng
            String str = Integer.toString(i);

            for (int j = 1; j < str.length() / 2; j++) {
                if (str.charAt(j) != str.charAt(str.length() - 1 - j)) {
                    isSoDoiXung = false;
                    break;
                }
            }
            if (isSoDoiXung) {
                System.out.println("Nguyen to" + i);
                demSDX++;
                sumSDX += i;
            }

            //Số Chính phương
            if (Math.sqrt(i) % 1 == 0) {
                demSCP++;
                sumSCP += i;
            }

            //Số Nguyên tố
            if (i < 2) {
                isSoNguyenTo = false;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isSoNguyenTo = false;
                    break;
                }
            }
            if (isSoNguyenTo) {
                demSNT++;
                sumSNT += i;
            }
        }

        System.out.println("Số đối xứng: " + demSDX);
        System.out.println("Tổng số đối xứng " + sumSDX);
        System.out.println("Số chính phương: " + demSCP);
        System.out.println("Tổng số chính phương " + sumSCP);
        System.out.println("Số nguyên tố: " + demSNT);
        System.out.println("Tổng số nguyên tố: " + sumSNT);
    }
}
