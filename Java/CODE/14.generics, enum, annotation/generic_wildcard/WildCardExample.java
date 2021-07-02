package generic_wildcard;

import java.util.Arrays;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class WildCardExample {
	//메소드나 생성자의 매개변수에 제네릭타입이 올 때 와일드카드가 쓰인다.
	
	// 모든 사람을 대상으로 하는 교육과정 내역 출력
	public static void printCourse(Course<?> course) {
		log.info(course.getName() + "수강생: " + Arrays.toString(course.getStudents())); // info
	}// printCourse

	// 학생(Student)을 대상으로 하는 교육과정 내역 출력
	public static void printCourseStudent(Course<? extends Student> course) {
		log.info(course.getName() + "수강생: " + Arrays.toString(course.getStudents())); // info
	} // printCourseStudent

	// 근로자(Worker)이거나 하위 타입을 대상으로 하는 교육과정 내역 출력
	public static void printCourseWorker(Course<? super Worker> course) {
		log.info(course.getName() + "수강생: " + Arrays.toString(course.getStudents())); // info
	} // printCourseWorker


	//----------------------------------//
	public static void main(String[] args) {
		
		//1. 일반인을 대상으로 하는 교육과정을 생성. 이때, "구체타입" 지정
		Course<Person> personCourse = new Course<>("일반인과정", 5);  //타입추론
		
		//일반인 대상 교육과정에 학생을 추가
		 personCourse.add(new Person("일반인"));
		 personCourse.add(new Person("직장인"));  
		 personCourse.add(new Person("학생")); 	
		 personCourse.add(new Person("고등학생")); 
		 
		 Course<?> course = personCourse; //다형성이 아님. 타입파라미터만 다른 것
		 
		 log.info(" - course: "+course);
		 log.info(" - course: "+course.getName());
		 log.info(" - students: "+Arrays.toString(course.getStudents()));
		 
		 
		 //2. 직장인을 대상으로 하는 교육과정을 생성. 이때, "구체타입" 지정
		 Course<Worker> workerCourse = new Course<>("직장인과정",5); //타입추론
		 
		 //직장인 대상 교육과정에 학생을 추가
		 workerCourse.add(new Worker("직장인"));
		 // 배열의 타입이 Worker이므로 다른 타입이 들어올 수 없다.
		 // workerCourse.add(new Student("학생"));  
		 // workerCourse.add(new Person("일반인"));
		 
		 Course<? extends Person> course2 = personCourse;
		 Course<? extends Person> course3 = workerCourse;
		 
		 log.info("course: "+course2);
		 log.info("course: "+course3);
		 
		 
		 //3. 학생을 대상으로 하는 교육과정을 생성. 이때, "구체타입" 지정
		 Course<Student> studentCourse = new Course<>("학생과정",5); //타입추론
		 
		 studentCourse.add(new Student("학생"));
		 studentCourse.add(new Student("고등학생"));  //다형성
		 
		 
		 //4. 고등학생을 대상으로 하는 교육과정을 생성. 이때, "구체타입" 지정
		 Course<HighStudent> highStudentCourse = new Course<>("고등학생과정",5); //타입추론
		 
		 highStudentCourse.add(new HighStudent("고등학생"));
		 
		 
		 printCourse(personCourse);
		 printCourse(workerCourse);
		 printCourse(studentCourse);
		 printCourse(highStudentCourse);
		 
		 log.info("============================");
		 
//		 printCourseStudent(personCourse);
//		 printCourseStudent(workerCourse);
		 printCourseStudent(studentCourse);
		 printCourseStudent(highStudentCourse);
		 
		 log.info("============================");
		 
		 printCourseWorker(personCourse);
		 printCourseWorker(workerCourse);
//		 printCourseWorker(studentCourse);
//		 printCourseWorker(highStudentCourse);
		 
	

	} // main
	
} // end class
