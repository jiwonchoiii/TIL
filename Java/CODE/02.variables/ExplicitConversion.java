package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {

		int iNum=1000;
		byte bNum=(byte)iNum;
		System.out.println(iNum);
		System.out.println(bNum);
		
		System.out.println();
		
		double dNum=3.14;
		int iNum2=(int)dNum;
		System.out.println(dNum);
		System.out.println(iNum2);
	
		System.out.println();
		
		double dNum1=1.2;
		float fNum2=0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum2;
		int iNum4 = (int)(dNum1+fNum2);
		System.out.println(iNum3);
		System.out.println(iNum4);
		
		
	}

}
