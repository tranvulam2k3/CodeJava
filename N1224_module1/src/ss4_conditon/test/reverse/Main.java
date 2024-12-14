package ss4_conditon.test.reverse;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Using temp variable: " + a);
        System.out.println("Using temp variable: " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Not using temp variable: " + a);
        System.out.println("Not using temp variable: " + b);
    }
}
