package com.lec.ex07_arrays;

import java.util.Arrays;

/*
	Arrays클래스
	
	Arrays클래스는 배열에 관한 조작기능을 지원하는 유틸리티클래스이다. 배열의 복사, 요소의 정렬
	요소검색과 같은 기능을 제공한다.
	
	간순한 배열의 복사는 System.arraycopy()메서드를 사용할 수 있으나 Arrays는 추가적으로 요소정렬
	검색, 비교와 같은 기능을 제공한다. Arrays관련 모든 메서드는 static메서드이기 때문에 객체생성
	없이 바로 Arrays클래스로 직접 메서드를 호출할 수 있다.
*/
public class ArraysMain {

	public static void main(String[] args) {
		
		// 1. 기본타입 정렬
		int[] scores = {90,98,80};
		Arrays.sort(scores);
		for(int score:scores) {
			System.out.print(score + ", ");
		}
		System.out.println();
		
		// 2. 검색 : binarySearch는 인덱스(위치)를 리턴
		int index = Arrays.binarySearch(scores, 98);
		System.out.println("98점의 위치(인덱스) = " + index);
		System.out.println(scores[index]);
		System.out.println();
		
		// 3. 참조타입(String) 정렬 및 검색
		String[] names = {"손흥민", "이강인", "김민재"};
		Arrays.sort(names);
		for(String name:names) {
			System.out.print(name + ", ");
		}
		System.out.println();
		
		index = Arrays.binarySearch(names, "김민재");
		System.out.println(names[index]);
		
		// 4. 객체의 정렬 및 비교
		// 객체를 정렬하려면 Comparable 인터페이스의 compareTo(객체)를
		// 구현을 한 객체이아야만 정렬을 할 수가 있다. 만약 Comparable
		// 인터페이스를 구현하지 않고 정렬을 하려면 예외가 발생된다.
		// Arrays.sort()는 자동으로 오름차순으로 정렬된다.
		
		Member m1 = new Member("손흥민");
		Member m2 = new Member("이강인");
		Member m3 = new Member("김민재");
		
		Member[] members = {m1, m2, m3};
		Arrays.sort(members);
		for(Member member:members) {
			System.out.print(member.name + ", ");
		}
		System.out.println();
		
		// 객체의 검색
		index = Arrays.binarySearch(names, "이강인");
		System.out.println(names[index]);
		
	}

}

class Member implements Comparable<Member> {
	
	String name;
	
	public Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member m) {
		return this.name.compareTo(m.name); // -1 0 1
	}
}