import java.util.Stack;

public class StackEx1 {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();

	public static void main(String[] args) {

	}
	public static void printStatus() {
		System.out.println("back: " + back);
		System.out.println("forward: " + forward);
		System.out.println("현재 화면은 '" + back.peek()+"' 입니다.");
		System.out.println();
	}

	public static void goURL(String url) {
		back.push(url);
		if (!forward.empty())
			forward.clear();
	}

	public static void goForward() {
		if (!forward.empty())
			back.push(forward.pop());
	}

	public static void goBack() {
		if (!back.empty())
			forward.push(back.pop());
	}
}
