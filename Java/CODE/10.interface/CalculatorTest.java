package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		
		CompleteCalC calc = new CompleteCalC();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		System.out.println(calc.square(num1));
		calc.showCalcInfo();
				
		Calc newCalc = calc; // 업캐스팅 --> 오버라이딩된 메소드는 접근 가능하다. 재정의되지 않은 메소드는 접근 불가(ShowCalInfo)
		//	Calc newCalc = new CompleteCalC();
	}

}
