package com.learnjava.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by z001qgd on 2/16/17.
 */
public class CalendarCheck {

    private static String convertDateToI2Format(String format) {

        String st = new String(format);
        st = new StringBuffer(st).insert(10, "T").toString();
        return st;
    }


    public static void main(String[] args) {

        Date toDate = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(toDate);
        System.out.println("toDate : " + cal.getTime());
        cal.add(Calendar.DATE, - 1);
        Date fromDate = cal.getTime();
        System.out.println("fromDate : " + fromDate);

        SimpleDateFormat dateFormat1= new SimpleDateFormat("yyyy-MM-dd23:59:ss");
        SimpleDateFormat dateFormat2= new SimpleDateFormat("yyyy-MM-ddHH:mm:ss");

        System.out.println("Format 1 : " + convertDateToI2Format(dateFormat1.format(new Date())));
        System.out.println("Format 2 : " + convertDateToI2Format(dateFormat2.format(new Date())));
        System.out.println("VRS date 2 : " + convertDateToI2Format(dateFormat2.format("02-NOV-14")));
    }
}
