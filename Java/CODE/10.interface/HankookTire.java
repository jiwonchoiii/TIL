package interface_study;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)
public class HankookTire 
	implements Tire {
	
	//Tire 타입에 선언된 "규격(추상메소드)"를 반드시 지켜야한다. 
	@Override
	public void roll() {
		log.info("roll() invoked.");
		
	} //roll

} // end class
