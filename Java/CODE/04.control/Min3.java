package ifexample;

import java.util.Scanner;
public class Min3 {

	public static void main(String[] args) {

		// Ű���忡�� �Է��� 3���� ���� �� �ּҰ��� ���ϴ� ���α׷�

	Scanner sc = new Scanner(System.in);
	System.out.print("x: ");
	int x = sc.nextInt();
	
	System.out.print("y: ");
	int y = sc.nextInt();

	System.out.print("z: ");
	int z = sc.nextInt();
	

	int min = x;
	if(y<min) min = y;      // y = min;�̶�� ���� �ʱ�
	if(z<min) min = z;
	
	System.out.println("�ּҰ���" + min + "�Դϴ�");

	}
}