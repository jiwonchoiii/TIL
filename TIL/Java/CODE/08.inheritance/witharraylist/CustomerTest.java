package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customers = new ArrayList<Customer>();

		Customer customer1 = new Customer(20000, "amy");
		Customer customer2 = new Customer(20001, "jane");
		Customer customer3 = new GoldCustomer(20002, "james");
		Customer customer4 = new GoldCustomer(20003, "tomas");
		Customer customer5 = new VIPCustomer(20004, "edward", 4688);
	

		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);

		for (Customer customer : customers) {
			System.out.println(customer.showCustomerInfo());

		}
		int price = 10000;

		for (Customer customer : customers) {
			System.out.println(customer.getCustomerName() + "님이 지불한 값은 " + customer.calcPrice(price) + "이고, 보너스 포인트는 "
					+ customer.bonusPoint + "입니다.");
		}
		
	}
}
