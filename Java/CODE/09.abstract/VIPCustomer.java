package abstractex;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	
		this.agentID = agentID;

	}
	@Override
	public int calcPrice(int price) { // calcPrice 메서드 재정의
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}
	
	@Override
	public String showCustomerInfo() { // 고객 정보 출력 메서드 재정의
		return customerName + "님의 등급은 " + customerGrade + "이고, 보너스 포인트는 "+ bonusPoint +"점입니다. 담당 상담원 아이디는 " + agentID + "입니다";
	}

	public int getAgentID() {
		return agentID;
	}

}
