package com.lec.ex01_class;

/*
	중첩클래스
	
	중첩클래스는 클래스 내부에 선언되는 위치에 따라서 3가지로 분류된다.
	
	1. 클래스멤버 선언되는 중첩클래스는 "객체(인스턴스)멤버클래스"라고 하고
	2. static으로 선언되는 중첩클래스는 "정적멤버클래스"라고 하며
	3. 메서드 내부에 선언되는 중첩클래스는 "로컬멤버클래스"라고 한다.
	
	객체멤버클래스는 클래스나 객체가 사용중(생성)이라면 언제든지 사용할 수
	있지만 로컬멤버클래스는 메서드가 실행될 때만 사용할 수 있고 메서드가 종료
	되면 메모리에서 삭제가 된다.
	
	중첩클래스들도 하나의 클래스이기 때문에 컴파일을 하면 바이트코드파일(~.class)
	이 각각 생성된다. 다만 바이트코드파일의 이름은 "A$B.class"의 형태로 생성된다.
	로컬멤버클래스일 경우에는 "A$1D.class"의 형태로 생성된다.
	
	중첨클래스중에 정적멤버클래스(C)는 static 키워드로 선언된 중첩클래스를 말한다.
	정적멤버클래스는 모든 종류의 필드와 메서드를 선언할 수 있다.
	
	중첩클래스중에 로컬멤버클래스는 메서드 내부에 선언된 중첩클래스로서 로컬중첩
	클래스는 접근제한자(public, private), static으로 선언할 수가 없다.
	그 이유는 로컬클래스는 메서드내에서만 사용되기 때문에 접근을 제한할 필요가 
	없기 때문이다. 로컬중첩클래스에는 인스턴스필드와 인스턴스메서드만 선언이 가능
	하고 static키워드를 사용할 수 없다.
	
	로컬중첩클래스는 메서드가 실해될 때만 메서드 내부에서 객체를 생성하고 사용할
	수 있다. 주로 비동기처리를 위해 쓰레드객체를 만들 때 사용한다.
	
*/
public class NestedMain {

	public static void main(String[] args) {
		
		A a = new A();
		
		// 1. 객체중첩클래스(B)
		// B b = new B(); // (x) 객체중첩클래스는 직접접근불가
		// A.B b = new A.B(); // (x) 객쳄멤버로 접근불가
		A.B b = a.new B();
		b.b_field = 10;
		b.b_method();
		System.out.println();
		
		// 2. 정적중첩클래스(C)
		// A.C.field1 = "접근불가"; // (x) c_field1은 객체멤버이기 때문에 C객체생성없이 접근 불가
		A.C.c_field2 = "접근가능";  // (O) 정적멤버이기 때문에 접근가능 
		// A.C.c_method1(); // (x) c_method1은 객체멤버이기 때문에 C객체생성없이 접근불가
		A.C.c_method2();    // (o) 정적멤버이기 때문에 접근가능
		System.out.println();
		
		A.C c = new A.C();  // C는 정적클래스이기 때문에 직접접근가능
		// A.C c1 = a.new C(); // 접근불가
		c.c_field1 = "객체생성후 접근가능";
		c.c_field2 = "정적멤버이기때문에 클래스명으로 접근할 것";
		c.c_method1();
		c.c_method2(); // 클레스명으로 접근할 것
		System.out.println();
		
		// 3. 로컬중첩클래스
		// 로컬중첩클래스는 메서드를 호출한 후에 메서드 내부에서만 생성할 수 있다.
		a.a_method();
	}

}












