package loopexample;

public class WhileExample {

	public static void main(String[] args) {
		int num = 10;
		int sum = 0;
		
		while(num<=10) {
			sum += num ;
			num++;
		}
		
		// n(n+1)/2 �������� ���ϱ�(���ڰ� ū ���)
		
	
//		sum = (num*(num+1))/2;
		
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�");
	}

}
