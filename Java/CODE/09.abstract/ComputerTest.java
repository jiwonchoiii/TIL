package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
//		Computer c1 = new Computer();		// 추상 클래스는 인스턴스를 직접 만들 수 없다.
		Computer c2 = new Desktop();
//		Computer c3 = new NoteBook();		// 추상 클래스는 인스턴스를 직접 만들 수 없다.
		Computer c4 = new MyNoteBook();
		
	}

}
