package classpart;

public class ShoppingMallTest {

	public static void main(String[] args) {
		ShoppingMall order1 = new ShoppingMall();
		order1.setOrderNum("201803120001");
		System.out.println("�ֹ� ��ȣ: "+ order1.getOrderNum());
		order1.setCustomerID("abc123");
		System.out.println("�ֹ��� ���̵�: "+ order1.getCustomerID());
		order1.setOrderDate("2018�� 3�� 12��");
		System.out.println("�ֹ� ��¥: "+order1.getOrderDate());
		order1.setCustomerName("ȫ���");
		System.out.println("�ֹ��� �̸�: "+order1.getCustomerName());
		order1.setProductNum("PD0345-12");
		System.out.println("�ֹ� ��ǰ ��ȣ: "+order1.getProductNum());
		order1.setAddress("����� �������� ���ǵ��� 20����");
		System.out.println("�ֹ� �ּ�: "+order1.getAddress());
}
		

}
