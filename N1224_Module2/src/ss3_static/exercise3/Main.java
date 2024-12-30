package ss3_static.exercise3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String dateString1 = "15-11-2020";
        String dateString2 = "2023-12-20";

        LocalDate localDate1 = LocalDateUtil.formString_ddMMyyyy(dateString1);
        LocalDate localDate2 = LocalDateUtil.formString_yyyyMMdd(dateString2);

        System.out.println("LocalDate tu chuoi dd/MM/yyyy: " + localDate1);
        System.out.println("LocalDate tu chuoi yyyy/MM/dd: " + localDate2);

        LocalDate currentDate = LocalDate.now();

        String formatDate1 = LocalDateUtil.toString_ddMMyyyy(currentDate);
        String formatDate2 = LocalDateUtil.toString_yyyyMMdd(currentDate);

        System.out.println("formatDate1: " + formatDate1);
        System.out.println("formatDate2: " + formatDate2);
    }
}
