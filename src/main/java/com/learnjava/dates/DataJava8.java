package com.learnjava.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by z001qgd on 3/10/17.
 */
public class DataJava8 {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        String formatDateTime = today.format(formatter);

        System.out.println("formatDateTime :" + formatDateTime);
        String str = today.getDayOfWeek().toString();

        System.out.println(str.charAt(0) + str.substring(1).toLowerCase());
    }
}
