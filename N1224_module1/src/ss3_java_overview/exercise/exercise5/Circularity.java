package ss3_java_overview.exercise.exercise5;

import java.util.Scanner;

public class Circularity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào bán kính r: ");
        double r = sc.nextDouble();

        double c = 2 * Math.PI * r; //Chu vi

        double s = Math.PI * Math.pow(r, 2); // Diện tích

        System.out.println("Chu vi hình tròn với bán kính bằng " + r + " là :" + c);
        System.out.println("Diện tích hình tròn với bán kính bằng " + r + " là :" + s);
    }
}
