public class OperatorPractice {
	public static void main(String[] args) {
		
		int a = 1_000_000;
		int b = 2_000_000; 
		
		long c = a * b;
		
		System.out.println(c);  // -1454759936
		//����� ���� �ٸ� ���� -1454759936�� ��µǴ� ����: intŸ�԰� intŸ���� �������� intŸ���̴�.
		//a*b�� ����� �̹� int��(-1454759936)�̹Ƿ� long������ �ڵ� ����ȯ �Ǿ ���� ������ �ʴ´�.
		
		//�ùٸ� ����� ��� ���ؼ��� ������ ���� �ۼ��ؾ� �Ѵ�.
		long c1 = (long)a*b;
		System.out.println(c1);   //2000000000000
		
		
		// ���� �ǹ��� ���̶� ������ ���� �ٸ� ����� ���� �� �ִ�.
		int d = 1000000;
		
		int result1 = d * d / d;
		int result2 = d / d * d;
		
		System.out.println(result1);  // -727  : ���������� �����ϸ� int ������ �Ѿ�� ������ ����� �ٸ� ����� ���´�. 
		System.out.println(result2);  // 1000000
		
		
		
	}

}
