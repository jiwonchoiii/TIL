package classpart;

public class FunctionTest {
	public static void main(String[] args) {

		int num1 = 20;
		int num2 = 5;
				

		int sum = add(num1, num2);		// add �Լ� ȣ��
		System.out.println(num1 + " + " + num2 + " = " + sum + "�Դϴ�");

		int op = 3;

		double result = calcNum(num1, num2, op);
		System.out.println(num1 + " / " + num2 + " = " + result + "�Դϴ�");
		
	
		
	}

	public static int add(int n1, int n2) {
		n1 = n1 * n1; // call by value ��� : ���� ����Ǽ� �´�.
						// ������ �ٸ��� ������ n1�� ���� �ٲپ num1���� ������ �ʴ´�.
		int result = n1 + n2;
		return result; // ����� ��ȯ

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
