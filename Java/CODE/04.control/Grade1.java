package ifexample;

import java.util.Scanner;

public class Grade1 {

	public static void main(String[] args) {
		// �Է��� ���������� ����̾簡�� �����ϴ� ���α׷��� �ۼ� - ���� ������ &&�� �̿�

		Scanner sc = new Scanner(System.in);

		System.out.print("����: ");

		int score = sc.nextInt();

		// ��������, ���������� �����ϰ� ����ؾ��Ѵ�.
		
		if(score>=0 && score<=49)
			System.out.println("��");
		else if(score>=50 && score<59)
			System.out.println("��");
		else if(score >= 60 && score <= 69)
			System.out.println("��");			
		else if(score >= 70 && score <= 79)
			System.out.println("��");			
		else if(score >= 80 && score <= 100)
			System.out.println("��");	
		else
			System.out.println("�߸��� �����Դϴ�.");
			
			

//		if (score < 0 || score > 100)
//			System.out.println("�߸��� �����Դϴ�.");
//		if (score >= 90)
//			System.out.println("��");
//		else if (score >= 80)
//			System.out.println("��");
//		else if (score >= 70)
//			System.out.println("��");
//		else if (score >= 60)
//			System.out.println("��");
//		else 
//			System.out.println("��");

	}

}
