package function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class FunctionExample1 {

	
	private static List<Student> list = Arrays.asList(
			new Student("최지원", 90, 96), 
			new Student("신용권", 95, 93)
			); //Arrays helper class의 asList(가변인자)메소드를 이용해서, List 객체를 생성

	//Student => String으로 매핑하여 반환
	//R apply(T t); ==> String apply(Student student)
	public static void printString(Function<Student, String> function) {
		for (Student student : list) {
			log.info(function.apply(student) + " ");
		} // enhanced for 
		
		log.info("");
	} //printString

	//Student => int로 매핑하여 반환
	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			log.info(function.applyAsInt(student) + " ");
		} // enhanced for
		
		log.info("");
	}// printInt


	public static void main(String[] args) {
		log.info("[학생 이름]");

		// 람다식이 만들어낸 익명구현객체(추상메소드를 오버라이딩해서 구현)를 호출메소드의 전달인자로 던진다
		//  R apply(T t);
		FunctionExample1.printString( s -> s.getName() ); 
		
		//------------------------------------//
		
		// 지역변수로 Function<T,R> 타입의 변수를 선언하였습니다.
		Function<Student, String> func;
		//람다식으로 익명구현객체를 만들어 초기화하세요
	
		func = s -> s.getName();
		String name = func.apply(new Student("Yoseph",100,100));
		
		log.info(name);

	} // main
	
} // end class