package ss3_static;

import java.util.ArrayList;

public class Main {
    static int a = 2;
    int b = 2;
    static int dem = 0;

    public Main(){
        dem++;
    }
    public static void main(String[] args) {
        ArrayList<Main> list = new ArrayList<>();
        Main m = new Main();
        Main m2 = new Main();



        System.out.println(Main.dem);

    }
}
