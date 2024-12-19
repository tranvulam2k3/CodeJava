package ss7_debug_string.exercise;

import java.util.Locale;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello World";

        //Câu a: Lấy ra chữ 'World'
        System.out.println("a. Lấy ra chữ World: " + str.substring(6));

        //Câu b: Thay o -> f
        System.out.println("b. Thay o thành f: " + str.replaceAll("o", "f"));

        //Câu c: Đếm xem có bao nhiêu chữ l
        int count = 0;
        for (int i = 0; i <= str.length() - 1; i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println("c. Số kí tự l: " + count);

        //Câu d: Vị trí xuất hiện đầu tiên và cuối cùng của kí tự 'l'
        System.out.println("d. Vị trí xuất hiện đầu tiên: " + str.indexOf('l'));
        System.out.println("Vị trí xuất hiện cuối cùng: " + str.lastIndexOf('l'));

        //Câu e: Xóa hết space
        System.out.println("e. Xoá hết space giữa chúng, đầu tiên và cuối cùng: " +
                str.replaceAll(" ", ""));

        //Câu f: Xoá hết space đầu tiên và cuối cùng
        System.out.println("f. Xoá hết space đầu tiên và cuối cùng (Không được xoá space giữa chừng): " + str.trim());

        //Câu g: Đảo chuỗi
        String daoChuoi = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            daoChuoi += str.charAt(i);
        }
        System.out.println("g. Đảo chuỗi: " + daoChuoi);

        //Câu h: Nối chuỗi
        System.out.println("h. SQC ".concat(str));

        //Câu i: Chuỗi -> HOA
        System.out.println("i. Đổi toàn bộ kí tự của s sang chữ in hoa: " + str.toUpperCase());

        //Câu k: Chuỗi -> thường
        System.out.println("k. Đổi toàn bộ kí tự của s sang chữ thường: " + str.toLowerCase());

        //Câu l: Chuỗi con từ kí tự thứ n đến thứ m
        System.out.println("l. Trích ra chuỗi con từ kí tự thứ n đến thứ m");
        System.out.print("Nhập vào n: ");
        int n = sc.nextInt();

        System.out.print("Nhập vào m: ");
        int m = sc.nextInt();

        System.out.printf("Chuỗi con từ kí tự thứ %d đến thứ %d: %s", n, m, str.substring(n, m));

    }
}

