package myapp;

import lombok.extern.log4j.Log4j;

@Log4j
public class VariableExample {
	
	
	public static void main(String[] args) {
		int value = 10;

		int result = value + 10;

		log.info(result);
	}//main
}// end of class
