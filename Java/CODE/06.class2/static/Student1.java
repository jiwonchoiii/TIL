package staticex;

public class Student1 {
	public static int serialNum = 1000;
	public String studentName;
	public int studentID;
	
	public Student1() {
		serialNum++;
		studentID = serialNum;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	


}
