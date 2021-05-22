package customer;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	double bonusRatio;
	int bonusPoint;
	

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
	}
	
	public int calcPrice(int price) {
			return price;
	}

	public String showCustomerInfo() {
		return customerName +"님의 아이디는 "+ customerID + "입니다." ;
	}
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
