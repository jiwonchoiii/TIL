package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
//		int n = 10;
//		double dnum = n;    // ũ�Ⱑ ���� �ڷ������� ū �ڷ������� �� ��ȯ�� �ڵ����� �̷������.
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
