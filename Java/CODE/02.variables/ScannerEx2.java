package chapter2;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		
		//���ڿ� �б� ���� next()���, ���鹮�ڳ� �ǹ��ڰ� ���ڿ��� ������ �ȴ�.
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("�̸�:");
		
		String lastName = stdIn.next();
		String firstName = stdIn.next();
		
		System.out.println("�ȳ��ϼ���." + lastName + firstName + "��");
	
	}

}
