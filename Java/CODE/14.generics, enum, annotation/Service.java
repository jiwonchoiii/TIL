package annotation;


import lombok.NoArgsConstructor;


@NoArgsConstructor(access = lombok.AccessLevel.PUBLIC)


//public @PrintAnnotation class Service {
 public class Service {
//접근제한자 앞뒤에는 쓸 수 있지만 class 키워드, 변수 타입, 리턴 타입 뒤에는 쓸 수 없다. 	
	

	
	@PrintAnnotation	   	// 모든 속성에 default값이 있는 경우 아무 값도 전달하지 않아도 됨
	public void method1() {   
		System.out.println("method1() invoked.");
	} // method1


	@PrintAnnotation("☆") //값 하나만 전달 --> 기본속성(value)에 값을 전달 
	public void method2() {
		System.out.println("method2() invoked.");
		
		//지역변수 선언 - 지역변수에는 메소드의 매개변수가 포함된다. 
		 int temp = 100;
		 String tempName = "Yoseph";
	} // method2

	@PrintAnnotation(value="#", number=20) // 두 개 이상의 값을 전달할 때는 이름을 꼭 적어준다.
	public void method3() {
		System.out.println("method3() invoked.");
	} // method3

} // end class
