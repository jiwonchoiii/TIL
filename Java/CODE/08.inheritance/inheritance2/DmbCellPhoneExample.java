package inheritance;


import lombok.extern.log4j.Log4j;


@Log4j
public class DmbCellPhoneExample {

	public static void main(String[] args) {

		// 1. 자식 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);

		// 2. 부모 객체로부터 상속받은 필드 사용
		log.info("모델: " + dmbCellPhone.model);
		log.info("색상: " + dmbCellPhone.color);

		// 3. 자식 객체의 필드 사용
		log.info("채널: " + dmbCellPhone.channel);

		// 4. 부모 객체로부터 상속받은 메소드 사용(호출)
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 최지원인데요");
		dmbCellPhone.sendVoice("네 반갑습니다");
		dmbCellPhone.hangUp();

		// 5. 자식 객체에 선언된 메소드 사용(호출)
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}// main
	
}//end class 
