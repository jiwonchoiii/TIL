package loopexample;

public class BreakExample3 {

	public static void main(String[] args) {
		
		// 1���� ���� �� ���� 900000000000000L �̻��� ���� ���� �ڿ��� ���ϱ�
		// n(n+1)/2 =90000000000000L �� �����ϴ� �Ǽ��� ã�� ������ �ٲ۴�. ����������->���� ���� Ȱ�� 

		long sum = 900000000000000L;  
		
		double f = ( -1 + Math.sqrt( 1 - 4 * (-2 * sum)) )/2;
		System.out.println(f);
		int n = ( (f - (int)f) > 0) ? (int)(f+1) : (int)f;
	
		
		System.out.println(n);
	}
	
	
	
}
