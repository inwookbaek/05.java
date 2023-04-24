package com.lec.ex10_date_calendar;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarMain {

	public static void main(String[] args) {
		
		// Calendar클래스는 추상클래스이기 때문에 new연산자 사용불가
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + "." + month + "." + day);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.MONDAY);
		switch(week) {
		case Calendar.MONDAY: System.out.println("월요일"); break;
		case Calendar.TUESDAY: System.out.println("화요일"); break;
		case Calendar.WEDNESDAY: System.out.println("수요일"); break;
		case Calendar.THURSDAY: System.out.println("목요일"); break;
		case Calendar.FRIDAY: System.out.println("금요일"); break;
		case Calendar.SATURDAY: System.out.println("토요일"); break;
		case Calendar.SUNDAY: System.out.println("일요일"); break;
		}
		
		int ampm = now.get(Calendar.AM_PM);
		if(ampm == Calendar.AM) {
			System.out.println("오전입니다");
		} else {
			System.out.println("오후입니다");
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.println(hour + ":" + minute + "." + second);
		
		// 다른 시간대에 해당하는 날짜와 시간을 출력하기
		// java.lang.TimeZone객체를 얻어서 Calendar.getInstance()메서드의
		// 매개값으로 전달하면 된다.
		TimeZone timeZone = TimeZone.getTimeZone("America/Jamaica");
		Calendar now1 = Calendar.getInstance();
		year = now1.get(Calendar.YEAR);
		month = now1.get(Calendar.MONTH) + 1;
		day = now1.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+ "." + month + "." + day);
		System.out.println();
		
		// 사용가능한 시간대
		String[] timeZoneId = TimeZone.getAvailableIDs();
		for(String id:timeZoneId) {
			System.out.println(id);		
		}
	}
}
