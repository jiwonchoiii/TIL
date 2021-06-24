package interface_study;


//인터페이스는 객체를 생성할 수 없어서 lombok을 사용할 수 없다.
public interface RemoteControl {
	
	//인터페이스에 선언되는 필드는 public static final이 부분적으로든 전체로든 생략되면 
	//컴파일시에 자바컴파일러가 바이트코드에 대신 넣어준다.  - 생략하지 않는 것이 좋다. 
	//-->static이 붙지 않아도 인스턴스 필드가 아니다!
	// 1. 상수
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	
	//2. 추상 메소드 선언
	//이 추상메소드가 곧 규격이자, 자식타입에서 반드시 재정의 해야하는 강제성을 부여하는 수단이다.
	//인터페이스에 선언되는 추상 메소드는 public abstract가 부분적으로든 전체로든 생략되면 
	//컴파일시에 자바컴파일러가 바이트코드에 대신 넣어준다. - 생략하지 않는 것이 좋다. 
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	//여기까지가 자바7 버전의 인터페이스
	//자바8에서 디폴트 메소드가 추가되었다.
	
	//3. 디폴트 메소드 - 까다로워서 실무에서는 어쩔 수 없는 경우에만 넣는다
	//*note* 디폴트 메소드는 인스턴스 메소드인데, 인터페이스 소속이 될 수 없다.(객체 생성을 할 수 없기 때문)
	//인스턴스 메소드는 객체가 반드시 존재해야 하는데, 인터페이스를 구현한 자식 클래스(implementation class) 객체의 기본(default) 인스턴스 메소드가 된다.
	
	//기존의 인터페이스는 기능의 확장이 어렵다. - 인터페이스에 추상 메소드D를 추가한 경우 모든 구현 클래스들이 구현하지 않으면 실행 중에 오류 발생
	//기존 구현 클래스에 메소드D를 다 넣어주기엔 유지보수가 어렵다. 
	//-----> 디폴트 메소드, static 메소드를 통해 구현클래스를 수정하지 않고도 기능을 확장할 수 있다.
	//강제성을 부여하지 않고 기능을 확장할 것인가? : default method
	//정적 메소드(공유되는 메소드)를 통해 기능을 확장할 것인가?	: static method
	
	//public default - public은 생략가능하지만 default는 반드시 적어줘야 한다.
	
	public default void setMute(boolean mute) {
		System.out.println("setMute() invoked.");
		System.out.println("\t + this: " + this);
		System.out.println("\t + type: " + this.getClass().getName());
		
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		} // if-else
		
		System.out.println(this);
	} // setMute
	
	//4. static 메소드
	//모든 객체가 공유하는 메소드를 통해 기능을 확장
	static void changeBattery() {
		System.out.println("changeBattery() invoked.");
		
	} //changeBattery
	//static메소드라고 해서 하나의 객체에서 건전지를 교환했을 때 모든 객체의 건전지가 교환된 것이 아니다. 

	
} // end interface
