package classpart;

public class StudentTest {
	
	public static void main(String[] args) {
	
		Student student1 = new Student();
		student1.studentName = "안연수";      // 힙 메모리에 만들어진 인스턴스를 찾아가기 위한 위치값. student1은 스택 메모리에.
//		student1.studentName = "안승연";      //student1이 바뀐다
	   	System.out.println(student1.getStudentName());
		System.out.println(student1);        // 위치값 출력
		Student student2 = new Student();
		student2.studentName = "안승연";
		System.out.println(student2.getStudentName());
		
		
	}
}
