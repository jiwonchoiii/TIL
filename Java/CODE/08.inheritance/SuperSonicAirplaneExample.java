package Overriding;


public class SuperSonicAirplaneExample {

	
	public static void main(String[] args) {

		// 자식 객체 생성
		SuperSonicAirplane sa = new SuperSonicAirplane();

		sa.takeOff(); 
		sa.fly(); 

		sa.flyMode = SuperSonicAirplane.SUPERSONIC;
		sa.fly(); 

		sa.flyMode = SuperSonicAirplane.NORMAL;
		sa.fly();  
		sa.land(); 
	}// main

}// end class
