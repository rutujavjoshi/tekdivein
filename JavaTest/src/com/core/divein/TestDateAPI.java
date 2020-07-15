package com.core.divein;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

/*
 * Sample Code for 
 * LocalDate, LocalTime, LocalDateTime, ZonedDateTime, Period, Duration
 */
public class TestDateAPI {

	public static void main(String[] args) {

		//Local Date
		LocalDate dt = LocalDate.now();
		System.out.println("---------------LocalDate------------------------");
		System.out.println("Today date:" + dt);
		System.out.println("Yesterday date: " + dt.minusDays(1));
		System.out.println("Is Leap Year:" +dt.isLeapYear());  
		
		//Local Time
		LocalTime tm = LocalTime.now();  
		System.out.println("---------------LocalTime------------------------");
		System.out.println("Current Time:" + tm);
		System.out.println("Time two hours ago:"+tm.minusHours(2));  
		System.out.println("Time of (11,22,12):" +tm.of(11,22,12));  
		
		//LocalDateTime
		LocalDateTime dttm = LocalDateTime.now();  
		System.out.println("---------------LocalDateTime------------------------");
        System.out.println("Local Date Time:" + dttm);  
        System.out.println("Formatted Date Time:" + dttm.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));  
        System.out.println("Day of Year:" + dttm.get(ChronoField.DAY_OF_YEAR));
        		
		//ZonedDateTime, Period,Duration
        //ZonedDateTime
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println("Date Time - (Zone)Europe/Paris:"+ ZonedDateTime.of(dttm, zoneId));
        //Period
        LocalDate period = dt.plus(Period.ofDays(5));
        System.out.println("Period after 5 days :"+period);
       	//Duration
        System.out.println("Duration in hours :"+ (Duration.between(dt.atStartOfDay(), period.atStartOfDay())).toHours());
		

	}

}
