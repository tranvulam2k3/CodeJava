package ss2_conditon.test.reverse;

public class Main {
    public static void main(String[] args) {
        int a = 2 ;
        int b = 3 ;

        int temp = a ;
        a = b;
        b = temp ;

        System.out.println(a);
        System.out.println(b);
    }
}
