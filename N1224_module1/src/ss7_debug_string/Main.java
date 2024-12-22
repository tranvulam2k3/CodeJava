package ss7_debug_string;

public class Main {

    public String str1() {
        return "Hello World";
    }

    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = new String("Hello World");

        System.out.println(str == str2);
        System.out.println(str.equals(str2));
    }
}
