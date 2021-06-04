package myapp;

public class VariableScopeExample {
	static {;;}  // static initializer 
	
	// 변수사용의 대전제: 변수가 정의되어있어야 변수를 사용할 수 있다.
	public static void main(String[] args) {
		int var1; // 선언만 함. 메인 메소드가 끝날때까지 사용가능

		if (true) { // true는 boolean타입의 리터럴이다.
			int var2; // 선언만 함

			var1 = 10; // 선언된 변수의 초기화
			var2 = 20; // 선언된 변수의 초기화
			
			{;;}  // User-defined block 
		} // if

		var1 = 10; // 변수의 정의가 아님(초기화까지 되어서). 변수를 사용하는 것
		// var2 = 20; if블록 밖에서 var2는 파괴

		for (int i = 0; i < 1; i++) {
			int var3; // 선언만 함

			var1 = 10; // 변수의 정의가 아님. 변수의 사용
			// var3 = 30; //변수 초기화
		} // for

		var1 = 10; // 변수의 정의가 아님! 변수의 사용
		// var3 = 30;
		
	} // main
}// end of class
