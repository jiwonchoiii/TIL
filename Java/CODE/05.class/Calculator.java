import lombok.NoArgsConstructor;import lombok.extern.log4j.Log4j;@Log4j@NoArgsConstructor(access=lombok.AccessLevel.PUBLIC)public class Calculator {		// 메소드	void powerOn() {		log.info("전원을 켭니다.");	} // powerOn	int plus(int x, int y) {		int result = x + y;		return result;	} // plus	double divide(int x, int y) {		double result = (double) x / (double) y;		return result;	} // divide	void powerOff() {		log.info("전원을 끕니다.");	} // powerOff} // end class