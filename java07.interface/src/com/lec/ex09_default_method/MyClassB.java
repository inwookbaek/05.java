package com.lec.ex09_default_method;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB.method1() 호출!!");	
	}

    @Override
    public void method3() {
    	System.out.println("3년뒤에 새로운 공통기능이 추가 되었습니다!");
    }
}
