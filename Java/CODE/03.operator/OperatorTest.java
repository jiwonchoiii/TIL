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
		System.out.println(5 % (-3)); // 2   % ������ ���� ���� ���� ��ȣ�� �ٲ��
		System.out.println((-5)%3); // -2
		System.out.println((-5)%(-3)); // -2
		
	}

}
