package ss5_loop.whiledo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double score;
        do {
            System.out.println("Nhập vào điểm :");
            score = sc.nextDouble();

            if (score < 0 || score > 10) {
                System.out.println("Điểm k hợp lệ vui lòng nhập lại !!");
            }
        } while (score < 0 || score > 10);

        System.out.println("Điểm : " + score);
    }
}
