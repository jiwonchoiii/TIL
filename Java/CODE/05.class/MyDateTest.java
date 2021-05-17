package reference;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(31,2,2021);
     	date1.isValid();
	
		MyDate date2 = new MyDate(4,13,2006);
		date2.isValid();
		
		MyDate date3 = new MyDate(3,5,1998);
		date3.isValid();
	

	}

}
