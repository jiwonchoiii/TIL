package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	double height;
	double weight;

	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
//	public static void main(String[] args) {
//		Student studentAhn = new Student()	;		// 힙영역에 Student라는 인스턴스가 생성되고 , studentAhn은 그 객체를 참조한다
//		studentAhn.studentName = "안연수";
//		
//		System.out.println(studentAhn.studentName);
//		System.out.println(studentAhn.getStudentName());
	
}
