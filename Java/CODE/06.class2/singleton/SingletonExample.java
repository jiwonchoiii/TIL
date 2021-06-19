package singleton;

import lombok.extern.log4j.Log4j;

@Log4j
public class SingletonExample {
	
	public static void main(String[] args) {
		
		/*
		 * Singleton obj1 = new Singleton(); //컴파일 에러
		 * Singleton obj2 = new Singleton(); //컴파일 에러
		 */
		
//		//싱글톤 객체의 레퍼런스를 얻자
//		Singleton obj1 = Singleton.getInstance();
//		Singleton obj2 = Singleton.getInstance();
//		
//		
//		if(obj1==obj2) {
//			log.info("같은 Singleton 객체입니다.");
//		} else {
//			log.info("다른 Singleton 객체입니다.");
//		} //if-else
		
		
		for(int i = 1 ; i <=10; i++) {
			Singleton obj = Singleton.getInstance();
			
			log.info(String.format("[%d] obj: [%s]", i , obj));
		}// for
		
	} //main

} //end class
