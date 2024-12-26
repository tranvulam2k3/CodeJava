package ss8_date_time.exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Exercise2 {
    public static void main(String[] args) throws ParseException {
        //a.
        System.out.println("=====Câu A=====");
        String dateStr = "09/23/2003";
        SimpleDateFormat dateFormatA = new SimpleDateFormat("MM/dd/yyyy");
        Date date = dateFormatA.parse(dateStr);
        System.out.println(date);

        //b
        System.out.println("=====Câu B=====");
        Date currentDate = new Date();
        SimpleDateFormat dateFormatB = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = dateFormatB.format(currentDate);
        System.out.println(formattedDate);

        //c
        System.out.println("=====Câu C=====");
        String dataStrC = "09/23/2003";
        DateTimeFormatter dateFormatC = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate localDate = LocalDate.parse(dataStrC, dateFormatC);
        System.out.println(localDate);

        //d
        System.out.println("=====Câu D=====");
        LocalDate localDateD = LocalDate.now();
        DateTimeFormatter dateFormatD = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDateD = dateFormatD.format(localDateD);
        System.out.println(formattedDateD);

        //e
        System.out.println("=====Câu E=====");
        LocalDateTime localDateTime = LocalDateTime.now();
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);

        //f
        System.out.println("=====Câu F=====");
        LocalDate localDateF = LocalDate.now();
        LocalDate oneMonthLater = localDateF.plusMonths(1);
        System.out.println("One Month Later : " + oneMonthLater.getDayOfWeek());
        long dayUntilOneMonthLater = localDateF.until(oneMonthLater , ChronoUnit.DAYS);
        /*
        ChronoUnit.HOURS : Để tính số giờ chênh lệch giữa 2 thời điểm
        ChronoUnit.MINUTES
        ChronoUnit.MONTHS
        ChronoUnit.SECONDS
         */
        System.out.println("One Month Later: " + dayUntilOneMonthLater);

        //g
        System.out.println("=====Câu G=====");
        LocalDate currentDateG = LocalDate.now();
        LocalDate futureDate = currentDateG.plusDays(1000);
        System.out.println("Future Date : " + futureDate);

        //h
        System.out.println("=====Câu H=====");
        String dataStrH1 = "12/05/2023";
        String dataStrH2 = "23/12/2023";
        DateTimeFormatter dateFormatH = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDateH1 = LocalDate.parse(dataStrH1, dateFormatH);
        LocalDate localDateH2 = LocalDate.parse(dataStrH2, dateFormatH);
        long dayUntilOneMonthLaterH = localDateH1.until(oneMonthLater , ChronoUnit.DAYS);
        System.out.println("Số ngày chênh lệch: " + dayUntilOneMonthLaterH);

        //i
        System.out.println("=====Câu I=====");
        String dataStrI = "12/05/2023";
        int n = 10;
        DateTimeFormatter dateFormatI = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDateI = LocalDate.parse(dataStrI, dateFormatI);
        LocalDate futureDateI = localDateI.plusDays(n);
        System.out.println("Ngày sau " + n + " ngày: " + futureDateI.format(dateFormatI));





    }
}
