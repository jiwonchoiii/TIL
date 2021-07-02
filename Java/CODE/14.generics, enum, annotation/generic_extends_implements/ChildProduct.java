package generic_extends_implements;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter	
//부모타입이 제네릭타입이라면, 자식타입은 부모타입의 모든 타입파라미터를 가져야 하며,
//그 앞에 자식만의 타입파라미터 역시 가질 수 있다.
public class ChildProduct<T, M, C> extends Product<T, M> {

	private C company;

} // end class
