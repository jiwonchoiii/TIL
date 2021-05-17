package operator;

import java.util.Scanner;

public class Average3B {

	public static void main(String[] args) {

		// 3개의 정숫값을 읽어서 합계와 평균을 구하는 프로그램을 작성. 평균은 캐스트연산자(형변환)를 이용해서 구하고 실수로 표시.
		
	Scanner scanner = new Scanner(System.in);
		
	 System.out.println("정수값 x, y, z의 합계와 평균을 구합니다");
	 	
	 System.out.print("x값: "); 
	 int x = scanner.nextInt();
	 
	 System.out.print("y값: "); 
	 int y = scanner.nextInt();
	 
	 System.out.print("z값: "); 
	 int z = scanner.nextInt();
	 
	 int sum = x+y+z;
	 double avg = (double)(x+y+z)/3;



	 System.out.printf("x,y,z의 합은 %d, 평균은 %.3f 입니다", sum, avg);
	 
	}

}
