package array;

public class StudentArray {

	public static void main(String[] args) {

		String[] studentName = { "James", "Tomas", "Edward" };

		Student[] students = new Student[studentName.length];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student(1000 + i, studentName[i]);
		}

		for (int i = 0; i < students.length; i++) {
			students[i].showStudentInfo();
		}

	}
}
