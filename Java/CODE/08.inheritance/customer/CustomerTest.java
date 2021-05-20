package customer;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customers = new ArrayList<Customer>();

		Customer customer1 = new Customer(20000, "amy");
		Customer customer2 = new Customer(20001, "jane");
		Customer customer3 = new SilverCustomer(20005, "david");
		customer3.bonusPoint = 1500;
		Customer customer4 = new GoldCustomer(20002, "james");
		customer4.bonusPoint = 2000;
		Customer customer5 = new GoldCustomer(20003, "tomas");
		customer5.bonusPoint = 2000;
		Customer customer6 = new VIPCustomer(20004, "edward", 4688);
		customer6.bonusPoint = 5000;
		
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		customers.add(customer6);

		System.out.println("*�� ���� ���*");
		for (Customer customer : customers) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("*������ & ����Ʈ ���*");

		int price = 10000;
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerName() + "���� ������ ���� " + customer.calcPrice(price)
					+ "�̰�, ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�Դϴ�.");
		}

	}
}
