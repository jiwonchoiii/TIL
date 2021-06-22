package inheritance;


import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;


@Log4j
@NoArgsConstructor
public class CellPhone {

	
	// 1. 필드
	String model;
	String color;

	// 2. 생성자

	// 3. 메소드
	void powerOn() { // 코드가 한줄이더라도 메소드 선언부와 구현부를 한줄에 쓰지 않는다
		log.info(">>>>>>powerOn() invoked.");
		
		log.info("\t+ this: "+ this);
	} // powerOn

	void powerOff() {
		log.info("powerOff() invoked.");
	} // powerOff

	void bell() {
		log.info("bell() invoked.");
	} // bell

	void sendVoice(String message) {
		log.info("sendVoice(" + message + ") invoked");
	} // sendVoice

	void receiveVoice(String message) {
		log.info("receiveVoice(" + message + ") invoked");
	} // receiveVoice

	void hangUp() {
		log.info("hangUp() invoked.");
	} // hangUp

} // end class
