package loopexample;

public class BreakExample {

	public static void main(String[] args) {
		
		// 1������ ���� 100���� ū �ڿ��� �� ���� ���� ��, �׶��� ���� ���ϱ�

		int sum = 0;
		int num = 0;
		for (num = 0; ; num++) {
			sum += num;
			if (sum >= 100)
				break;

//			for(num=0; sum<100; num++){
//			sum+=num;
//			System.out.println("num: "+num); // sum�� 100�� �ʰ��ص� num�� �ѹ� �� �����Ǿ 15�� ��µȴ�.-->break�� ���
//			System.out.println("sum: "+sum); // 105

		}
		System.out.println("num: " + num +" ,sum: " + sum);
	}

}
