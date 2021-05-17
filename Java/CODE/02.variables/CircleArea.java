package chapter2;

public class CircleArea {

	public static void main(String[] args) {
		// 반지름이 10인 원의 면적을 구하세요.
		
		final double PI = 3.14;
		double radius = 10;
		double circleArea = 0;
		
		circleArea = radius*radius*PI;
		
		System.out.print("원의 면적 = ");
		System.out.println(circleArea);
		
	}

}
