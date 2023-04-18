package com.lec.ex03_method_overriding;

public class SuperSonicAirplaneMain {

	public static void main(String[] args) {
		
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flymode = SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flymode = SuperSonicAirplane.NORAML;
		sa.fly();
		sa.land();

	}

}
