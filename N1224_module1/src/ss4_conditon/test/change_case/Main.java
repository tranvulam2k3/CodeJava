package ss4_conditon.test.change_case;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            if (ch >= 'a' && ch <= 'z') {
                ch -= 32; // B = 66 b = 98
            } else {
                ch += 32;
            }
            System.out.println("Character after change: " + ch);
        } else {
            System.out.println("Invalid character");
        }

    }
}
