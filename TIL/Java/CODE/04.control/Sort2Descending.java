package ifexample;

import java.util.Scanner;

public class Sort2Descending {

	public static void main(String[] args) {
		// �� �������� ��������(ū ��)���� �����ϴ� ���α׷�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x: ");
		int x = sc.nextInt();

		System.out.print("y: ");
		int y = sc.nextInt();

		
//		if(x>=y) {
//			System.out.println(x+","+y);
//		}else {
//			System.out.println(+y+","+x);
//		}
		
		if(x<y) {
			int t = x;    //t�� �ӽú���
			x = y;
			y = t;
		}
		System.out.println("x>=y�� �ǵ��� ����");
		System.out.println("���� x: "+ x);
		System.out.println("���� y: "+ y );
		
	}	

}
