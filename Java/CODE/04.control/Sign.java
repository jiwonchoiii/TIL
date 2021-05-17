package ifexample;

import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
	//  정수값을 읽어 부호(양수/음수/0)을 판정해서 표시
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값: ");
		
		int x = sc.nextInt();
		
		if(x>0) {
			System.out.println("이 값은 양수입니다.");
		}else if(x<0){
			System.out.println("이 값은 음수입니다");
		}else{
			System.out.println("이 값은 0입니다");
		}
	
	

}
}