package staticex;

public class Student2 {
	public static int serialNum = 1000; // static����(Ŭ��������)�� �ν��Ͻ� ������ ��� ���� ���� ������
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

	public static int getSerialNum() {		// �ν��Ͻ� ������ ���� �ʾƼ� �������(studentName) ���Ұ�, serialNum�� static ������ ��� ����
		int i = 10;				
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Student2.serialNum = serialNum;
	}
}
