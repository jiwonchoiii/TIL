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
		return  customerName + "���� ����� " + customerGrade +"�̰�, ���ʽ� ����Ʈ�� "+ bonusPoint + "���Դϴ�";

	}

	
}
