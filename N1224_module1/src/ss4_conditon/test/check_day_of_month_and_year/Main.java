package ss4_conditon.test.check_day_of_month_and_year;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        int dayOfMonth;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                dayOfMonth = 30;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    dayOfMonth = 29;
                } else {
                    dayOfMonth = 28;
                }
                break;
            default:
                dayOfMonth = 31;
                break;
        }
        System.out.printf("The number of days in %d %d is %d days", month, year, dayOfMonth);
    }
}
