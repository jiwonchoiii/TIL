package abstract_class;

import lombok.extern.log4j.Log4j;

@Log4j
//@AllArgsConstructor 필드가 없어서 @AllArgsConstructor를 쓸 수 없다. 
public class SmartPhone 
	extends Phone{


	
	//생성자
	public SmartPhone(String owner) {
		super(owner);	
		
		log.debug("SmartPhone(owner) constructor invoked.");
	} //constructor
	
	//메소드
	public void internetSearch() {
		log.debug("internetSearch() invoked.");
		
		log.info("\t + 인터넷 검색을 합니다.");
	} // internetSearch

	//상속받은 추상메소드를 반드시 구현해야 한다. 
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub		
	}

} // end class 
