package ifexample;

import java.util.Scanner;

public class Modulo3 {

	public static void main(String[] args) {
		// �Է��� �������� 3���� ������. ����� ���� "�� ���� 3���� ���������ϴ�", "�� ���� ���� �������� 1�Դϴ�", "�� ���� ����
		// �������� 2�Դϴ�", ����� �ƴ� ��� "�� ���� ����� �ƴմϴ�"�� ǥ��.

		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		int x = sc.nextInt();

		if(x > 0) {
			
		    if(x % 3 == 0)
			    System.out.println("�� ���� 3���� ���������ϴ�.");
		    else if (x % 3 == 1)
			    System.out.println("�� ���� ���� �������� 1�Դϴ�.");
		    else 
		    	System.out.println("�� ���� ���� �������� 2�Դϴ�.");
		    
		}else {
			System.out.println("�� ���� ����� �ƴմϴ�.");
		}

	}

}
