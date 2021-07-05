package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//RetentionPolicy: annotation의 유지 정책
//source - 컴파일 할 때까지만 유효하다. 컴파일 후엔 사라짐
//class(default) - 바이트코드에는 기록되지만, 런타임 할 때는 유지되지 않는다.
//runtime - 바이트코드에 기록되고, 런타임 할때도 유지된다. 


// 우리가 선언한 어노테이션을 클래스의 어느 부분에 붙일 수 있는지를 ElementType 열거상수들로 지정한다. 
@Target({
	ElementType.METHOD, 
//	ElementType.TYPE,
//	ElementType.FIELD,
//	ElementType.PARAMETER,
//	ElementType.CONSTRUCTOR,
//	ElementType.LOCAL_VARIABLE,
//	ElementType.ANNOTATION_TYPE,
//	ElementType.PACKAGE,  //package-info.java에 어노테이션을 붙일 수 있다.
//	ElementType.TYPE_USE  //메소드를 제외한 부분에 어노테이션을 붙일 수 있다.(많이 쓰지 않음) 
})   

//어노테이션 배열을 만들 때 - 값이 하나만 있다면 중괄호를 생략할 수 있다.
//마지막 원소의 뒤에 , 를 붙여도 오류나지 않는다. 


//@PrintAnnotation
public @interface PrintAnnotation {
	
	
//	어노테이션 속성의 타입으로는 아래가 가능하다.
//	 (1) 기본타입(Primitive type)
//	 (2) String
//	 (3) 열거타입(Enumertation type)
//	 (4) Class 타입 (clazz)
//   (5) 위의 (1)~(4) 까지의 타입으로 구성된 배열(Array)
//   클래스, 인터페이스는 불가 
	
	String value() default "-"; // 기본 속성의 이름은 value이고, 타입은 무관하다.
	int number() default 15;

} // end @interface
