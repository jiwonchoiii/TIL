package multitype_parameter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Getter
@Setter
class Product1<T, M> {

	private T kind;
	private M model;

} // end class

public class CloneCoding {

	public static void main(String[] args) {

		Product1<Tv, String> product1 = new Product1<>();
		
		
		//Setter 메소드 호출 
		product1.setKind(new Tv());
		product1.setModel("스마트Tv");

	}

} // end class