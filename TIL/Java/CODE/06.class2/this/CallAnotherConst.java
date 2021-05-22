package thisex;

class Person {
	String name;
	int age;
	String gender;

	Person() {
		this("�̸� ����", 1, "M");
	}

	Person(String name, int age) {
		this(name, age, "M");
	}

	Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

	}

	Person returnItSelf() { // ��ȯ���� Ŭ������
		return this; // this ��ȯ
	}

	public String toString() {
		return "�� ��ü�� ���� �������� �����ϴ� ��ü�Դϴ�";
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println(noName.gender);

		Person p = noName.returnItSelf();  // this���� Ŭ���� ������ ����
		System.out.println(p); 			   // noName.returnItSelf()�� ��ȯ �� ���
		System.out.println(noName);
		
	}
}
