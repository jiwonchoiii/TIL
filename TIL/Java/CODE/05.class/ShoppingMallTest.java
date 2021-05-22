package classpart;

public class ShoppingMallTest {

	public static void main(String[] args) {
		ShoppingMall order1 = new ShoppingMall();
		order1.setOrderNum("201803120001");
		System.out.println("주문 번호: "+ order1.getOrderNum());
		order1.setCustomerID("abc123");
		System.out.println("주문자 아이디: "+ order1.getCustomerID());
		order1.setOrderDate("2018년 3월 12일");
		System.out.println("주문 날짜: "+order1.getOrderDate());
		order1.setCustomerName("홍길순");
		System.out.println("주문자 이름: "+order1.getCustomerName());
		order1.setProductNum("PD0345-12");
		System.out.println("주문 상품 번호: "+order1.getProductNum());
		order1.setAddress("서울시 영등포구 여의도동 20번지");
		System.out.println("주문 주소: "+order1.getAddress());
}
		

}
