package operator;

public class OperationEx1 {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 91;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
//		double avgScore = totalScore / 3.0;    // ��� ���� �Ǽ��� ���� �� �ֱ� ������ ������ �ƴ϶� �Ǽ��� �����ش�. 
												// 3���� �����൵ ������ Ÿ���� �Ǽ����̹Ƿ� ���� �Ǽ��� ��µȴ�(��Ȯ���� ���� ��)
		
		double avgScore = (double)totalScore / 3;  // ��������� �� ��ȯ���ָ� �������� ����.
		System.out.println(avgScore);
		
		System.out.printf("%.2f",avgScore);
	}

}
