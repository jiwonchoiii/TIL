package abstractex;

public class SilverCustomer extends Customer {

	
	public SilverCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}			
	
	@Override
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	@Override
	public String showCustomerInfo() {
		return  customerName + "님의 등급은 " + customerGrade +"이고, 보너스 포인트는 "+ bonusPoint + "점입니다";

	}

	
}
