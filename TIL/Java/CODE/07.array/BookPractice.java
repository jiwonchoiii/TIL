package array;

public class BookPractice {

	public static void main(String[] args) {
		Book[] books1 = new Book[3];
		Book[] books2 = new Book[3];
		
		books1[0] = new Book("a","b");
		books1[1] = new Book("c","d");
		books1[2] = new Book("e","f");
		
		System.arraycopy(books1, 0, books2, 0, 3);
		
		for(int i = 0 ; i<books2.length ; i++) {
			books2[i].showBookInfo();
		}
		System.out.println();
		
		books1[0] = new Book("°¡","³ª");
		
		for(int i = 0 ; i<books1.length ; i++) {
			books1[i].showBookInfo();
		}
		System.out.println();
		
		for(int i = 0 ; i<books2.length ; i++) {
			books2[i].showBookInfo();
		}
		System.out.println();
		
		
			
	}
	

}
