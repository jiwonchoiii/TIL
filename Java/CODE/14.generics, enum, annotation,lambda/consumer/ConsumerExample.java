package consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConsumerExample {
	
	//functional interface를 사용하면 비즈니스 로직이 견고해진다. 
	// java.util.function 패키지에 있는 functional interface를 사용하기로 했다면
	// 무조건 람다식으로 구현할 것을 생각한다. 
	public static void main(String[] args) {
		//  void accept(T t);
		Consumer<String> consumer = t -> log.info(t+"8");
		consumer.accept("java");
		
		// void accept(T t, U u);
		BiConsumer<String, String> bigConsumer = (t,u) -> log.info(t+u);
		bigConsumer.accept("java", "8");
		
		// void accept(double value);
		DoubleConsumer doubleConsumer = d -> log.info("java"+d);
		doubleConsumer.accept(8.0);
		
		//  void accept(T t, int value);
		ObjIntConsumer<String> objIntConsumer = (t, i) -> log.info(t+i);
		objIntConsumer.accept("java", 8);
		
	} //main

} // end class
