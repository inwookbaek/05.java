package com.lec.ex06_re;

import java.util.regex.Pattern;

/*
	정규표현식과 Pattern 클래스(java.util.regex.Pattern)
	
	문자열에 정해져인는 형식(정규식, Regular Expression)으로 구성이 되어 있는지 여부를 검증
	할 때 사용한다.(정규식을 작성하는 방법은 API에서 java.util.regex.Pattern클래스를 참조)
	
	간단히 말해서 정규식은 문자 or 숫자등 반복기호가 결합된 문자열이다. 예를 들어서 문자열이
	02-123-1234 또는 010-1234-1234와 같이 전화번호를 포함하는지 여부를 확이할 수가 있는데
	정규식으로 표현하면 "(02|010)-\d{3,4}-\d{4}"의 형태인지 여부를 boolean으로 리턴, 이메일일
	경우 "hong@gmail.com"일 패턴은 "\w+@\w+\.\w(\.\w+)?"의 형태로 검증할 수가 있다.
*/
public class RegExMain {

	public static void main(String[] args) {
		
		// 1. 전화번호의 유효성검증하기
		String tel1 = "02-123-4567";
		String tel2 = "010-9999-8888";
		
		// 검증한다면
		// 지역번호가 2, 3자리인지, 숫자인지를 비교
		// 전화번호구분자가 "-"인지확인
		// 국번 숫자인지, 3~4자리인지를 비교
		// 뒤4자리가 숫자인지, 4자리인지를 비교
		
		// 정규식패턴
		String re = "(02|010|031|051|055)-\\d{3,4}-\\d{4}";
		boolean result = Pattern.matches(re, tel1);
		System.out.println(result);
		result = Pattern.matches(re, tel2);
		System.out.println(result);
		
		System.out.println( Pattern.matches(re, "031-123-1234"));
		System.out.println( Pattern.matches(re, "032-123-1234"));
		System.out.println( Pattern.matches(re, "010-1234-9999"));
		System.out.println();
		
		if(Pattern.matches(re, "032-123-1234")) {
			System.out.println("정상적인 전화번호입니다!");
		} else {
			System.out.println("비정상적인 전화번호입니다! 다시 입력하세요!!");
		}
		System.out.println();
		
		// 2. 이메일유효성검증
		String email = "amdin@gmail.com"; 
		re = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		if(Pattern.matches(re, email)) {
			System.out.println("정상적인 이메일입니다!");
		} else {
			System.out.println("비정상적인 이메일입니다! 다시 입력하세요!!");
		}			
		
		if(Pattern.matches(re, "amdingmail.com")) {
			System.out.println("정상적인 이메일입니다!");
		} else {
			System.out.println("비정상적인 이메일입니다! 다시 입력하세요!!");
		}			
		
		if(Pattern.matches(re, "amdin@gmailcom")) {
			System.out.println("정상적인 이메일입니다!");
		} else {
			System.out.println("비정상적인 이메일입니다! 다시 입력하세요!!");
		}			
		
		
		if(Pattern.matches(re, "amdin@gmail.cooooo.kr")) {
			System.out.println("정상적인 이메일입니다!");
		} else {
			System.out.println("비정상적인 이메일입니다! 다시 입력하세요!!");
		}			
		System.out.println();
		
		// 3. 문자검증
		System.out.println(Pattern.matches("[a-z]", "a"));   // only 소문자 true
		System.out.println(Pattern.matches("[A-Z]", "A"));   // only 대문자true
		System.out.println(Pattern.matches("[a-z]", "az"));  // 개별문자 false
		System.out.println(Pattern.matches("[a-z]+", "az")); // + 단어단위, true
		System.out.println(Pattern.matches("[A-Z]+", "ZA")); // + 단어단위, true
		System.out.println(Pattern.matches("[A-Z]+", "Za")); // + 단어단위, false
		System.out.println(Pattern.matches("[a-zA-Z]+", "Za")); // + 단어단위, 소문자, 대문자, true
		System.out.println();
		
		// 4. 숫자
		System.out.println(Pattern.matches("[0-9]", "0"));  // true
		System.out.println(Pattern.matches("[0-9]", "01")); // false
		System.out.println(Pattern.matches("[0-9]+", "01")); // true
		
		// 영문자,소문자,대문자, _
		System.out.println(Pattern.matches("[0-9a-zA-Z]+", "01a8b")); // true
		System.out.println(Pattern.matches("[0-9a-zA-Z]+", "01012341234")); // true
		System.out.println(Pattern.matches("\\w+", "0ab9")); // true
		System.out.println(Pattern.matches("[0-9a-zA-Z]+", "01012341234_")); // false
		System.out.println(Pattern.matches("\\w+", "01012341234_")); // true
		System.out.println();
		
		// 5. not(^) 영문자,소문자,대문자, _
		System.out.println(Pattern.matches("\\w+", "01012341234_")); // true
		System.out.println(Pattern.matches("\\W+", "01012341234_")); // false
		System.out.println(Pattern.matches("\\W+", "01012341234_")); // false
		System.out.println(Pattern.matches("[0-9a-zA-Z_]+", "01012341234_")); // true
		System.out.println(Pattern.matches("[^0-9a-zA-Z_]+", "01012341234_")); // false
	}
}
