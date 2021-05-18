package singleton;

public class CardTest {

	public static void main(String[] args) {
		Card card1 = new Card();
		card1.setCustomerName("±è ¾¾");
		System.out.println(card1.customerName+"ÀÇ Ä«µå¹øÈ£: "+Card.getCardNum());
	
		Card card2 = new Card();
		card2.setCustomerName("ÀÌ ¾¾");
		System.out.println(card2.customerName+"ÀÇ Ä«µå¹øÈ£: "+Card.getCardNum());

	}

}