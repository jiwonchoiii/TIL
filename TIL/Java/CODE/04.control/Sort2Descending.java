package ifexample;

import java.util.Scanner;

public class Sort2Descending {

	public static void main(String[] args) {
		// 두 정수값을 내림차순(큰 순)으로 정렬하는 프로그램
		
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
			int t = x;    //t는 임시변수
			x = y;
			y = t;
		}
		System.out.println("x>=y가 되도록 정렬");
		System.out.println("변수 x: "+ x);
		System.out.println("변수 y: "+ y );
		
	}	

}
