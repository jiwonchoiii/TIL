package loopexample;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// ��ȣ���� *�� �����ؼ� �Ƕ�̵带 ǥ���ϴ� ���α׷�, �ܼ��� �����Է�
		//4�� 
		//   *
		//  ***
		// *****
		//*******
		Scanner stdIn = new Scanner(System.in);

		System.out.print("���� ������:");
		int x = stdIn.nextInt();

		for(int i = 1; i<=x; i++) {
			for(int j =1; j<=x-i; j++) 
				System.out.print(" ");
			for(int j =1; j<=(2*i)-1; j++)
				System.out.print("*");
			System.out.println();
		
		}
	}
}
