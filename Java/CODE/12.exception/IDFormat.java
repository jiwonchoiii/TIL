package exception;

@SuppressWarnings("serial")
class IDFormatE extends Exception {
	public IDFormatE(String message) {
		super(message);
	}
}

public class IDFormat {
	private String userID;

	public String getUserID() {
		return userID;
	}

	// 두 경우 나눠서 해보기
	public void setUserID(String userID) throws IDFormatE {
		if(userID == null) {
			throw new IDFormatE("아이디는 null일 수 없습니다");
		}	
		else if(userID.length() <8 || userID.length() >20) {
			throw new IDFormatE("아이디는 8자 이상 20자 이하로 쓰세요");
		}
		this.userID = userID;
	}
	

	public static void main(String[] args) {
		IDFormat test = new IDFormat();
		
		String userID = null;
		try {
			test.setUserID(userID);
		}catch (IDFormatE e) {
			System.out.println(e.getMessage());
		}

		userID = "1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatE e) {
			System.out.println(e.getMessage());
		}
	}

}

