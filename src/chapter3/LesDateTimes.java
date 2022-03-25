package chapter3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LesDateTimes {

	public static void main(String[] args) {
	//1-Creating
	/*
	LocalDate ld = LocalDate.now();
	LocalTime lt = LocalTime.now();
	LocalDateTime ldt = LocalDateTime.now();
	System.out.println(ld);
	System.out.println(lt);
	System.out.println(ldt);*/
	/*	
	LocalDate ld = LocalDate.of(2022, Month.JANUARY, 10);
	System.out.println(ld);
	LocalTime lt = LocalTime.of(10, 40);
	System.out.println(lt);
	LocalDateTime ldt = LocalDateTime.of(ld, lt);
	System.out.println(ldt);*/
		
	//2-Manipulating
		/*
		LocalDate ld = LocalDate.of(2022, Month.JANUARY, 10);
		//LocalDate ld2 =  ld.minusDays(20);
		//System.out.println(ld.plusDays(20));
		Period p = Period.of(1, 2, 10);
		LocalDate ld2 =  ld.plus(p);
		System.out.println(ld2);*/
		
	// 3-Formatting
		
		LocalDate ld = LocalDate.of(2022, Month.JANUARY, 10);
		System.out.println(ld);
		System.out.println(ld.format(DateTimeFormatter.ISO_LOCAL_DATE));
		
		DateTimeFormatter fl = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter ff = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter fs = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter fm = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(ld.format(fl));
		System.out.println(fl.format(ld));
		System.out.println(ld.format(ff));
		System.out.println(ld.format(fs));
		System.out.println(ld.format(fm));
		
	}

}
