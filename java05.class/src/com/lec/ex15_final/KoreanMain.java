package com.lec.ex15_final;

public class KoreanMain {

	public static void main(String[] args) {
		
		// Korean.NATION = "미국";

		Korean hong = new Korean("홍길동", "991118-1234567");
		System.out.println(hong);
		// hong.NATION = "미국";
		hong.name = "홍길상";
		// hong.ssn = "901118-23456789";
		System.out.println(hong);
		
	
	}

}
