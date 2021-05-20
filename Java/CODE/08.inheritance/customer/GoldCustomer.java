package customer;

public class GoldCustomer extends Customer {
	
	double saleRatio;
	

	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "GOLD";
		saleRatio = 0.1;
		bonusRatio = 0.02;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price = price - (int) (price * saleRatio);
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 등급은 " + customerGrade + "이고, 보너스 포인트는 "+ bonusPoint + "점입니다";

	}
}
