package interfaceex;

public class CompleteCalC extends Calculator{
	@Override
	public int times(int num1, int num2) {
		return num1*num2;

	}
	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0)
			return num1/num2;
		else
			return Calc.ERROR;

	}
	
	@Override
	public int square(int num1) {
		return num1*num1;
	}
	
	public void showCalcInfo() {
		System.out.println("Calc 인터페이스를 구현했습니다.");
	}

}
