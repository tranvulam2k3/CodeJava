package ss4_conditon.test.employee_salary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào thâm niên công tác (số tháng): ");
        int tnct = sc.nextInt();

        double luongCoBan = 650000;
        double heSoLuong;

        if (tnct < 12) {
            heSoLuong = 1.92;
        } else if (tnct < 36) {
            heSoLuong = 2.34;
        } else if (tnct < 60) {
            heSoLuong = 3;
        } else {
            heSoLuong = 4.5;
        }

        double luong = heSoLuong * luongCoBan;
        System.out.println("Lương của nhân viên đó là: $" + luong);
    }
}
