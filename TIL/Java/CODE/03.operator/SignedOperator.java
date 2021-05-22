package operator;

public class SignedOperator {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(num);
		System.out.println(-num); // 변수에 새로운 값을 대입하지 않았기 때문에 값이 바뀌지 않는다.
		System.out.println(num);
		
		num = -num;     // 이렇게 하면 추가로 변수를 만들지 않아도 된다는 장점이 있다. 
		System.out.println(num);
	}

}
