package ifexample;

import java.util.Scanner;
public class IfExample3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수: ");
		
		int score = sc.nextInt();
		char grade;
		if(score>=90) {
			grade = 'A';			
		}else if(score>=80) {
			grade = 'B';
		}else if(score>=70) {
			grade = 'C';
		}else if(score>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		
	}
	System.out.print(score+"점의 학점은 "+grade+"입니다");
}
}