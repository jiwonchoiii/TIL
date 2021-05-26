package exception;

public class PasswordFormat2 {
	private String password;

	public String getPassword() {
		return password;
	}

	public static boolean isValidPass(String password) {
		if (password == null || password.trim() == "") {
			System.out.println("비밀번호는 빈칸으로 둘 수 없습니다. 다른 비밀번호를 사용하세요");
			return false;
		} else if (password.trim().length() < 5) {
			System.out.println("비밀번호는 5자 이상으로 써야합니다. 다른 비밀번호를 사용하세요");
			return false;
		} else if (password.matches("[a-zA-Z]+")) {
			System.out.println("비밀번호는 문자열로만 이루어질 수 없습니다. 다른 비밀번호를 사용하세요");
			return false;
		} else
			System.out.println("사용 가능한 비밀번호입니다");

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
