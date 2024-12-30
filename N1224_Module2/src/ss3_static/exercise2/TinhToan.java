package ss3_static.exercise2;

import java.util.Scanner;

public class TinhToan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tinh Tong , hieu , tich");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tong = PhepToan.tong(a,b);
        System.out.println("Tong: " +tong);

        int hieu = PhepToan.tru(a,b);
        System.out.println("Hieu: " +hieu);

        int tich = PhepToan.nhan(a,b);
        System.out.println("Tich: " +tich);

        System.out.println("Tinh hieu");
        int c = sc.nextInt();
        int d = sc.nextInt();
        if(d==0){
            System.out.println("Khong the chia cho so 0");
        }
        double chia = PhepToan.chia(c,d);
        System.out.println("Chia: " +chia);
    }
}
