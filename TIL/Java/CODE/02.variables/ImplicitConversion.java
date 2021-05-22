package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
//		int n = 10;
//		double dnum = n;    // 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어진다.
//		System.out.println(dnum);
		
//		int iNum = 20;
//		float fNum = iNum;
//		double dNum;
//		dNum = fNum+iNum;
//		System.out.println(dNum);
		
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);

		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);
	}

}
