package chapter2;

public class IntegerVariable {

	public static void main(String[] args) {
		short sVal = 10;
		byte bVal = 20;
		System.out.println(sVal+bVal);
		
		long num = 1234564876000L;
		long num2 = 1000; // 오류는 나지 않지만 long형을 쓸 때는 L을 붙이는게 좋다.
		System.out.println(num);
		System.out.println(num2);

		
		char myChar = 'A';
		System.out.println((int)myChar);		
	}

}
