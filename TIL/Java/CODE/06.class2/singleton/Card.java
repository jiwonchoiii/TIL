package singleton;

public class Card {
	public static int serialNum = 1000000;
	public static int cardNum;
	public String customerName;
	
	public Card() {
		serialNum++;
		cardNum = serialNum;
	}

	public static int getCardNum() {
		return cardNum;
	}

	public static void setCardNum(int cardNum) {
		Card.cardNum = cardNum;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
}
