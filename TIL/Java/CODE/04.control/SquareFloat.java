package loopexample;

public class SquareFloat {

	public static void main(String[] args) {
		// 0.0���� 1.0���� 0.001������ ������Ű�� ���� ǥ��(�ݺ��� float������ ����)

		float i;
		for (i = 0.0F; i <= 1.0F; i += 0.001F) {
		
			//System.out.printf(i+"X"+i+"= " + "%f%n", i * i);
			System.out.printf("%5.3f  %10.7f\n",i,i*i);
	
			
			
		}

	}

}
