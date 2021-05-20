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
		return  super.showCustomerInfo()  + " ����� " + customerGrade +"�̰�, ���ʽ� ����Ʈ�� "+ bonusPoint + "���Դϴ�";

	}
}
