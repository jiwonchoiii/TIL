package chapter2;

import java.util.Scanner;
public class ScannerEx3 {

	public static void main(String[] args) {
	
		// �� ���� �Է��� ���ڿ��� �о� �ּҸ� ��� - nextLine()���
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�ּ�: ");
		String address = stdIn.nextLine();
		
		System.out.println("�ּҴ� " + address + "�Դϴ�.");

	}

}
