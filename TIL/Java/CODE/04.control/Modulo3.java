package ifexample;

import java.util.Scanner;

public class Modulo3 {

	public static void main(String[] args) {
		// 입력한 정수값을 3으로 나눈다. 결과에 따라 "이 값은 3으로 나누어집니다", "이 값을 나눈 나머지는 1입니다", "이 값을 나눈
		// 나머지는 2입니다", 양수가 아닌 경우 "이 값은 양수가 아닙니다"를 표시.

		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
		int x = sc.nextInt();

		if(x > 0) {
			
		    if(x % 3 == 0)
			    System.out.println("이 값은 3으로 나누어집니다.");
		    else if (x % 3 == 1)
			    System.out.println("이 값을 나눈 나머지는 1입니다.");
		    else 
		    	System.out.println("이 값을 나눈 나머지는 2입니다.");
		    
		}else {
			System.out.println("이 값은 양수가 아닙니다.");
		}

	}

}
