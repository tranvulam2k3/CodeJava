package ss5_loop.test;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        int count = 0;
        int khoangcach = 1;

        for (int i = 2; i <= num; i+=2) {
            if (count == khoangcach) { //kc = 2
                System.out.print(-i + "\t");
                count = 0;
                khoangcach++;
            }else{
                System.out.print(i+ "\t");
                count++; // 2
            }
        }
    }
}
