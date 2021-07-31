package input_output;

import java.io.Serializable;

import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
public class ClassC 
	implements Serializable{ 
	
	
	private static final long serialVersionUID = 777L;

//  SerialVersionUID 필드가 없는경우
//  소스에 변화가 생겨서 재컴파일되면 SerialVersionUID 필드가 강제로 생기고, 컴파일할 때마다 바뀜
//  그래서  SerialVersionUID 필드값을 고정시켜야한다!
 // local class: 컴파일한 클래스

	int field1;
	
	int field2; // 객체의 직렬화 이후 생긴 새로운 필드 
	
		
		
} // end class
