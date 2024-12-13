package ss2_conditon.math;

public class Main {
    public static void main(String[] args) {
        boolean a = true && false;
        boolean b = (3 > 100) || (25 % 5 == 0);
        boolean c = a && b;
        boolean d = !a && b;
        System.out.println(c);
        System.out.println(d);
    }
}
