package input_output;

import java.io.Serializable;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor

public class ClassA 
	implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	int 			field1 = 100;
	ClassB 			field2 = new ClassB(); //부품관계
	static int	 	field3 = 200; // static 필드는 객체의 직렬화 대상에서 제외(Clazz소속이라 값이 나올뿐)
	transient int 	field4 = 100; // transient 한정자가 붙은 필드는 객체의 직렬화 대상에서 제외
	
} // end class
