package input_output;

import java.io.Serializable;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class ClassB 
	implements Serializable {

	// UUID: Universal Unique Identifier 전역적으로 유니크한 값을 가지는 식별자 
	private static final long serialVersionUID = -8486165791897571164L;
	
	int field1 = 400;

} // end class
