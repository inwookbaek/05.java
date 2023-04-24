package com.lec.ex11_format;

import java.text.MessageFormat;

public class MessageMain {

	public static void main(String[] args) {
		
		String id = "java";
		String name = "홍길동";
		String tel = "010-9999-8888";
		
		String text = "회원Id={0}, 회원이름={1}, 전화번호={2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		
		String sql = "insert into member values({0},{1},{2})";
		Object[] arg = {"java", "홍길동","010-9999-8888"};
		String result2 = MessageFormat.format(sql, arg);
		System.out.println(result2);

	}

}
