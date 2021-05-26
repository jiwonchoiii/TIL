package exception;

public class PasswordFormat2 {
	private String password;

	public String getPassword() {
		return password;
	}

	public static boolean isValidPass(String password) {
		if (password == null || password.trim() == "") {
			System.out.println("��й�ȣ�� ��ĭ���� �� �� �����ϴ�. �ٸ� ��й�ȣ�� ����ϼ���");
			return false;
		} else if (password.trim().length() < 5) {
			System.out.println("��й�ȣ�� 5�� �̻����� ����մϴ�. �ٸ� ��й�ȣ�� ����ϼ���");
			return false;
		} else if (password.matches("[a-zA-Z]+")) {
			System.out.println("��й�ȣ�� ���ڿ��θ� �̷���� �� �����ϴ�. �ٸ� ��й�ȣ�� ����ϼ���");
			return false;
		} else
			System.out.println("��� ������ ��й�ȣ�Դϴ�");

		return true;
	}

	public void setPassword(String password) {
		if (isValidPass(password))
			this.password = password;

	}

	public static void main(String[] args) {

		PasswordFormat2 test = new PasswordFormat2();
		String password = null;
		test.setPassword(password);

		password = "    ";
		test.setPassword(password);

		password = "dsdd";
		test.setPassword(password);

		password = "dfffsd1";
		test.setPassword(password);
	}

}
