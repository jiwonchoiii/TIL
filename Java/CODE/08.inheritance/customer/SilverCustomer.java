package customer;

public class SilverCustomer extends Customer {

	
	public SilverCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}			
	
	public int calcPrice (int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	public String showCustomerInfo() {
		return  super.showCustomerInfo()  + " 등급은 " + customerGrade +"이고, 보너스 포인트는 "+ bonusPoint + "점입니다";

	}
}
