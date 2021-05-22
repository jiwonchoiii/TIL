package chapter2;

public class TypeTest {

	public static void main(String[] args) {
		System.out.println(15/2);   //7
		System.out.println(15.0/2.0); // 7.5
		System.out.println(15.0/2); // 7.5
		System.out.println(15/2.0); // 7.5
		
		System.out.println((double)15/2); //7.5
		System.out.println(15/(double)2); // 7.5
		System.out.println((double)0); // 0.0
		System.out.println((double)3.14); // 3.14
		
		System.out.printf("%d\n", 12345); //12345
		System.out.printf("%3d\n", 12345);//12345
		System.out.printf("%7d\n", 12345);//  12345
		System.out.printf("%5d\n",12345); //12345
		
		
		System.out.printf("%8.1f\n", 5.4321); //     5.4
		System.out.printf("%8.2f\n", 5.4321); //    5.43
		System.out.printf("%8.3f\n", 5.4321); //   5.432
		System.out.printf("%8.4f\n", 5.4321); //  5.4321

		
	}

}
