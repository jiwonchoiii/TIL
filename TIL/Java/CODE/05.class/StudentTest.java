package classpart;

public class StudentTest {
	
	public static void main(String[] args) {
	
		Student student1 = new Student();
		student1.studentName = "�ȿ���";      // �� �޸𸮿� ������� �ν��Ͻ��� ã�ư��� ���� ��ġ��. student1�� ���� �޸𸮿�.
//		student1.studentName = "�Ƚ¿�";      //student1�� �ٲ��
	   	System.out.println(student1.getStudentName());
		System.out.println(student1);        // ��ġ�� ���
		Student student2 = new Student();
		student2.studentName = "�Ƚ¿�";
		System.out.println(student2.getStudentName());
		
		
	}
}
