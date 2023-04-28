package com.lec.ex04_tree.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMain2 {

	public static void main(String[] args) {
		
		// 2. TreeMap 정렬하기
		TreeMap<Integer, String> students = new TreeMap<>();
		students.put(87, "홍길동");
		students.put(98, "손흥민");
		students.put(75, "이강인");
		students.put(95, "김민재");
		students.put(80, "소향");
		
		// 정렬메서드 : descendingMap(), descendingEnterSet()
		NavigableMap<Integer, String> dm = students.descendingMap();
		Set<Map.Entry<Integer, String>> desEntry = dm.entrySet();
		for(Map.Entry<Integer, String> student:desEntry) {
			System.out.println(student.getValue() + "의 점수 = " + student.getKey());
		}
		System.out.println();
		
		// 내림차순
		NavigableMap<Integer, String> am = dm.descendingMap();
		Set<Map.Entry<Integer, String>> ascEntry = am.entrySet();
		for(Map.Entry<Integer, String> student:ascEntry) {
			System.out.println(student.getValue() + "의 점수 = " + student.getKey());
		}		
	}

}
