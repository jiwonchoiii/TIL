package interface_study;

import lombok.extern.log4j.Log4j;

@Log4j
public class AnonymousInterface {

	// 익명구현객체생성
	public static void main(String[] args) {

		RemoteControl rc = new RemoteControl() {
			
			String name = "Yoseph";
			
			//생성자는 선언할 수 없다 ---> 클래스의 이름을 알 수 없기 때문
			
			void myMethod() { // 이 블록안에서만 사용 가능
				
			} // myMethod

			@Override
			public void turnOn() {
				log.info("turnOn() invoked.");
				
				log.info("\t + this: " + this);
				log.info("\t + type: " + this.getClass().getName());
			} // turnOn

			@Override
			public void turnOff() {
				log.info("turnOff() invoked.");
				
				log.info(this.name);

			} // turnOff

			@Override
			public void setVolume(int volume) {
				log.info("setVolume() invoked.");
				
				
			} // setVolume

		}; // 익명구현객체 생성

		rc.turnOn(); 
		rc.setVolume(10);
		rc.setMute(true); //인터페이스에 선언된 default 메소드 호출
		rc.turnOff();

		RemoteControl.changeBattery(); // 인터페이스에 선언된 정적 메소드 호출 
	} // main

} // end class
