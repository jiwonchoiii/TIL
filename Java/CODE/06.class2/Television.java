package static_block;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@ToString
@NoArgsConstructor
@Log4j
public class Television {
	
//	static String company = "Samsung"; //�ʵ忡�� ���� �־ static initializer�� ���� �ʱ�ȭ
//	static String model = "LCD";
	static String company;
	static String model;
	static String info;
	
	// static initializer�� Class loader�� ���ؼ�, �� Television.class ������ ã�Ƽ� �о�ٰ�
	// ����Ʈ�ڵ带 �о�ٰ�, ClassŸ���� ��ü(Clazz)�� ����� �޼ҵ� ������ ���� �ֱ� ����, 
	// ������ �� �ѹ� ȣ��ȴ�.
	
	// ������ --> ��ü ������, �ν��Ͻ� �ʵ��� �ʱ�ȭ ������ ����
	// static initializer --> Ŭ������ ����� static field�� �ʱ�ȭ ���� ����
	static {
		log.info(">>>static initializer invoked.");
		
		company = "Samsung";
		model = "LCD";
		
		info = company + "-" + model;
	} // static initializer
 
} // end class
 