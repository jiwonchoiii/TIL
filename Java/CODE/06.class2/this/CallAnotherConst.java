package thisex;

class Person {
	String name;
	int age;
	String gender;

	Person() {
		this("이름 없음", 1, "M");
	}

	Person(String name, int age) {
		this(name, age, "M");
	}

	Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

	}

	Person returnItSelf() { // 반환형은 클래스형
		return this; // this 반환
	}

	public String toString() {
		return "이 객체는 개인 프로필을 생성하는 객체입니다";
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println(noName.gender);

		Person p = noName.returnItSelf();  // this값을 클래스 변수에 대입
		System.out.println(p); 			   // noName.returnItSelf()의 반환 값 출력
		System.out.println(noName);
		
	}
}
