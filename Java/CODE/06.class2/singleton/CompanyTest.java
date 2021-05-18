package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company myCompany1= Company.getInstance();
		Company myCompany2= Company.getInstance();
		System.out.println(myCompany1==myCompany2);		// true : 하나의 인스턴스만 생성되었다는 의미
	}

}
