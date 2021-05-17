package ifexample;

import java.util.Scanner;
public class Min3 {

	public static void main(String[] args) {

		// 키보드에서 입력한 3개의 정수 중 최소값을 구하는 프로그램

	Scanner sc = new Scanner(System.in);
	System.out.print("x: ");
	int x = sc.nextInt();
	
	System.out.print("y: ");
	int y = sc.nextInt();

	System.out.print("z: ");
	int z = sc.nextInt();
	

	int min = x;
	if(y<min) min = y;      // y = min;이라고 쓰지 않기
	if(z<min) min = z;
	
	System.out.println("최소값은" + min + "입니다");

	}
}