package abstractex;

public abstract class Car {
	
	public abstract void run();    // ��� �޴� Ŭ�������� �����Ǵ� ������ ���� �ٸ��� ������ ��� �޼���� ���´�.
	public abstract void refuel();
	
	public void stop() {
		System.out.println("���� ����ϴ�.");
		
	}
}
