package ifexample;

import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
	//  �������� �о� ��ȣ(���/����/0)�� �����ؼ� ǥ��
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������: ");
		
		int x = sc.nextInt();
		
		if(x>0) {
			System.out.println("�� ���� ����Դϴ�.");
		}else if(x<0){
			System.out.println("�� ���� �����Դϴ�");
		}else{
			System.out.println("�� ���� 0�Դϴ�");
		}
	
	

}
}