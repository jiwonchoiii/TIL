public class OperatorPractice {
	public static void main(String[] args) {
		
		int a = 1_000_000;
		int b = 2_000_000; 
		
		long c = a * b;
		
		System.out.println(c);  // -1454759936
		//예상과 전혀 다른 값인 -1454759936이 출력되는 이유: int타입과 int타입의 연산결과는 int타입이다.
		//a*b의 결과가 이미 int값(-1454759936)이므로 long형으로 자동 형변환 되어도 값은 변하지 않는다.
		
		//올바른 결과를 얻기 위해서는 다음과 같이 작성해야 한다.
		long c1 = (long)a*b;
		System.out.println(c1);   //2000000000000
		
		
		// 같은 의미의 식이라도 순서에 따라서 다른 결과를 얻을 수 있다.
		int d = 1000000;
		
		int result1 = d * d / d;
		int result2 = d / d * d;
		
		System.out.println(result1);  // -727  : 곱셈연산을 먼저하면 int 범위를 넘어서기 때문에 예상과 다른 결과가 나온다. 
		System.out.println(result2);  // 1000000
		
		
		
	}

}
