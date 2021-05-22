package loopexample;

public class SquareFloat {

	public static void main(String[] args) {
		// 0.0부터 1.0까지 0.001단위로 증가시키며 제곱 표시(반복을 float형으로 제어)

		float i;
		for (i = 0.0F; i <= 1.0F; i += 0.001F) {
		
			//System.out.printf(i+"X"+i+"= " + "%f%n", i * i);
			System.out.printf("%5.3f  %10.7f\n",i,i*i);
	
			
			
		}

	}

}
