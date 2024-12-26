package ss1_java_overview.exercise3;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        System.out.println("Nhập tọa độ điểm thứ 1");
        p1.input();

        System.out.println("Nhập tọa độ điểm thứ 2");
        p2.input();

        double distance = p1.distanceTo(p2);
        System.out.println("Khoảng cách giữa 2 điểm bằng: " + distance);
    }
}
