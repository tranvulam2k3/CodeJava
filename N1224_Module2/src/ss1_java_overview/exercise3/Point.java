package ss1_java_overview.exercise3;

import java.util.Scanner;

public class Point {
    double x;
    double y;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X: ");
        x = sc.nextDouble();
        System.out.print("Enter Y: ");
        y = sc.nextDouble();
    }

    double distanceTo(Point p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }
}
