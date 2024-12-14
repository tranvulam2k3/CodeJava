package ss3_java_overview.exercise.exercise1;

import java.util.Scanner;

public class CalAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào năm sinh của bạn :");
        int n = sc.nextInt();

        int namhientai = java.time.Year.now().getValue();

        int tuoi = namhientai - n;

        System.out.println("Tuổi của bạn là :" + tuoi);
    }
}
