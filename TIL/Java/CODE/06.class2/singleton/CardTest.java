package singleton;

public class CardTest {

	public static void main(String[] args) {
		Card card1 = new Card();
		card1.setCustomerName("�� ��");
		System.out.println(card1.customerName+"�� ī���ȣ: "+Card.getCardNum());
	
		Card card2 = new Card();
		card2.setCustomerName("�� ��");
		System.out.println(card2.customerName+"�� ī���ȣ: "+Card.getCardNum());

	}

}