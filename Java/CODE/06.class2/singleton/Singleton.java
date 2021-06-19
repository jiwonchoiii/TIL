package singleton;

import lombok.extern.log4j.Log4j;

@Log4j
public class Singleton {
	// �� �ѹ� ������ �̱��� ��ü�� �ּҸ� ������ �ʵ带 ����--------------------- (2)
	private static Singleton singleton;

	// --------------------------------//
	// ��� ������, ��� ��ü���� ������ �����͸� ������ �ʵ带 ����
	// --------------------------------//
	
	private int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
	// static�� ������ ���� ����:
	// �̱��� ��ü�ȿ� �����ͷμ� �迭�� �ִ°��̴�. 
	// ��ü�� �ϳ��̹Ƿ� ���� static�� ������ �ʾƵ� �ȴ�.
	// �����Ͱ� �ٲ��� �ʰ� private���� ���� ����


	static { // JVM�� ���� �� �ѹ��� ȣ��ǵ��� �����ϴ� ���
		log.debug(">>>>>>>>>>>>>static initializer invoked.");
		
		Singleton singleton = new Singleton();
	}// static initializer

	
	//�ܺο��� ȣ��Ұ����ϰ� private ���������ڷ� ����ȭ(ĸ��ȭ)
	private Singleton() { // �ܺο��� new �����ڷ� ȣ����ϵ��� private�� ���� (1)
		log.debug("default constructor invoked.");
	} // default constructor

	// �ܺο��� ������ ȣ�Ⱑ���ϵ��� �Ϸ���, ��ä �������̵� ȣ���� �� �ֵ��� static �޼ҵ�� �����Ѵ�.

	// �̱��� ��ü�� �ּҸ� �����ϰ� �ִ� �ʵ��� ����, ������ �ʿ�� �ϴ� �ٸ� ��ü�� �� �� �ֵ���
	// ���� �޼ҵ带 ���� ----------------------------------------------(3)
	public static synchronized Singleton getInstance() {
		log.debug("getInstance() invoked.");

		return singleton;
	} // getInstance

} // end class
