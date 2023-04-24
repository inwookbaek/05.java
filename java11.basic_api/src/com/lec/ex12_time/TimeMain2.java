package com.lec.ex12_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeMain2 {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		String strDateTime = now.getYear() + "년 ";
		strDateTime += now.getMonthValue() + "월 ";
		strDateTime += now.getMonth() + "월 ";
		strDateTime += now.getDayOfMonth() + "일 ";
		strDateTime += now.getDayOfWeek() + " ";
		strDateTime += now.getHour() + "시 ";
		strDateTime += now.getMinute() + "분 ";
		strDateTime += now.getSecond() + "초 ";
		strDateTime += now.getNano() + "ns ";
		System.out.println(strDateTime);
		System.out.println();
		
		LocalDate nowDate = now.toLocalDate();
		System.out.println(nowDate);
		if(nowDate.isLeapYear()) {
			System.out.println("윤년입니다!");
		} else {
			System.out.println("평년입니다!");
		}
		
		LocalTime nowTime = now.toLocalTime();
		System.out.println(nowTime);
		
		// 시차
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		ZonedDateTime SeoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("세계협정시 = " + utcDateTime );
		System.out.println("서울시간존 = " + SeoulDateTime );
		
		ZoneId seoulZoneId = SeoulDateTime.getZone();
		System.out.println("서울존ID = " + seoulZoneId);
		ZoneOffset seoulZoneOffset = SeoulDateTime.getOffset();
		System.out.println("서울존로오프셋 = " + seoulZoneOffset); // 시차를 리턴
		
	}
}