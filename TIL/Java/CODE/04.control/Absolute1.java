package ifexample;

import java.util.Scanner;

public class Absolute1 {

	public static void main(String[] args) {

		// �������� �о ���밪�� ���ϴ� ���α׷�
		
	System.out.print("������:");
	Scanner sc = new Scanner(System.in);
	
	int x = sc.nextInt();
	
	if(x>=0) {
		System.out.println("���밪: " + x);
	}else {
		System.out.println("���밪: " + -x);
	}

}
}

