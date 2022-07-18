package com.day1.session2.ex7;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DemoJava8DateTimeApi {

	public static void main(String[] args) {
		
		//LocalDate
		//LocalDateTime
		//LocalTime
		
		//LocalDate d= LocalDate.now();
		//LocalDate d= LocalDate.of(2022, Month.JANUARY, 11);
//		System.out.println(d.getDayOfMonth());
//		System.out.println(d.getDayOfYear());
//		
//		System.out.println(d.getMonthValue());
//		
//		
//		System.out.println(d);
		
		
//		LocalDate d= LocalDate.parse("2018-08-12");
//		
//		System.out.println(d);
		
		DateTimeFormatter formate= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate d1= LocalDate.of(2020, Month.APRIL, 11);
		//System.out.println(d);
		
		LocalDate d2= LocalDate.now();
		
		//Period					//old  new
		Period period=Period.between(d1, d2);
		//System.out.println(period.getDays());
		//System.out.println(period.getYears());
		
		//ystem.out.println(period.getDays());
		
		//diff bw date no of days
		long days=ChronoUnit.DAYS.between(d1, d2);
		System.out.println(days);
		
		
		
//		if(d1.equals(d2))
//			System.out.println("not");
//		else
//			System.out.println("yes");
//		
		
		
		
		
		//Date date=new Date(12, 7, 11); ;/		=> joda date and time api
		//java 8 they have adaptoed jdk.. new date and time api
		//System.out.println(date);
		
		
	}
}
