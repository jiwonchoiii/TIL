package operator;

import java.util.Scanner;

public class SecToTime {

	public static void main(String[] args) {

		// ������ ��, ��, �ʷ� ǥ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���: "); // ��, ��, �ʷ� ��ȯ�� ���� �Է�
		
				
		int time = sc.nextInt();
		int hour=time/(60)/60; // 60���� ���� ���� �ٽ� 60���� ���� ���� �ð��� �ǹ�  = time/(60*60);
		int minute=(time/60)%60; // 60���� ���� ���� �ٽ� 60���� ���� �������� ���� �ǹ� = time/60-(hour*60);
		int second=time%60; // 60���� ���� �������� �ʸ� �ǹ�

		System.out.print(time+ "�ʴ� ");
		System.out.print(hour+ "�ð�, ");
		System.out.print(minute+ "��, ");
		System.out.print(second+ "���Դϴ�. ");		
	
	}

}
