package ss6_method;

public class Main {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;

        double sum = tong(a, b);
        Main m = new Main();
        double tich = m.tich(a, b);

        //double tich = tich(a,b);
        System.out.println("sum = " + sum);
        System.out.println("tich =" + tich);
    }

    public static double tong(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public double tich(double a, double b) {
        double tich = a * b;
        return tich;
    }
}
