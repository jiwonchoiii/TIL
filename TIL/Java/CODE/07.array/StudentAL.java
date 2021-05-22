package arraylist;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;							
	
	public Student(int studentID, String studentName) {			// student ������
		this.studentName = studentName;
		this.studentID = studentID;
		subjectList = new ArrayList<Subject>(); // student �����ڸ� ���鶧 subjectList �迭�� �ϳ� �����.
	}
	
	public void addSubject(String name, int score) {			// �л��� �����ϴ� ������ subjectList �迭�� �ϳ��� �߰��ϴ� �޼���
		Subject subject = new Subject();				// subject ����
		subject.setName(name);							// ���� �̸�
		subject.setScorePoint(score);					// ����
		subjectList.add(subject);						// �迭�� ����
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		
		for(Subject s : subjectList) {		
			total+= s.getScorePoint();
			System.out.println("�л� "+ studentName+ "��"+ s.getName()+"���� ������ "+s.getScorePoint()+"�� �Դϴ�.");
		}
		double avg = subjectList.size()!=0 ? total / subjectList.size() : 0;	// total�� ���� �Ŀ� �� �ڵ带 ������Ѵ�.
		
		System.out.println("�л� "+ studentName+ "�� ������ "+ total +"�̰� " +"����� "+avg +"�Դϴ�");
	}
}
