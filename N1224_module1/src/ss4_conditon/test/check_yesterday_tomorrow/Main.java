package ss4_conditon.test.check_yesterday_tomorrow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day: ");
        int day = sc.nextInt();

        if (day < 1 || day > 31) {
            System.out.println("Invalid day");
            return;
        }

        System.out.print("Enter a month: ");
        int month = sc.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid mouth");
            return;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                System.out.println("Invalid day");
                return;
            }
        }

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        if (month == 2) {
            if (isLeapYear) {
                if (day > 29) {
                    System.out.println("Invalid day");
                    return;
                }
            } else {
                if (day > 28) {
                    System.out.println("Invalid day");
                    return;
                }
            }
        }
        System.out.printf("Success!! \nDate enter %d/%d/%d", day, month, year);

        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        nextDay++;
        if (nextDay > 31 || (month == 2 && nextDay > (isLeapYear ? 29 : 28)) ||
                ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)) {
            nextDay = 1;
            nextMonth++;
        }

        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }

        System.out.printf("\nNext day %d/%d/%d ", nextDay, nextMonth, nextYear);

        int tomorrowDay = day;
        int tomorrowMonth = month;
        int tomorrowYear = year;

        tomorrowDay--;

        if (tomorrowDay < 1) {
            tomorrowMonth--;
            if (tomorrowMonth < 1) {
                tomorrowMonth = 12;
                tomorrowYear--;
            }

            if (tomorrowMonth == 4 || tomorrowMonth == 6 || tomorrowMonth == 9 || tomorrowMonth == 11) {
                tomorrowDay = 30;
            } else if (tomorrowMonth == 2) {
                if (isLeapYear) {
                    tomorrowDay = 29;
                } else {
                    tomorrowDay = 28;
                }
            } else {
                tomorrowDay = 31;
            }
        }

        System.out.printf("\nTomorrow day %d/%d/%d ", tomorrowDay, tomorrowMonth, tomorrowYear);
    }
}
