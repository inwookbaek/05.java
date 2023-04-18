package com.lec.ex08_inheritance;

public class ImplementMain {

	public static void main(String[] args) {
		
		ImplementC im = new ImplementC();
		im.methodA();
		im.methodB();
		im.methodC();
		System.out.println();
		
		InterfaceA ia = im; // InterfaceA로 자동형변환
		ia.methodA();
		// ia.methodB(); (x)
		// ia.methodC(); (x)
		System.out.println();
		
		InterfaceB ib = im; // InterfaceB로 자동형변환
		// ib.methodA(); (x)
		ib.methodB(); 
		// ib.methodC(); (x)
		System.out.println();
		
		InterfaceC ic = im; // InterfaceC로 자동형변환
		ic.methodA(); 
		ic.methodB(); 
		ic.methodC(); 
	}

}
