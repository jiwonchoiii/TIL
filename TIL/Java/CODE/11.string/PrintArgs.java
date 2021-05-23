package string.practice;

public class PrintArgs {
	public static void main(String[] args) {
		// 프로그램 실행시에 커맨드라인에서 부여한 문자열(커맨드라인 인수)를 모두 표시하는 프로그램
		// Run configurations - Arguments. 구분은 공백으로 준다
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]= " + args[i]);
		}

	}
}
