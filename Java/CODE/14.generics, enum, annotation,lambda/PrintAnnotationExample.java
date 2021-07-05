package annotation;


import java.lang.reflect.Method;
import java.util.Arrays;


public class PrintAnnotationExample {

	
	// Service 클래스에 붙인 어노테이션 정보를 이용해서,
	// 어노테이션이 장착된 메소드에 대해서 특수한 기능을 수행하자
	public static void main(String[] args) {

		// 1.Service 클래스의 Clazz 객체를 얻어냄
		Class<Service> clazz = Service.class;

		// 2.Clazz 객체로부터, Service 클래스에 선언된 모든 메소드 정보를 배열로 획득
		Method[] declaredMethods = clazz.getDeclaredMethods();
		System.out.println(">>>>>>>>>"+Arrays.toString(declaredMethods));  

		// 3.Method 객체를 하나씩 처리
		for (Method method : declaredMethods) {
			// 4. PrintAnnotation이 어느 메소드에 적용되었는지 확인
			if (method.isAnnotationPresent(PrintAnnotation.class)) { //매개변수의 타입이 class

				// 4-1.PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation =
						// Method 타입의 메소드 중에, 어노테이션을 반환하는 메소드가 있음
						// 즉, Method.getAnnotation(Clazz)
						method.getAnnotation(PrintAnnotation.class);

				// 4-2.메소드 이름 출력
				System.out.println("[" + method.getName() + "]");

				// 4-3.구분선 출력
				// PrintAnnotation의 속성 중에, number() 속성값을 이용 
				for (int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value()); //number 속성값 만큼 value의 값을 출력
				} // classical for

				System.out.println("");

				try {
					// 메소드 호출
					method.invoke(new Service());
				} catch (Exception e) {
					;;
				} // try-catch

				System.out.println("");

			} // if

		} // enhanced for

	} // main

} // end class
