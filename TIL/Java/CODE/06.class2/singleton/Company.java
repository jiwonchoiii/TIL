package singleton;

public class Company {
	
	private static Company instance = null;
	private Company() {}
	
	
	public static Company getInstance() {
		if(instance==null) {		// ������ ��ü�� ���ٸ�
			instance = new Company();	// ���ο� ��ü�� �����Ѵ�
	}
	return instance;				// �����ϰ� ������ �ν��Ͻ��� ��ȯ�Ѵ�. 
}
}
