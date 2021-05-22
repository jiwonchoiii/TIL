package arraylist;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;							
	
	public Student(int studentID, String studentName) {			// student 생성자
		this.studentName = studentName;
		this.studentID = studentID;
		subjectList = new ArrayList<Subject>(); // student 생성자를 만들때 subjectList 배열도 하나 만든다.
	}
	
	public void addSubject(String name, int score) {			// 학생이 수강하는 과목을 subjectList 배열에 하나씩 추가하는 메서드
		Subject subject = new Subject();				// subject 생성
		subject.setName(name);							// 과목 이름
		subject.setScorePoint(score);					// 점수
		subjectList.add(subject);						// 배열에 저장
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		
		for(Subject s : subjectList) {		
			total+= s.getScorePoint();
			System.out.println("학생 "+ studentName+ "의"+ s.getName()+"과목 성적은 "+s.getScorePoint()+"점 입니다.");
		}
		double avg = subjectList.size()!=0 ? total / subjectList.size() : 0;	// total이 계산된 후에 이 코드를 적어야한다.
		
		System.out.println("학생 "+ studentName+ "의 총점은 "+ total +"이고 " +"평균은 "+avg +"입니다");
	}
}
