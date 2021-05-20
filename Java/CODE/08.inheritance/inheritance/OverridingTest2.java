package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030,"나몰라",2000);
		vc.bonusPoint = 1000;
		
		
		System.out.println(vc.getCustomerName()+"님이 지불해야 하는 금액은 " +vc.calcPrice(10000)+"원 입니다."); // 오버라이딩 -  생성된 인스턴스의 메서드가 호출됨
		
		// 변수 agentID도 오버라이딩된 메서드에서 사용 가능하다.

	}

}
