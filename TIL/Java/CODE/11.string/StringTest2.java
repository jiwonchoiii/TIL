package string;

public class StringTest2 {

	public static void main(String[] args) {
		
		// String Ŭ������ ���� �ٲ� �� ����, ���ο� ���ڿ��� �����ؼ� �����Ѵ�.

		String javaStr = new String("Java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("ó�� ���ڿ� �ּ� ��: "+ System.identityHashCode(javaStr) );
		
		javaStr = javaStr.concat(androidStr); // ���� �� ó�� ���ڿ��� ������ �÷��Ϳ� ���� ���ŵǰ� ���̻� ������ �� ����.
		System.out.println(javaStr);
		System.out.println("����� ���ڿ� �ּ� ��: "+System.identityHashCode(javaStr));
		
		// + �����ڷ� ���ڿ��� ��ġ�� �޸𸮸� �����ϰ� �ȴٴ� ������ �ִ�.
	
	}

}
