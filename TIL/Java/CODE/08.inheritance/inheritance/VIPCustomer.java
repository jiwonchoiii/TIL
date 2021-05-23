package inheritance;

public class VIPCustomer extends Customer {

	private int agentID;
	double saleRatio;

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);		// ���� Ŭ���� ������ ȣ��
		customerGrade = "VIP"; // ���� Ŭ�������� private�� �����̹Ƿ� ���� -> protected�� �����ϸ� �ذ�.
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
//		System.out.println("VIPCustomer(int, String, int) ������ ȣ��");
	}

	public int calcPrice(int price) {		// �������̵�
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}

	public int getAgentID() {
		return agentID;
	}

	public String showVIPInfo() {			
		return super.showCustomerInfo() + " ��� ���� ���̵�� " +agentID+"�Դϴ�";
	}

}