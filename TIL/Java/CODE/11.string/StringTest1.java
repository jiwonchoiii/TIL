package string;

public class StringTest1 {

	public static void main(String[] args) {

			String str1 = new String("abc");
			String str2 = new String("abc");
			
			System.out.println(str1==str2); // false. ��ġ �� ��(���۷���) ���ڿ��� ���۷����� ���ϴ� ���� ���� ����.
			System.out.println(str1.equals(str2)); // true. �� ��(���ڿ�)
	
			//str3�� str4�� ��ü�� �����Ͽ� ���� �ִ°� �ƴϰ� ��� Ǯ�� ���ڿ��� �����ϰ� �װ��� ����Ű���� ��Ÿ���� ����̴�.
			String str3 = "abc"; // ����̱� ������ ���� �ٲٸ� ���ο� ��� Ǯ ����
			String str4 = "abc";
			System.out.println(str3==str4);  // true. ���ڿ� abc�� ���Ǯ�� ����Ǿ� �����Ƿ� ����Ű�� �ּҰ� ����.
			System.out.println(str3.equals(str4)); // true
	}

}
