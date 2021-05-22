package chapter2;

import java.util.Scanner;
public class ScannerEx1 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in); // 키보드 입력
		System.out.println("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요");
		//첫 번째 입력 아이템은 int
		System.out.println("당신의 나이는 " + a.nextInt() + "살입니다.");
		//두 번째 입력 아이템은 double
		System.out.println("당신의 체중은 " + a.nextDouble() +"kg입니다.");
		//세 번째 입력 아이템은 double
		System.out.println("당신의 신장은 " + a.nextDouble() +"cm입니다.");

	}

}
