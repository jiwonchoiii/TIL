// 숫자에 3의 배수가 포함된 개수 만큼 '짝'을 같이 출력하는 프로그램을 작성
public class FlowEx3 {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.printf("i = %d ", i);

			int tmp = i;

			do {
				if (tmp % 10 % 3 == 0 && tmp % 10 != 0) // 3의 배수이고 0이 아닌지 확인
					System.out.print("짝");

			} while ((tmp /= 10) != 0); // tmp = tmp/10

			System.out.println();
		}
	}
}

/*
 * do-while문이 실행되는 동안 tmp의 값은 'tmp /= 10'에 의해 바뀐다.
 * 예를 들어 i의 값이 63일 때 일의 자리가 3의 배수라서(tmp % 10 % 3 == 0 && tmp % 10 != 0) 짝이 출력된다.
 * 그리고 나서 tmp/=10에 의해 tmp값이 6으로 바뀐다. 이 때 tmp % 10 % 3 == 0 && tmp % 10 != 0 조건문이 참이므로 다시한번 짝이 출력된다.
 */
