package getter_setter;

public class Car {

	// 필드
	private int speed; //상태 필드
	private boolean stop; //상태 필드

	// 생성자

	// 메소드
	public int getSpeed() {
		return this.speed;
	} // getSpeed

	// Setter메소드의 역할: 외부에서 준 전달인자로 필드의 값을 변경하기 전에, 무결성을 체크한다. 
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		} // if-else
	} // setSpeed

	public boolean isStop() {
		return this.stop;
	} // isStop

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	} // setStop

} // end class
