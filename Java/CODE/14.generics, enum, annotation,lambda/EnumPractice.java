import lombok.extern.log4j.Log4j;


@Log4j
public class EnumPractice {
	
	
	public static void main(String[] args) {
		Week today = Week.SATURDAY;
		
		log.info(today);
		log.info(today.ordinal());
		
		log.info(today.getName());
		log.info(today.getAge());
	} // main 

} // end class

enum Week {
	
	//Ordinal number started with 1.
	MONDAY("NAME_1",10),
	TUESDAY("NAME_2",20),
	WEDNESDAY("NAME_3",30),
	THURSDAY("NAME_4",40),
	FRIDAY("NAME_5",50),
	SATURDAY("NAME_6",60),
	SUNDAY("NAME_7",70);  // 열거상수 이외의 멤버가 있을 때 세미콜론으로 마감
	
	//열거타입의 개수만큼 생성자 호출  --> 열거상수 하나하나가 객체이다.
	

	// Illegal modifier for the enum constructor;
	// only private is permitted.
	private Week(){
	 	System.out.println("default constructor invoked.");
	} //default constructor
 
 // week 타입의 필드 -> 열거 상수 객체의 필드
 private String name;
 private int age;



	// only private is permitted.
	private Week(String name, int age) {
		System.out.printf("constructor(%s, %d) invoked. \n", name, age);

		this.name = name;
		this.age = age;
	} // constructor
	
	 
	public String getName() {
		System.out.println("getName() invoked");
		System.out.println("\t+this: " + this);  //열거상수는 toString() 오버라이딩 되어있음
		System.out.println("\t+this: " + this.getClass().getName());
		
		return this.name;		
	} // getName

	public int getAge() {
		System.out.println("getAge() invoked");
		System.out.println("\t+this: " + this);
		System.out.println("\t+this: " + this.getClass().getName());

		return this.age;
	} // getValue

}// end enum
