package inheritance;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);		// 상위 클래스 생성자 호출
		customerGrade = "VIP"; // 상위 클래스에서 private인 변수이므로 에러 -> protected로 변경하면 해결.
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
//		System.out.println("VIPCustomer(int, String, int) 생성자 호출");
	}

	public int calcPrice(int price) {		// 오버라이딩
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}

	public int getAgentID() {
		return agentID;
	}

	public String showVIPInfo() {			
		return super.showCustomerInfo() + " 담당 상담원 아이디는 " +agentID+"입니다";
	}

}
