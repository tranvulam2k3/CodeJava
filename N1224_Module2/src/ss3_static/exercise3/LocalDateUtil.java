package ss3_static.exercise3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {
    private final static DateTimeFormatter FORMAT_ddMMyyyy = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private final static DateTimeFormatter FORMAT_yyyyMMdd = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static LocalDate formString_ddMMyyyy(String date) {
        return LocalDate.parse(date, FORMAT_ddMMyyyy);
    }

    public static LocalDate formString_yyyyMMdd(String date) {
        return LocalDate.parse(date, FORMAT_yyyyMMdd);
    }

    public static String toString_yyyyMMdd(LocalDate date) {
        return date.format(FORMAT_yyyyMMdd);
    }

    public static String toString_ddMMyyyy(LocalDate date) {
        return date.format(FORMAT_ddMMyyyy);
    }
}
