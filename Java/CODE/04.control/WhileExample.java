package loopexample;

public class WhileExample {

	public static void main(String[] args) {
		int num = 10;
		int sum = 0;
		
		while(num<=10) {
			sum += num ;
			num++;
		}
		
		// n(n+1)/2 공식으로 구하기(숫자가 큰 경우)
		
	
//		sum = (num*(num+1))/2;
		
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다");
	}

}
