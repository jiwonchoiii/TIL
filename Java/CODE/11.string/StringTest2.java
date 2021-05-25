package string;

public class StringTest2 {

	public static void main(String[] args) {
		
		// String 클래스는 값을 바꿀 수 없고, 새로운 문자열을 생성해서 참조한다.

		String javaStr = new String("Java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값: "+ System.identityHashCode(javaStr) );
		
		javaStr = javaStr.concat(androidStr); // 연결 후 처음 문자열은 가비지 컬렉터에 의해 제거되고 더이상 참조할 수 없다.
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값: "+System.identityHashCode(javaStr));
		
		// + 연산자로 문자열을 합치면 메모리를 낭비하게 된다는 단점이 있다.
	
	}

}
