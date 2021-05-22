package abstractex;

public abstract class Car {
	
	public abstract void run();    // 상속 받는 클래스에서 구현되는 내용이 각각 다르기 때문에 상속 메서드로 적는다.
	public abstract void refuel();
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
		
	}
}
