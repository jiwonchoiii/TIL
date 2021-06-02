// 1~10 중 3의 배수가 아닌 숫자를 출력하는 프로그램 작성
public class FlowEx5 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0)
				continue;
			System.out.println(i);
		}
	}
}
