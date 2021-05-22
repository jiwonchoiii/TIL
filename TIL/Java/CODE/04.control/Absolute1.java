package ifexample;

import java.util.Scanner;

public class Absolute1 {

	public static void main(String[] args) {

		// 정수값을 읽어서 절대값을 구하는 프로그램
		
	System.out.print("정수값:");
	Scanner sc = new Scanner(System.in);
	
	int x = sc.nextInt();
	
	if(x>=0) {
		System.out.println("절대값: " + x);
	}else {
		System.out.println("절대값: " + -x);
	}

}
}

