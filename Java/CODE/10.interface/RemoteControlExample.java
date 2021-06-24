package interface_study;

import lombok.extern.log4j.Log4j;

@Log4j
public class RemoteControlExample {

	public static void main(String[] args) {
		// 참조변수의 타입을 인터페이스 타입(상속관계의 부모타입)
		// 다형성-1에 의해 이 인터페이스를 implements하고 있는 모든 자식 타입의 객체가 대입 가능
		RemoteControl rc;

		rc = new Television(); //다형성-1
		log.info("1. rc: " + rc);
		
//		rc = new Audio(); 	   //다형성-1
//		log.info("2. rc: " + rc);
		
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(true);
		rc.turnOff();
		
		
		
		
	}// main

} // end class
