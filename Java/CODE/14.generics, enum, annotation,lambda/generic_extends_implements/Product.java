package generic_extends_implements;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;


@Getter
@Setter
@NoArgsConstructor

//멀티타입 파라미터를 가지는 제네릭 클래스 선언
public class Product<T, M> {

	private T kind;
	private M model;

} // end class

class Tv {
	;;
} // end class
