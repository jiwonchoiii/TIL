package ifexample;

import java.util.Scanner;

public class Grade1 {

	public static void main(String[] args) {
		// 입력한 점수에따라 수우미양가를 판정하는 프로그램을 작성 - 논리곱 연산자 &&를 이용

		Scanner sc = new Scanner(System.in);

		System.out.print("점수: ");

		int score = sc.nextInt();

		// 오름차순, 내림차순을 적절하게 사용해야한다.
		
		if(score>=0 && score<=49)
			System.out.println("가");
		else if(score>=50 && score<59)
			System.out.println("양");
		else if(score >= 60 && score <= 69)
			System.out.println("미");			
		else if(score >= 70 && score <= 79)
			System.out.println("우");			
		else if(score >= 80 && score <= 100)
			System.out.println("수");	
		else
			System.out.println("잘못된 점수입니다.");
			
			

//		if (score < 0 || score > 100)
//			System.out.println("잘못된 점수입니다.");
//		if (score >= 90)
//			System.out.println("수");
//		else if (score >= 80)
//			System.out.println("우");
//		else if (score >= 70)
//			System.out.println("미");
//		else if (score >= 60)
//			System.out.println("양");
//		else 
//			System.out.println("가");

	}

}
