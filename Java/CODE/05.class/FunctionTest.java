package classpart;

public class FunctionTest {
	public static void main(String[] args) {

		int num1 = 20;
		int num2 = 5;
				

		int sum = add(num1, num2);		// add 함수 호출
		System.out.println(num1 + " + " + num2 + " = " + sum + "입니다");

		int op = 3;

		double result = calcNum(num1, num2, op);
		System.out.println(num1 + " / " + num2 + " = " + result + "입니다");
		
	
		
	}

	public static int add(int n1, int n2) {
		n1 = n1 * n1; // call by value 방식 : 값이 복사되서 온다.
						// 공간이 다르기 때문에 n1의 값을 바꾸어도 num1값은 변하지 않는다.
		int result = n1 + n2;
		return result; // 결과값 반환

	}

	public static double calcNum(int a, int b, int op) {
		double result = 0;

		if (op == 0) {   //+
			result =  add(a, b);
		} else if (op == 1) {   // -
			result = a - b;
		} else if (op == 2) {  // *
			result = a * b;
		} else if (op == 3) {  // /
			// result = (b!=0)? a/b : 0;
			
			switch (b) {
			case 0:
				result = 0;
				break;
			default:
				result = a / b;
			}
						
		}

		return result;
	}
	
	
	
}
