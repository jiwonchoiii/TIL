package array;

public class ObjectCopy3 {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

//		bookArray2[0] = new Book(); // bookArray2 배열 객체 생성
//		bookArray2[1] = new Book();
//		bookArray2[2] = new Book();
		
		for (int i = 0; i < bookArray2.length; i++) {		// 위의 코드를 for문으로 짧게 쓴 것 
			bookArray2[i] = new Book();
		}
					
		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].showBookInfo();
		}
		System.out.println();

		bookArray2[0].setBookName("나목");
		bookArray2[0].setAuthor("박완서");

		for (int i = 0; i < bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}

		System.out.println();

		for (int i = 0; i < bookArray2.length; i++) {
			bookArray1[i].showBookInfo();
		}

	}
}