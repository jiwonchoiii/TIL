package array;

public class BookArray2 {

	public static void main(String[] args) {

		// 책이름,작가를 추가했을 때 배열이 가변적으로 늘어날 수 있게 작성해보기
		// 코드를 유연하게 작성해야한다.
		
		String[] bookName = { "태백산맥", "데미안", "어떻게 살 것인가", "토지", "어린왕자", "해리포터" };
		String[] author = { "조정래", "헤르만 헤세", "유시민", "박경리", "생택쥐페리", "조앤롤링"};

		Book[] library = new Book[bookName.length];
		for (int i = 0; i < library.length; i++) {
			library[i] = new Book(bookName[i], author[i]);
		}

		for (int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}

		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}

	}

}