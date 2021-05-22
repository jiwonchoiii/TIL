package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001,"Lee");
		studentLee.addSubject("국어", 80);
		studentLee.addSubject("수학", 75);
		studentLee.addSubject("영어", 85);

		Student studentKim = new Student(1002,"kim");
		studentKim.addSubject("수학", 100);
		studentKim.addSubject("과학", 95);
		
		studentLee.showStudentInfo();
		System.out.println();
		studentKim.showStudentInfo();
	}

}
