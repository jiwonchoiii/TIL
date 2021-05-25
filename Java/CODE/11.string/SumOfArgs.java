package string.practice;

public class SumOfArgs {
	public static void main(String[] args) {
		double sum = 0.0;  // int sum이라고 하면 다른 결과가 나온다.
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]= " + args[i]);
			// args[i]는 문자열이므로 숫자로 바꿔야한다.
			sum += Double.parseDouble(args[i]); // 
			
		}
		
		System.out.println("합계는 "+sum+"입니다.");
	}
}
