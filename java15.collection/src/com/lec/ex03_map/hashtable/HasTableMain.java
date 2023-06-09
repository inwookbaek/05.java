package com.lec.ex03_map.hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HasTableMain {

	public static void main(String[] args) {
		
		Map<String, String> map = new Hashtable<>();
		
		// 로그인정보 : select id, pw from member;
		map.put("hong", "12345");
		map.put("sohyang", "67890");
		map.put("sonny", "abcde");
		map.put("kangin", "fghjik");
		
		// 1. containsKey() : 키존재여부를 리턴
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Id와 pw를 입력하세요!!");
			System.out.println("id => ");
			String id = scanner.nextLine();
			System.out.println("pw => ");
			String pw = scanner.nextLine();
			
			if(map.containsKey(id)) {
				if(map.get(id).endsWith(pw)) {
					System.out.println("로그인성공!!!");
				} else {
					System.out.println("로그인실패!!!");
				}
			} else {
				System.out.println("아이디를 찾지 못했습니다!!");
				break;
			}
		}
		System.out.println("프로그램종료!!!");
	}

}
