package abstractex;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customers = new ArrayList<Customer>();

	
		Customer customer1 = new SilverCustomer(20005, "david");
		customer1.bonusPoint = 1500;
		Customer customer2 = new GoldCustomer(20002, "james");
		customer2.bonusPoint = 2000;
		Customer customer3 = new GoldCustomer(20003, "tomas");
		customer3.bonusPoint = 2000;
		Customer customer4 = new VIPCustomer(20004, "edward", 4688);
		customer4.bonusPoint = 5000;
		
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
	

		System.out.println("*고객 정보 출력*");
		for (Customer customer : customers) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("*할인율 & 포인트 계산*");

		int price = 10000;
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerName() + "님이 지불한 값은 " + customer.calcPrice(price)
					+ "이고, 현재 보너스 포인트는 " + customer.bonusPoint + "입니다.");
		}

	}
}
