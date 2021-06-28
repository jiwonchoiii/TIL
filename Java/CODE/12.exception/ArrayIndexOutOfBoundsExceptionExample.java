package runtime_exception;


import lombok.extern.log4j.Log4j;


@Log4j
public class ArrayIndexOutOfBoundsExceptionExample {

	
	public static void main(String[] args) {
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			String data3 = args[2];

			log.info("args[0]: " + args[0]);
			log.info("args[1]: " + args[1]);
			log.info("args[2]: " + args[2]);
			
		} else {
			log.info("[실행 방법]");

			System.out.print("java ArrayIndexOutOfBoundsExceptionExample ");
			System.out.print("값1 값2");
		} // if-else
		
	} // main

} // end class
