package loopexample;

public class ContinueExample {

	public static void main(String[] args) {
		int total = 0;
		int num;

//		for(num = 1; num<=100; num++) {
//			if(num%2==0)
//				continue;
//			total += num;
//			}


		for (num = 1; num <= 100; num++) {
			if (num % 2 != 0)   //num%2==1
				total += num;			
		}
		System.out.println("1부터 100까지 홀수의 합은" + total + "입니다.");

	}

}
