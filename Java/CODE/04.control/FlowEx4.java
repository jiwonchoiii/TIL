// 숫자 1부터 계속 더할 때 언제 100이 넘는지 구하고, 그 때의 총합을 프로그램
public class FlowEx4 {
	public static void main(String[] args) {

		int sum = 0;
		int i = 0;
		while (true) {
			if (sum > 100)
				break;
			i++;
			sum += i;

		}
		System.out.println(i);
		System.out.println(sum);
	}
}
