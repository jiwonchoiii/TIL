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

	// �� ��� ������ �غ���
	public void setUserID(String userID) throws IDFormatE {
		if(userID == null) {
			throw new IDFormatE("���̵�� null�� �� �����ϴ�");
		}	
		else if(userID.length() <8 || userID.length() >20) {
			throw new IDFormatE("���̵�� 8�� �̻� 20�� ���Ϸ� ������");
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

