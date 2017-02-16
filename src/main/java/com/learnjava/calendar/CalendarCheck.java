package com.learnjava.calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by z001qgd on 2/16/17.
 */
public class CalendarCheck {

    public static void main(String[] args) {

        Date toDate = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(toDate);
        System.out.println("toDate : " + cal.getTime());
        cal.add(Calendar.DATE, - 1);
        Date fromDate = cal.getTime();
        System.out.println("fromDate : " + fromDate);
    }
}
