package ss11_regex;

public class Main {
    public static void main(String[] args) {
        //a.
        System.out.println("(+84)324515111".matches("([(][+]84[)]|0)[3][2-9][0-9]{7}"));

        //b
        System.out.println("TranVuLam2003@gmail.com".matches("[A-Za-z0-9]{6,32}@gmail\\.com"));

        //c
        System.out.println("Tran_Vu_Lam.03".matches("[A-Za-z0-9._]{6,32}"));

        //d
        System.out.println("Password1.##".matches(".{6,32}"));


    }
}
