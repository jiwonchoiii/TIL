package exception;

@SuppressWarnings("serial")
class PasswordException extends Exception {
	public PasswordException(String message) {
		super(message);
	}
}

public class PasswordFormat {
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PasswordException {
		if (password == null) {
			throw new PasswordException("��й�ȣ�� null�� �� �����ϴ�");
		} else if (password.length() < 5) {
			throw new PasswordException("��й�ȣ�� 5�� �̻����� ������");
		} else if (password.matches("[a-zA-Z]+")) {
			throw new PasswordException("��й�ȣ�� ���ڿ��θ� �̷���� �� �����ϴ�");
		}
		this.password = password;
	}

	public static void main(String[] args) {
		PasswordFormat test = new PasswordFormat();

		String password = null;
		try {
			test.setPassword(password);
			System.out.println("���� ����");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

		password = "1234";
		try {
			test.setPassword(password);
			System.out.println("���� ����");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

		password = "abccc";
		try {
			test.setPassword(password);
			System.out.println("���� ����");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

		password = "abc1235";
		try {
			test.setPassword(password);
			System.out.println("���� ����");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}

}
