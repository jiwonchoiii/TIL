package ifexample;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		// 월을 1~12의 정수로 읽어서 해당하는 계절을 표시하는 프로그램. switch문 사용
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		String season = null;

		switch (month) {
		case 1:
		case 2:
		case 12:
			season = "winter";
			break;
		case 3:
		case 4:
		case 5:
			season = "spring";
			break;
		case 6:
		case 7:
		case 8:
			season = "summer";
			break;
		case 9:
		case 10:
		case 11:
			season = "fall";
			break;
		default:
			season = "1~12의 정수를 입력하세요";
		}

		System.out.println(season);
	}

}
