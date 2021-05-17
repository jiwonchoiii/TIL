package chapter2;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;  // 상수는 선언과 동시에 초기화하는 것이 좋다.
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);

//		MAX_NUM=1000;      상수는 값을 변경할 수 없기 때문에 에러 발생
// 	상수는 재사용이 가능하다. (재사용성) 값이 바뀌면 상수의 선언부만 수정하면 되기 때문에 편하다.
	
	
	
	}

}
