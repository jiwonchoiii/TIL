package myapp;


import lombok.extern.log4j.Log4j;

@Log4j
public class OverFlowExample {

	
	public static void main(String[] args) {
		
		int x = 1000000;
		int y = 1000000;
		
		int z = x * y; // 표현식
	
		//Wrapper class의 MIN_VALUE, MAX_VALUE 메소드 이용			
	       
	       if((x*y) > Integer.MAX_VALUE || (x*y) < Integer.MIN_VALUE) {
	          log.info("예외발생");
	       } else {
	          log.info(x*y);
	       }
	       //이미 x*y의 값이 int 범위내에서 정해지므로 MAX_VALUE, MIN_VALUE의 범위를 넘지 않는다. 
	       // --> 오버플로우된 값 출력
				
//		long x = 1000000;
//		long y = 1000000;
//
//		//long타입은 8바이트로, 저장 가능한 숫자의 범위에 한계 있음
//		//그럼 과연 이 두 큰 숫자의 곱셈결과를 저장할 수 있을까?
//		long z = x*y;	//표현식
//		
//		log.info(z);		
	}	
}
