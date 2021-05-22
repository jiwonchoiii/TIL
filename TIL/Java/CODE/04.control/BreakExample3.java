package loopexample;

public class BreakExample3 {

	public static void main(String[] args) {
		
		// 1부터 더한 총 합이 900000000000000L 이상인 가장 작은 자연수 구하기
		// n(n+1)/2 =90000000000000L 을 만족하는 실수를 찾고 정수로 바꾼다. 이차방정식->근의 공식 활용 

		long sum = 900000000000000L;  
		
		double f = ( -1 + Math.sqrt( 1 - 4 * (-2 * sum)) )/2;
		System.out.println(f);
		int n = ( (f - (int)f) > 0) ? (int)(f+1) : (int)f;
	
		
		System.out.println(n);
	}
	
	
	
}
