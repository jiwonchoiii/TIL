package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(1001,"Lee");
		studentLee.addSubject("����", 80);
		studentLee.addSubject("����", 75);
		studentLee.addSubject("����", 85);

		Student studentKim = new Student(1002,"kim");
		studentKim.addSubject("����", 100);
		studentKim.addSubject("����", 95);
		
		studentLee.showStudentInfo();
		System.out.println();
		studentKim.showStudentInfo();
	}

}
