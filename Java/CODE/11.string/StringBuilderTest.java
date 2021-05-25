package string;

public class StringBuilderTest {
	public static void main(String[] args) {

		// StringBuilder�� ���� ���ڿ��� �����ϸ� ���� ��ü�� �����Ѵ�.
		// ���ο� ���ڿ��� ����°� �ƴ϶� ������ ���ڿ��� �����Ѵ�.
		String javaStr = new String("Java");
		System.out.println("javaStr ���ڿ� �ּ�: " + System.identityHashCode(javaStr));

		StringBuilder buffer = new StringBuilder(javaStr); // String���κ��� StringBuilder ����
		System.out.println("���� �� buffer �޸� �ּ�: " + System.identityHashCode(buffer));
		buffer.append(" and"); // ���ڿ� �߰�
		buffer.append(" android");
		buffer.append(" programming is fun");
		System.out.println("���� �� buffer �޸� �ּ�: " + System.identityHashCode(buffer));

		javaStr = buffer.toString(); // String Ŭ������ ��ȯ. ���ڿ� ���� �����ؼ� ���Ӱ� �޸𸮿� �Ҵ��Ѵ�
		System.out.println(javaStr);
		System.out.println("����� javaStr ���ڿ� �ּ�: " + System.identityHashCode(javaStr));
	}

}
