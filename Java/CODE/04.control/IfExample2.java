package ifexample;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {

		System.out.print("����: ");

		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		int charge;

		// �������� ������ ���� ���ɴ���� ���°� ȿ�����̴�. 
		
		if (age >= 60) { 
			charge = 0;
			System.out.println("��ο���Դϴ�");
		} else if (age > 19) {
			charge = 3000;
			System.out.println("�����Դϴ�.");
		} else if (age > 13) {
			charge = 2500;
			System.out.println("û�ҳ� �Դϴ�.");
		} else if (age > 7) {
			charge = 2000;
			System.out.println("�ʵ��л� �Դϴ�.");
		} else {
			charge = 1000;
			System.out.println("������ �Ƶ� �Դϴ�.");
		}

		System.out.print("����� " + charge + "���Դϴ�.");


//
//		if (age < 8 || age > 60) {
//			charge = 0;
//			if (age < 8) {
//				System.out.println("������ �Ƶ��Դϴ�");
//			} else {
//				System.out.println("��ο�� �Դϴ�");
//			}
//		} else if (age < 14) {
//			charge = 2000;
//			System.out.println("�ʵ��л� �Դϴ�.");
//		} else if (age < 20) {
//			charge = 2500;
//			System.out.println("û�ҳ� �Դϴ�.");
//		} else {
//			charge = 3000;
//			System.out.println("�����Դϴ�");
//		}
//
//		System.out.print("����� " + charge + "���Դϴ�.");
	}
}
