package finalex;

public class UsingDefine {

	public static void main(String[] args) {
		System.out.println(Define.GOOD_MORNING);			// static으로 선언한 상수이므로 인스턴스를 생성하지않고 클래스 이름으로 참조 가능
		System.out.println("최솟값은 " + Define.min + "입니다.");
		System.out.println("최대값은 " + Define.max + "입니다.");
		System.out.println("수학 과목 코드값은 " + Define.MATH + "입니다.");
		System.out.println("영어 과목 코드값은 " + Define.ENG + "입니다.");

	}

}
