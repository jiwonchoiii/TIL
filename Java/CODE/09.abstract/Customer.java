package abstractex;

public abstract class Customer {
	
	public abstract int calcPrice(int price);
	public abstract String showCustomerInfo();

	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	double bonusRatio;
	int bonusPoint;

	

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
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
