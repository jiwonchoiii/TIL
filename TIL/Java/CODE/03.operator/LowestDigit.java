package operator;

import java.util.Scanner;

public class LowestDigit {

	public static void main(String[] args) {

		// Ű���忡�� �Է��� ���������� ������ �ڸ����� ������ ���� ������ �ڸ��� ���� ǥ���ϴ� ���α׷��� �ۼ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������: ");
		
		int x = sc.nextInt();
	
		System.out.println("������ �ڸ����� ������ ���� " + (x/10) +"�Դϴ�");
		System.out.println("������ �ڸ����� " + (x%10) + "�Դϴ�");
		
		
		
	}

}
