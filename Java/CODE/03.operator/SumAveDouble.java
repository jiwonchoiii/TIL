package operator;

import java.util.Scanner;
public class SumAveDouble {

	public static void main(String[] args) {
		
		// �� �Ǽ��� �հ�� ��� ���ϱ�
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x��: ");
		
		double x = scanner.nextDouble();
		
		System.out.print("y��: ");
		
		double y = scanner.nextDouble();
		
		System.out.println("�հ�� "+(x+y) + "�Դϴ�");
		System.out.println("����� "+(x+y)/2 + "�Դϴ�");
		
	}

}
