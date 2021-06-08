package myapp;


import lombok.extern.log4j.Log4j;

@Log4j
public class SignOperationExample {

	
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x; // 부호연산자 + 적용
		int result2 = -x; // 부호연산자 - 적용
		
		log.info("result1: " + result1);
		log.info("result2: " + result2);
		
		short s = 100; 	// 리터럴은 형변환 대상이 아니다. 
						// 100: int, 100l/100L: long
						// l00.0: double, 100.0f/l00.0F: float
		
	//	short result3 = -s; //컴파일 에러
							//자바에서 정수 연산의 결과는 무조건 int(long은 제외) 
							//강제 형변환하거나 lValue에 int 타입의 변수를 가져야한다.
							//byte, short의 값을 계산할 때는 변환하는 연산이 수행된다. 그래서 int를 쓰는 것이 효율적이다.
		int result3 = -s;
		log.info("result3: " + result3);
		
		int op1 = 1;
		int op2 = 3;
		
		//자바 언어에서 정수타입(byte, short, int) 변수를 사용한 연산식의 결과는 정수(int)로 나온다.
		log.info("op1/op2 = " +(op1/op2));
		log.info("op1/op2 = " +((double)op1/op2));
		
	} // main
} // end of class
