package inheritance2;


import lombok.extern.log4j.Log4j;


@Log4j
public class StudentExample {

	public static void main(String[] args) {
		//자식객체 생성(이 때 자식객체의 생성자 내에서, 
		//우선적으로 부모객체의 생성자 호출이 발생함- by super()
	//	Student student = new Student("최지원", "123456-1234567", 1);
		Student student = new Student();
		
		//부모 객체에서 상속받은 필드의 사용
		log.info("name: " + student.name);
		log.info("ssn: " + student.ssn);
		
		//자식 객체의 필드 사용
		log.info("studentNo: " + student.studentNo);

	} // main

} // end class