package chapter2;

import java.util.Scanner;
public class ScannerEx1 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in); // Ű���� �Է�
		System.out.println("����, ü��, ������ ��ĭ���� �и��Ͽ� ������� �Է��ϼ���");
		//ù ��° �Է� �������� int
		System.out.println("����� ���̴� " + a.nextInt() + "���Դϴ�.");
		//�� ��° �Է� �������� double
		System.out.println("����� ü���� " + a.nextDouble() +"kg�Դϴ�.");
		//�� ��° �Է� �������� double
		System.out.println("����� ������ " + a.nextDouble() +"cm�Դϴ�.");

	}

}
