package string;

public class StringMethod {
	public static void main(String[] args) {

		// SubString
		String a = "java.lang.object";
		String c = a.substring(5, 9); // 범위는 start index <= x < end index
		String p = a.substring(10);

		System.out.println(c);
		System.out.println(p);

		// String[] split(String regex)
		// 문자열로 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.

		String animal = "dog,cat,bear";
		String[] arr = animal.split(",");

		for (String b : arr) {
			System.out.println(b);
		}

		String color = "black white purple";
		String[] arr1 = color.split(" ");

		for (String b : arr1) {
			System.out.println(b);
		}

		// charAt
		// 문자열의 index번째 문자를 반환한다.
		String x = "abcd";
		char b = x.charAt(2);

		System.out.println(b);
		
		// indexOf(String str)
		// indexOf(String str, int fromIndex) fromIndex는 검색 범위를 지정한다. 찾지못하면 -1을 반환한다.
		// charAt과 반대인 메소드. 문자열의 위치값을 알려준다
		// SubString의 매개변수로 사용할 수 있다.
		String y = "abcdefcgc";
		System.out.println(y.indexOf("c")); 
		System.out.println(y.indexOf("c", 2));
		System.out.println(y.indexOf("c", 3));
		System.out.println(y.indexOf("de"));
		System.out.println(y.indexOf("de",4));
		
		
		// lastIndexOf
		// int lastIndexOf(String str)
		// int lastIndexOf(String str, int fromIndex)
		// 문자열의 마지막 인덱스를 기준으로 첫번째 인덱스까지 검색한다.		 
		String q = "abcdkdkdkso";
		System.out.println(q.lastIndexOf("k"));
		System.out.println(q.lastIndexOf("d"));
		System.out.println(q.lastIndexOf("d", 6));
		System.out.println(q.lastIndexOf("dk"));
		
		//contains
		//boolean contains(charSequence s)
		//지정된 문자(s)이 포함되었는지 검사한다.	
		String w = "java";
		boolean e = w.contains("v");
		boolean r = w.contains("jva");
		System.out.println(e);
		System.out.println(r);
		
		// startsWith
		// boolean startsWith(String prefix)
		// boolean startsWith(String prefix, int toffset)
		// 특정 문자로 시작하는지 검색한다. toffset 파라메터를 이용해 시작위치를 조정할 수 있다.
		String t = "I am a boy !";
		System.out.println(t.startsWith("i"));
		System.out.println(t.startsWith("a", 2));
		
		
		// endsWith
		// boolean endsWith(String suffix)
		// 지정된 문자열(suffix)로 끝나는지 검사한다. startsWith보다 자주 쓰인다. 
		String u = "punch drunk love";
		System.out.println(u.endsWith("love"));

	
		// equals
		// boolean equals(Object obj)
		// 매개변수로 받은 문자열(obj)과 String인스턴스의 문자열을 비교한다. obj가 String이 아니거나
		// 문자열이 다르면 false를 반환한다. String 클래스는 equals 메소드를 오버라이드 해서 사용한다.
		String i = "hello";
		boolean I = i.equals("Hello");
		System.out.println(I);
		
		// replace
		// String replace
		// 문자열 중의 문자열(old)을 새로운 문자열(new)로 모두 바꾼 문자열을 반환한다.
		String o = "hellollo";
		String O = o.replace("o", "l");
		System.out.println(O);
		
		// isEmpty
		// boolean isEmpty()
		// 비어있는지 확인한다.
		// String f = null; 오류
		String f = ""; //true
		String F = " "; //false
		System.out.println(f.isEmpty());
		System.out.println(F.isEmpty());
		
		// toString
		// String toString
		// String 인스턴스에 저장되어 있는 문자열을 반환한다.
		String g ="Hello";
		String G =g.toString();
		System.out.println(G);
		
		// toLowerCase
		// 인스턴스에 저장되어있는 모든 문자열을 소문자로 변환하여 반환한다.
		// toUpperCase
		// 인스턴스에 저장되어있는 모든 문자열을 대문자로 변환하여 반환 한다.
		String lc = "jaVaJavaAAA";
		String lc1 = lc.toLowerCase();
		String lc2 = lc.toUpperCase();
		System.out.println(lc1);
		System.out.println(lc2);
		
		// Trim
		// 문자열의 앞뒤 공백을 없앤 결과를 반환한다. 문자열의 중간에 있는 공백은 제거되지 않는다.
		// trim을 안쓰면 length에 잘못된 결과가 나올 수 있다.
		String trim ="     java ";
		String trim1 = trim.trim();
		System.out.println(trim);		
		System.out.println(trim1);
		
		// length
		// 문자열의 개수를 반환한다.
		String h = "studying java";
		System.out.println(h.length()); // 공백도 count
		
		// valueOf
		// 유틸리티 메소드 - 인스턴스를 만들지 않아도 된다. (static)
		String j = String.valueOf(h);
		System.out.println(j);
		
	}
}
