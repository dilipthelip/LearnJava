package com.learnjava.calendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRules;

/**
 * Created by z001qgd on 4/6/17.
 */
public class ZonedDateTimeCheck {


    public static void main(String[] args) {

        ZonedDateTime storeDateTimeZone = ZonedDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get("EST")));
        System.out.println("Code storeDateTimeZone : " + storeDateTimeZone);

        ZoneId newYokZoneId = ZoneId.of("America/New_York");
        System.out.println("newYokZoneId : " +  newYokZoneId);
        storeDateTimeZone = ZonedDateTime.now(newYokZoneId);
        System.out.println("EST time is : " + storeDateTimeZone);

        newYokZoneId = ZoneId.of("America/Chicago");
        storeDateTimeZone = ZonedDateTime.now(newYokZoneId);
        System.out.println("CST time is  : " + storeDateTimeZone);

        newYokZoneId = ZoneId.of("America/Los_Angeles");
        storeDateTimeZone = ZonedDateTime.now(newYokZoneId);
        System.out.println("PST time is  : " + storeDateTimeZone);

        newYokZoneId = ZoneId.of("America/Phoenix");
        storeDateTimeZone = ZonedDateTime.now(newYokZoneId);
        System.out.println("MST time is  : " + storeDateTimeZone);


        newYokZoneId= ZoneId.of("Pacific/Honolulu");
        storeDateTimeZone = ZonedDateTime.now(newYokZoneId);
        System.out.println("Honolulu time is  : " + storeDateTimeZone);


        newYokZoneId= ZoneId.of("America/Anchorage");
        storeDateTimeZone = ZonedDateTime.now(newYokZoneId);
        System.out.println("Alaska time is  : " + storeDateTimeZone);

        ZonedDateTime currentTime = ZonedDateTime.now().withZoneSameLocal(ZoneId.of("America/New_York"));
        System.out.println("Current Time is : " + currentTime);
//        int year, int month, int dayOfMonth,
//        int hour, int minute, int second, int nanoOfSecond, ZoneId zone
        ZonedDateTime date2 = ZonedDateTime.of(2017,01,06,2,45,55,55,ZoneId.of("America/New_York"));
        System.out.println("Changed time is : " + date2);


    }
}
