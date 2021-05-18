package singleton;

public class Company {
	
	private static Company instance = null;
	private Company() {}
	
	
	public static Company getInstance() {
		if(instance==null) {		// 생성된 객체가 없다면
			instance = new Company();	// 새로운 객체를 생성한다
	}
	return instance;				// 유일하게 생성된 인스턴스를 반환한다. 
}
}
