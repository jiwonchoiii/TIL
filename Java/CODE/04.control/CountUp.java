package loopexample;
import java.util.Scanner;

public class CountUp {

	public static void main(String[] args) {
		// 0���� �Է¹��� ���������� ī��Ʈ���ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ������:");
		int x = sc.nextInt();
			
		while(x>=0) {
			System.out.println(x);
			x--;
		}
		
//		int i = 0;
//		for(;i<=x;i++) {
//			System.out.println(i);
//		}
		System.out.println("����");

	}

}
