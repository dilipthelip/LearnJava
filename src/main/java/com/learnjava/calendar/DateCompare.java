package com.learnjava.calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by z001qgd on 5/11/17.
 */
public class DateCompare {
    public static void main(String[] args) {

        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      //  LocalDate date1 = LocalDate.of(2009, 12, 31);

        LocalDate currentDate = LocalDate.now().plusDays(1);
        System.out.println("Increamentd date is : "+ currentDate);

        //LocalDate date1 = LocalDate.parse("29-05-2017",sdf);
        LocalDate date1 = LocalDate.parse("11-05-2017",sdf);
        System.out.println(date1.getMonth());
        System.out.println(date1.getYear());
        System.out.println(date1.getDayOfMonth());

        LocalDate date2 = LocalDate.now();
        System.out.println("Are dates equal : " + date1.isEqual(date2));
    }
}
