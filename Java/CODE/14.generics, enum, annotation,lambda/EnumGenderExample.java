package myapp;

import lombok.extern.log4j.Log4j;

@Log4j
public class EnumGenderExample {
	
	public enum Grade { 
		수, 우, 미, 양, 가
	} // enum
	public enum Gender {
		MALE, FEMALE
	} // enum

	public static void main(String... args) {
		
//		public enum Grade { 
//			수, 우, 미, 양, 가
//		} // enum

		Gender gender = null;
		gender = Gender.MALE;
		// gender = true;
		log.info(gender);

		Grade grade = Grade.수;
		log.info(grade);
		
		
	} // main
} // end of class

