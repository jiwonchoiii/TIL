package string;

public class StringBuilderTest {
	public static void main(String[] args) {

		// StringBuilder를 통해 문자열을 연결하면 같은 객체를 참조한다.
		// 새로운 문자열을 만드는게 아니라 기존의 문자열을 수정한다.
		String javaStr = new String("Java");
		System.out.println("javaStr 문자열 주소: " + System.identityHashCode(javaStr));

		StringBuilder buffer = new StringBuilder(javaStr); // String으로부터 StringBuilder 생성
		System.out.println("연산 전 buffer 메모리 주소: " + System.identityHashCode(buffer));
		buffer.append(" and"); // 문자열 추가
		buffer.append(" android");
		buffer.append(" programming is fun");
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));

		javaStr = buffer.toString(); // String 클래스로 반환. 문자열 값을 추출해서 새롭게 메모리에 할당한다
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 주소: " + System.identityHashCode(javaStr));
	}

}
