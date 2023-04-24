package com.lec.ex12_time;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TimeMain3 {

	public static void main(String[] args) {
		
		// 1. 더하기, 빼기
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재시간 : " + now);
		
		LocalDateTime tartgetDateTime = now
				.plusYears(1)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(4)
				.minusMinutes(5)
				.plusSeconds(6);		
		System.out.println("연산시간 : " + tartgetDateTime);
				
		// 2. 변경하기
		//    1) 직접변경하기
		tartgetDateTime = now
				.withYear(2024)
				.withMonth(12)
				.withDayOfMonth(11)
				.withHour(13)
				.withMinute(30)
				.withSecond(20);
		System.out.println("연산시간 : " + tartgetDateTime);		
		
		//    2) 상대변경하기 - 년
		tartgetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("금년 첫번째일 : " + tartgetDateTime);
		tartgetDateTime = now.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("금년 마지막일 : " + tartgetDateTime);
		tartgetDateTime = now.with(TemporalAdjusters.firstDayOfNextYear());
		System.out.println("익년 첫번째일 : " + tartgetDateTime);
		System.out.println();
		
		//    3) 상대변경하기 - 월
		tartgetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("금월 첫번째일 : " + tartgetDateTime);
		tartgetDateTime = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("금월 마지막일 : " + tartgetDateTime);
		tartgetDateTime = now.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("익월 첫번째일 : " + tartgetDateTime);
		System.out.println();		
				
		//    4) 상대변경하기 - 요일
		tartgetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("금월 첫번째월요일 : " + tartgetDateTime);
		tartgetDateTime = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println("돌아오는 월요일 : " + tartgetDateTime);
		tartgetDateTime = now.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println("지난 월요일 : " + tartgetDateTime);
		System.out.println();		
		
		// 3. 날짜와 시간 비교하기
		LocalDateTime startDateTime = LocalDateTime.of(2023, 1,1,9,0,0);
		LocalDateTime endDateTime = LocalDateTime.of(2024, 3,31,18,0,0);
		System.out.println("시작일 : " + startDateTime);
		System.out.println("종료일 : " + endDateTime);
		
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("진행중...");
		} else if(startDateTime.isEqual(endDateTime)) {
			System.out.println(("종료중..."));
		} else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("종료!");
		}
		
		System.out.println("[종료까지 남은 시간]");
		long remainYear = startDateTime.until(endDateTime, ChronoUnit.YEARS);
		long remainMonth = startDateTime.until(endDateTime, ChronoUnit.MONTHS);
		long remainDay = startDateTime.until(endDateTime, ChronoUnit.DAYS);
		long remainHour = startDateTime.until(endDateTime, ChronoUnit.HOURS);
		long remainMinute = startDateTime.until(endDateTime, ChronoUnit.MINUTES);
		long remainSecond = startDateTime.until(endDateTime, ChronoUnit.SECONDS);
		
		System.out.println("남은 해 : " + remainYear);
		System.out.println("남은 월 : " + remainMonth);
		System.out.println("남은 일 : " + remainDay);
		System.out.println("남은 시 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
		System.out.println();	
		
		remainYear = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		remainMonth = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		remainDay = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		remainHour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		remainMinute = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
		remainSecond = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		System.out.println("남은 해 : " + remainYear);
		System.out.println("남은 월 : " + remainMonth);
		System.out.println("남은 일 : " + remainDay);
		System.out.println("남은 시 : " + remainHour);
		System.out.println("남은 분 : " + remainMinute);
		System.out.println("남은 초 : " + remainSecond);
		System.out.println();			
		
		System.out.println("[종료까지 남은 시간]");		
		Period period = Period.between(startDateTime.toLocalDate(), endDateTime.toLocalDate());
		System.out.print("남은 기간 : " + period.getYears() + "년 ");
		System.out.print(period.getMonths() + "개월");
		System.out.println(period.getDays() + "일 ");
	
		Duration duration = Duration.between(startDateTime.toLocalTime(), endDateTime.toLocalTime());
		System.out.println("남은 초 : " + duration.getSeconds());
				
		// 4. 파싱과 포매팅하기
		DateTimeFormatter formatter;
		LocalDate localDate;
		 
		localDate = LocalDate.parse("2024-05-21");
		System.out.println(localDate);
		 
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-05-21", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2024/05/21", formatter);
		System.out.println(localDate);

		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21", formatter);
		System.out.println(localDate);
		
		LocalDateTime now1 = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter 
			= DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		String nowString = now1.format(dateTimeFormatter);
		System.out.println(nowString);
	
	}
}























