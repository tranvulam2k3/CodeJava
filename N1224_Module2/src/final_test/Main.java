package final_test;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        while (true) {
            do {
                System.out.println("=============MENU=============");
                System.out.println("1. ");
                System.out.println("2. ");
                System.out.println("3. ");
                System.out.println("4. ");
                System.out.println("5. ");
                System.out.println("6. ");
                System.out.println("7. ");
                System.out.println("8. ");
                System.out.println("9. ");
                System.out.println("=========================================");

                System.out.print("CHỌN CHỨC NĂNG MUỐN CHỌN: ");
                choice = Integer.parseInt(sc.nextLine());
                if (choice < 1 || choice > 9) {
                    System.out.println("KHÔNG CÓ CHỨC NĂNG ĐÓ, VUI LÒNG CHỌN LẠI !!!!!!");
                    continue;
                }

                switch (choice) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    default:
                        return;
                }
            } while (true);
        }
    }
}

