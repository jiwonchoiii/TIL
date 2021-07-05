package multitype_parameter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
@Setter
public class Product<T, M> {

	private T kind; // 선언
	private M model; // 선언 

} // end class

