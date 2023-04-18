package com.lec.ex03_method_overriding;

public class SuperSonicAirplane extends Airplane {
	
	public static final int NORAML = 1;
	public static final int SUPERSONIC = 2;
	int flymode = NORAML;
	
	@Override
	void fly() {
		if(flymode == NORAML) {
			super.fly();
		} else {
			System.out.println("초음속비행...");			
		}
	}
}
