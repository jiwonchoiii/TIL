package operator;

public class OperatorTest {

	public static void main(String[] args) {
		
		int x = 10;
		System.out.println("x = " + "x");
		System.out.println("x = " + x);
		
		System.out.println(10 - 7);
		System.out.println(10 * 7);
		System.out.println(10 / 7);
		System.out.println(10 % 7);
		
		System.out.println(5/3);  //1
		System.out.println(5/(-3)); // -1
		System.out.println((-5)/-3); //1
		System.out.println(5 % (-3)); // 2   % 연산은 앞의 값에 따라 부호가 바뀐다
		System.out.println((-5)%3); // -2
		System.out.println((-5)%(-3)); // -2
		
	}

}
