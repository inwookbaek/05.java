package com.lec.ex04_while;

import java.io.IOException;
import java.util.Scanner;

public class DoWhileMain {

	public static void main(String[] args) throws IOException {
		// 키보드로 부터 문자열을 입력받는 방법
		// System.in.read()는 한개의 문자(키코드값(정수))만 
		// 읽을 수 있기 때문에 콘솔에 입력된 문자열을
		// 한꺼번에 읽을 수가 없다.
		System.out.print("키보드에서 문자를 입력하세요 ==> ");
		System.out.println(System.in.read());
		
		// 콘솔에 입력된 문자열을 한 번에 읽기 위해서는 Scanner객체를
		// 생성하고 nextLine()메서드를 호출하면 콘솔에 입력된 문자열을
		// 한 꺼번에 읽을 수가 있다.
		
		System.out.println("이름을 입력하세요!!!");
		System.out.println("프로그램을 종료하려면 q를 입력하세요!!");
		
		String name = null;
		// ctrl+space바 클릭후 import할 라이브러를 선택 or
		// ctrl+shift+o 자동 import
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("==> ");
			name = scanner.nextLine();
			System.out.println("입력된 이름 = " + name);
		} while (!name.contentEquals("q"));
		
		System.out.println();
		System.out.println("프로그램이 종료되었습니다!!");
	}

}
