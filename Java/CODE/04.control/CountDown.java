package loopexample;

import java.util.Scanner;

public class CountDown {

	public static void main(String[] args) {
		// �Է¹��� ���������� 0���� ī��Ʈ�ٿ��ϴ� ���α׷�. ī��Ʈ �ٿ� ���� ���� �������� Ȯ�� - while, for ����
		Scanner sc = new Scanner(System.in);
		
	
		int x = sc.nextInt();
		System.out.println("ī��Ʈ�ٿ� �մϴ�.");
		System.out.print("���� ������:");

//		for (; x >= 0; x--)
//			System.out.println(x);
		
		
		while(x>=0) {
			System.out.println(x);
			x--;
		}


		System.out.println("x�� ����" + x + "�� �ƽ��ϴ�.");
	
	}

}
