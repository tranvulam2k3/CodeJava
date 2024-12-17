package ss5_loop.test;

public class Main16 {
    public static void main(String[] args) {
        int n = 11 ;
        String binary = "";

        while (n > 0) {
            binary = n % 2 + binary;
            n = n / 2;
        }
        System.out.println(binary);
    }
}
