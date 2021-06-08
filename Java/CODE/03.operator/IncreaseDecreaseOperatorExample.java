package myapp;

import lombok.extern.log4j.Log4j;

@Log4j
public class IncreaseDecreaseOperatorExample {

	// 전위, 후위 증감연산자(++,--)의 사용 예
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;

		log.info("-------------------");
		x++; // x = (x+1)----> x += 1
		++x; // x = (x+1)----> x += 1
		// 단독으로 사용할 때는 전위,후위의 의미가 없다.

		log.info("x: " + x);

		log.info("-------------------");
		y--;
		--y;
		log.info("y: " + y);

		log.info("-------------------");
		z = x++;  // 표현식(expression): 연산자가 2개 이상							
				  // z = x;
				  // x = x + 1;
		log.info("z: " + z);
		log.info("x: " + x);

		z = ++x; //	x = x + 1;
				 //	z = x;	
		log.info("z: " + z);
		log.info("x: " + x);
		
		log.info("-------------------");
		
		z = (++x) + (y++); // 복잡한 표현식을 만들 때에는, 이와 같이 소괄호()를 아끼지 말고 사용해서,
						   // 확실히 연산의 우선순위를 나타낸다. 
		log.info("z: " + z);
		log.info("x: " + x);
		log.info("y: " + y);
		
	} // main

}	// end of class
