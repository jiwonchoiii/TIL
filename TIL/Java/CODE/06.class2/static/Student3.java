package staticex;

public class Student3 {
	public static int serialNum = 1000;
	public int studentID;
	public static int cardNum;
	public String studentName;

	public Student3() {
		serialNum++;		// 고유번호를 만드는 용도
		studentID = serialNum;
		cardNum = studentID + 100;

	}

	public static int getCardNum() {
		return cardNum;
	}

	public static void setCardNum(int cardNum) {
		Student3.cardNum = cardNum;
	}



}
