package loopexample;

public class NestedLoop {

	public static void main(String[] args) {
		int dan;
		int times;
		
		// 구구단 3단부터 7단까지만 출력
		for(dan=3;dan<=7;dan++) {
			for(times=1;times<=9;times++) {
				System.out.println(dan+"X"+times+"="+dan*times);
			}
			System.out.println(); //한 줄 띄워서 출력
		}

	}

}
  