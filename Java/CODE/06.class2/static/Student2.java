package staticex;

public class Student2 {
	public static int serialNum = 1000; // static변수(클래스변수)는 인스턴스 생성과 상관 없이 먼저 생성됨
	public int studentID;
	public String studentName;
	public int grade;
	public String address;

	public Student2() {
		serialNum++;
		studentID = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;
	}

	public static int getSerialNum() {		// 인스턴스 생성이 되지 않아서 멤버변수(studentName) 사용불가, serialNum은 static 변수라서 사용 가능
		int i = 10;				
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
