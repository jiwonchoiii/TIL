package operator;

import java.util.Scanner;

public class Average3B {

	public static void main(String[] args) {

		// 3���� �������� �о �հ�� ����� ���ϴ� ���α׷��� �ۼ�. ����� ĳ��Ʈ������(����ȯ)�� �̿��ؼ� ���ϰ� �Ǽ��� ǥ��.
		
	Scanner scanner = new Scanner(System.in);
		
	 System.out.println("������ x, y, z�� �հ�� ����� ���մϴ�");
	 	
	 System.out.print("x��: "); 
	 int x = scanner.nextInt();
	 
	 System.out.print("y��: "); 
	 int y = scanner.nextInt();
	 
	 System.out.print("z��: "); 
	 int z = scanner.nextInt();
	 
	 int sum = x+y+z;
	 double avg = (double)(x+y+z)/3;



	 System.out.printf("x,y,z�� ���� %d, ����� %.3f �Դϴ�", sum, avg);
	 
	}

}
