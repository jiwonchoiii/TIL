package array;

public class ObjectCopy2 {
public static void main(String[] args) {
	
	// 얕은 복사(shallow copy) : 주소 값만 복사한다.
	
	Book[] bookArray1 = new Book[3];
	Book[] bookArray2 = new Book[3];
	
	bookArray1[0] = new Book("태백산맥", "조정래");
	bookArray1[1] = new Book("데미안", "헤르만 헤세");
	bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
	

	System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
	for(int i = 0 ; i < bookArray2.length; i++) {
		bookArray2[i].showBookInfo();
	}
	
	bookArray1[0].setBookName("나목");
	bookArray1[0].setAuthor("박완서");
	
	System.out.println();

	for(int i = 0 ; i < bookArray1.length ; i++) {
		bookArray1[i].showBookInfo();	
	}

	System.out.println();

	
	for(int i = 0 ; i < bookArray2.length ; i++) {	// 객체 배열의 요소에 저장된 값은 각 인스턴스가 아니라 주소값이기 때문에 
													// 결국 주소값을 복사한 것이고, 같은 인스턴스를 가리킨다.
		bookArray2[i].showBookInfo();
	}
}
}
