package myapp;

public class LiteralExample {
//두 줄 정도 비워두기!
//변수를 사용 --> 반드시 변수가 정의되어야 한다.(선언+초기화)
	public static void main(String[] args) {
		int var1 = 10; 			// 10진수로 초기화 -> 변수의 정의
		System.out.println(var1);

		int var2 = 010;		 	// 8진수로 초기화. (0숫자)
		System.out.println(var2);

		int var3 = 0x10; 		// 16진수로 초기화. (0x숫자)
		System.out.println(var3);
		
		//이름, 나이, 키를 나타낼 변수를 정의해보자.
		//데이터 타입은 변수의 성질을 고려해서 정한다.
		String name ="최지원";
		System.out.println(name);
		
		int age = 100;
		System.out.println(age);
		
		double height = 165;
		System.out.println(height);
		
		//한 학생의 학번, 이름, 성적을 저장할 변수를 "정의"하세요.
		//고려사항: 변수에 저장할 값의 성질을 생각하시고,
		//		 변수의 (1) 타입, (2)이름, (3) 초기값을 잘 결정하세요
		
		String studentNo = "020130910";  //학번이 0으로 시작할 경우 int로 정하면 8진수로 인식한다.
										 //형식이 다름-->String
		System.out.println(studentNo);
		
		String studentName = "최지원";
		System.out.println(studentName);
		
		double grade = 4.5;
		System.out.println(grade);
		
		//두 숫자를 더해서, 그 결과를 보관할 필요가 있습니다. 정수연산은 무조건 정수로 나온다. 
		//이 목적에 맞게 변수를 정의하세요
		int value = 10;

		int result = value + 10;

		System.out.println(result);
	}// main

}// end of class
