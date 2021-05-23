package string;

public class StringMethod {
	public static void main(String[] args) {

		// SubString
		String a = "java.lang.object";
		String c = a.substring(5, 9); // ������ start index <= x < end index
		String p = a.substring(10);

		System.out.println(c);
		System.out.println(p);

		// String[] split(String regex)
		// ���ڿ��� ������ �и���(regex)�� ������ ���ڿ� �迭�� ��� ��ȯ�Ѵ�.

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
		// ���ڿ��� index��° ���ڸ� ��ȯ�Ѵ�.
		String x = "abcd";
		char b = x.charAt(2);

		System.out.println(b);
		
		// indexOf(String str)
		// indexOf(String str, int fromIndex) fromIndex�� �˻� ������ �����Ѵ�. ã�����ϸ� -1�� ��ȯ�Ѵ�.
		// charAt�� �ݴ��� �޼ҵ�. ���ڿ��� ��ġ���� �˷��ش�
		// SubString�� �Ű������� ����� �� �ִ�.
		String y = "abcdefcgc";
		System.out.println(y.indexOf("c")); 
		System.out.println(y.indexOf("c", 2));
		System.out.println(y.indexOf("c", 3));
		System.out.println(y.indexOf("de"));
		System.out.println(y.indexOf("de",4));
		
		
		// lastIndexOf
		// int lastIndexOf(String str)
		// int lastIndexOf(String str, int fromIndex)
		// ���ڿ��� ������ �ε����� �������� ù��° �ε������� �˻��Ѵ�.		 
		String q = "abcdkdkdkso";
		System.out.println(q.lastIndexOf("k"));
		System.out.println(q.lastIndexOf("d"));
		System.out.println(q.lastIndexOf("d", 6));
		System.out.println(q.lastIndexOf("dk"));
		
		//contains
		//boolean contains(charSequence s)
		//������ ����(s)�� ���ԵǾ����� �˻��Ѵ�.	
		String w = "java";
		boolean e = w.contains("v");
		boolean r = w.contains("jva");
		System.out.println(e);
		System.out.println(r);
		
		// startsWith
		// boolean startsWith(String prefix)
		// boolean startsWith(String prefix, int toffset)
		// Ư�� ���ڷ� �����ϴ��� �˻��Ѵ�. toffset �Ķ���͸� �̿��� ������ġ�� ������ �� �ִ�.
		String t = "I am a boy !";
		System.out.println(t.startsWith("i"));
		System.out.println(t.startsWith("a", 2));
		
		
		// endsWith
		// boolean endsWith(String suffix)
		// ������ ���ڿ�(suffix)�� �������� �˻��Ѵ�. startsWith���� ���� ���δ�. 
		String u = "punch drunk love";
		System.out.println(u.endsWith("love"));

	
		// equals
		// boolean equals(Object obj)
		// �Ű������� ���� ���ڿ�(obj)�� String�ν��Ͻ��� ���ڿ��� ���Ѵ�. obj�� String�� �ƴϰų�
		// ���ڿ��� �ٸ��� false�� ��ȯ�Ѵ�. String Ŭ������ equals �޼ҵ带 �������̵� �ؼ� ����Ѵ�.
		String i = "hello";
		boolean I = i.equals("Hello");
		System.out.println(I);
		
		// replace
		// String replace
		// ���ڿ� ���� ���ڿ�(old)�� ���ο� ���ڿ�(new)�� ��� �ٲ� ���ڿ��� ��ȯ�Ѵ�.
		String o = "hellollo";
		String O = o.replace("o", "l");
		System.out.println(O);
		
		// isEmpty
		// boolean isEmpty()
		// ����ִ��� Ȯ���Ѵ�.
		// String f = null; ����
		String f = ""; //true
		String F = " "; //false
		System.out.println(f.isEmpty());
		System.out.println(F.isEmpty());
		
		// toString
		// String toString
		// String �ν��Ͻ��� ����Ǿ� �ִ� ���ڿ��� ��ȯ�Ѵ�.
		String g ="Hello";
		String G =g.toString();
		System.out.println(G);
		
		// toLowerCase
		// �ν��Ͻ��� ����Ǿ��ִ� ��� ���ڿ��� �ҹ��ڷ� ��ȯ�Ͽ� ��ȯ�Ѵ�.
		// toUpperCase
		// �ν��Ͻ��� ����Ǿ��ִ� ��� ���ڿ��� �빮�ڷ� ��ȯ�Ͽ� ��ȯ �Ѵ�.
		String lc = "jaVaJavaAAA";
		String lc1 = lc.toLowerCase();
		String lc2 = lc.toUpperCase();
		System.out.println(lc1);
		System.out.println(lc2);
		
		// Trim
		// ���ڿ��� �յ� ������ ���� ����� ��ȯ�Ѵ�. ���ڿ��� �߰��� �ִ� ������ ���ŵ��� �ʴ´�.
		// trim�� �Ⱦ��� length�� �߸��� ����� ���� �� �ִ�.
		String trim ="     java ";
		String trim1 = trim.trim();
		System.out.println(trim);		
		System.out.println(trim1);
		
		// length
		// ���ڿ��� ������ ��ȯ�Ѵ�.
		String h = "studying java";
		System.out.println(h.length()); // ���鵵 count
		
		// valueOf
		// ��ƿ��Ƽ �޼ҵ� - �ν��Ͻ��� ������ �ʾƵ� �ȴ�. (static)
		String j = String.valueOf(h);
		System.out.println(j);
		
	}
}
