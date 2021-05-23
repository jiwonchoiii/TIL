package string;

public class StringTest1 {

	public static void main(String[] args) {

			String str1 = new String("abc");
			String str2 = new String("abc");
			
			System.out.println(str1==str2); // false. 위치 값 비교(레퍼런스) 문자열의 레퍼런스를 비교하는 경우는 거의 없다.
			System.out.println(str1.equals(str2)); // true. 값 비교(문자열)
	
			//str3과 str4는 객체를 생성하여 값을 넣는게 아니고 상수 풀에 문자열을 생성하고 그것을 가리키도록 나타내는 방식이다.
			String str3 = "abc"; // 상수이기 때문에 값을 바꾸면 새로운 상수 풀 생성
			String str4 = "abc";
			System.out.println(str3==str4);  // true. 문자열 abc는 상수풀에 저장되어 있으므로 가리키는 주소가 같다.
			System.out.println(str3.equals(str4)); // true
	}

}
