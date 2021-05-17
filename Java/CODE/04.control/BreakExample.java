package loopexample;

public class BreakExample {

	public static void main(String[] args) {
		
		// 1부터의 합이 100보다 큰 자연수 중 제일 작은 값, 그때의 총합 구하기

		int sum = 0;
		int num = 0;
		for (num = 0; ; num++) {
			sum += num;
			if (sum >= 100)
				break;

//			for(num=0; sum<100; num++){
//			sum+=num;
//			System.out.println("num: "+num); // sum이 100을 초과해도 num이 한번 더 증감되어서 15가 출력된다.-->break문 사용
//			System.out.println("sum: "+sum); // 105

		}
		System.out.println("num: " + num +" ,sum: " + sum);
	}

}
