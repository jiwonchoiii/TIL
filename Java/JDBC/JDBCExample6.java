package org.bitcamp.jdbc2;

import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

public class JDBCExample6 {
	
	public static void main(String[] args) {
		
		Resource1 res1 = new Resource1();
		Resource2 res2 = new Resource2();
		Resource3 res3 = new Resource3();
		 
		try(res1; res2; res3;){ //소괄호의 오른쪽에서 왼쪽 방향 순으로 닫힌다.  res3- res2 - res1 순   
			;;
			
		} catch(Exception e) {
			e.printStackTrace();
		}// try-with-resources
		
		
		//autocloseable 인터페이스를 구현하면 try-with-resources 구문 안에서 자원 객체를 보장한다.
		//먼저 해제할 객체를 오른쪽에 적는다. 
		
	} // main

} // end class


@Log4j2
@NoArgsConstructor
class Resource1 implements AutoCloseable {

	@Override
	public void close() throws Exception {
		log.debug("close() invoked.");
		
	}
	
} // end class 

@Log4j2
@NoArgsConstructor
class Resource2 implements AutoCloseable {

	@Override
	public void close() throws Exception {
		log.debug("close() invoked.");
		
	}
	
} // end class 

@Log4j2
@NoArgsConstructor
class Resource3 implements AutoCloseable {

	@Override
	public void close() throws Exception {
		log.debug("close() invoked.");
		
	}
	
} // end class 

