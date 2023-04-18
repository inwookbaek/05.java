package com.lec.ex07_instanceof;

public class Driver {

	void drive(Vechile vechile) {
		// vechile.run();
		// vechile.checkFare();
		System.out.println(vechile.getClass());
		
		if(vechile instanceof Bus) {
			Bus bus = (Bus) vechile;
			bus.run();
			bus.checkFare();			
		} else if(vechile instanceof Taxi) {
			Taxi taxi = (Taxi) vechile;
			taxi.run();
			taxi.checkNight();
		} else {
			vechile.run();
		}
		System.out.println();
	}
}
