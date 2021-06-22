package inheritance;


import lombok.extern.log4j.Log4j;


@Log4j
public class DmbCellPhone extends CellPhone {

	//1.필드
	int channel;
	
	//2.생성자
	 DmbCellPhone(String model, String color, int channel) {
		log.info("DmbCellPhone(model, color, channel) invoked.");
		
		this.model=model;
		this.color=color;
		this.channel=channel;
	} //constructor
	 
	//3.메소드
	 void turnOnDmb() {
		 log.debug("turnOnDmb() invoked.");
		 
		 log.info("\t+ 채널 "+ channel +"번 DMB 방송 수신을 시작합니다.");
	 } // turnOnDmb
	 
	 void changeChannelDmb(int channel) {
		 log.debug("changeChannelDmb(channel) invoked.");
		 
		 this.channel = channel;
		 log.info("\t+ 채널 "+ channel+"번으로 바꿉니다.");
	 } //changeChannelDmb
	 
	 void turnOffDmb() {
		 log.debug("turnOffDmb() invoked.");
		 
		 log.info("\t+ DMB 방송 수신을 멈춥니다.");
	 } // turnOffDmb
	 
} // end class
