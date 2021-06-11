package myapp;


import java.util.Arrays;
import lombok.extern.log4j.Log4j;


@Log4j
public class MainStringArrayArgument {

	public static void main(String... args) {
		log.info(args);
		log.info(args.length);
		log.info(Arrays.toString(args));

		//add 메소드 호출
		int sum = add(1,2,3,4,5,6,7,8,9,10);
		log.info("sum: " + sum);
	} // main

	static int add(int temp, int...ops) { // ops: operands(피연산자)
		log.debug("add(ops) invoked."); 
		
		log.info("\t+ ops:" + Arrays.toString(ops));
		int sum = 0;
		for (int i : ops) {
			sum = sum + i;
		}
		return sum;
	}
//		if(args.length !=2 ) {
//			log.info("프로그램의 사용법");
//			log.info("java MainStringArrayArgument num1 num2");
//			
//			System.exit(0); // JVM을 나가라.(강제 종료)
//		} // if
//		
//		String strNum1 = args[0];
//		String strNum2 = args[1];
//		
//		boolean arg1 = Boolean.parseBoolean(strNum1);
//		boolean arg2 = Boolean.parseBoolean(strNum2);
//		
//		
//		assert arg1 == arg2;
//		
//		//mapping
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);
//		
//		int result = num1+num2;
//		log.info(num1+"+"+num2+"="+result);

} // end of class
