package string.practice;

public class SumOfArgs {
	public static void main(String[] args) {
		double sum = 0.0;  // int sum�̶�� �ϸ� �ٸ� ����� ���´�.
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]= " + args[i]);
			// args[i]�� ���ڿ��̹Ƿ� ���ڷ� �ٲ���Ѵ�.
			sum += Double.parseDouble(args[i]); // 
			
		}
		
		System.out.println("�հ�� "+sum+"�Դϴ�.");
	}
}
