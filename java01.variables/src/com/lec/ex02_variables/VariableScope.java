package com.lec.ex02_variables;

public class VariableScope {

	public static void main(String[] args) {
		// 변수의 사용범위
		// local vs global(지역변수 vs 전역변수)
		int var1 = 10;
		System.out.println("var1의 값 = " + var1);
		System.out.println();
		
		if(true) {
			int var2;
			var1 = 20;  // 전역변수
			var2 = 20;  // 지역변수
			// var3 = 33;  // 다른 지역의 변수
			System.out.println("var1 = " + var1);
			System.out.println("var2 = " + var2);
		}
		// System.out.println("var2 = " + var2);
		// 에러: var2는 if블럭안에서 선언된 지역변수이기 때문에 if블럭 밖에서는 사용할 수 없다.
		System.out.println();
		
		if(true) {
			int var3;
			var1 = 30;
			// var2 = 20; // var2는 위에서의 if블럭안에서만 사용가능한 지역변수
			var3 = 30;
			System.out.println("var1 = " + var1);
			// System.out.println("var2 = " + var2);
			System.out.println("var3 = " + var3);
		}
		
		System.out.println("var1 = " + var1);
		// System.out.println("var2 = " + var2);
		// System.out.println("var3 = " + var3);		
	}

}
















