package operator;

public class OperationEx1 {

	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 91;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);
		
//		double avgScore = totalScore / 3.0;    // 평균 값은 실수로 나올 수 있기 때문에 정수가 아니라 실수로 나눠준다. 
												// 3으로 나눠줘도 변수의 타입이 실수형이므로 값은 실수로 출력된다(정확하지 않은 값)
		
		double avgScore = (double)totalScore / 3;  // 명시적으로 형 변환해주면 가독성이 좋다.
		System.out.println(avgScore);
		
		System.out.printf("%.2f",avgScore);
	}

}
