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
			throw new PasswordException("비밀번호는 null일 수 없습니다");
		} else if (password.length() < 5) {
			throw new PasswordException("비밀번호는 5자 이상으로 쓰세요");
		} else if (password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 문자열로만 이루어질 수 없습니다");
		}
		this.password = password;
	}

	public static void main(String[] args) {
		PasswordFormat test = new PasswordFormat();

		String password = null;
		try {
			test.setPassword(password);
			System.out.println("오류 없음");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

		password = "1234";
		try {
			test.setPassword(password);
			System.out.println("오류 없음");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

		password = "abccc";
		try {
			test.setPassword(password);
			System.out.println("오류 없음");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}

		password = "abc1235";
		try {
			test.setPassword(password);
			System.out.println("오류 없음");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}

}
