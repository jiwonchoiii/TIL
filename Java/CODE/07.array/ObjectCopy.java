package array;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];					// 배열 생성
		Book[] bookArray2 = new Book[3];

		bookArray1[0] = new Book("태백산맥", "조정래");			// 객체 생성하고 배열의 인덱스 0에 해당 객체의 주소값을 넣음 
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

		System.arraycopy(bookArray1, 0, bookArray2, 0, bookArray1.length);

		
		
		for (int i = 0; i < bookArray2.length; i++) {
		bookArray2[i].showBookInfo();
		}
	}
}
