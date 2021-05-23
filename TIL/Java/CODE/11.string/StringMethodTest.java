package string;

import java.util.Arrays;

public class StringMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = " abcd";
		String b = ",efg";

		String a1 = a.concat(b);
		String a2 = a.trim();
		String a3 = a.replace("ab", "12");
		String[] s = a.split(",");
		String a4 = a.substring(3);

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(Arrays.toString(s));
		System.out.println(a4);

	}

}
