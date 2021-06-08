package myapp;


import lombok.extern.log4j.Log4j;


@Log4j
public class DenyLogicOperatorExample {

	//토글(toggle)수행 like switch
	public static void main(String[] args) {
		boolean play = true; 	// flag변수라고 부름		
		log.info(play);
		
		play = !play;			// 부정연산자 NOT 연산
		log.info(play);
		
		play = !play;			// 부정연산자 NOT 연산
		log.info(play);
		
	} //main
}	// end of class 
