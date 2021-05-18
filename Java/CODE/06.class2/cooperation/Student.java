package cooperation;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	public double distance;

	
	
	public Student(String studentName, int money, double distance) {  //�л� �̸�, ���� ��, �Ÿ��� �Ű������� �޴� ������
		this.studentName = studentName;
		this.money = money;
		this.distance=distance;
		
	}
	
	public void takeBus(Bus bus) {     // �л��� ������ Ÿ�� 1000���� �����ϴ� ����� ������ �޼���
		bus.take(1000);
		this.money-= 1000;
		
	}
	
	public void takeBus(Bus bus, double distance) {     // �Ÿ��� �� ���� �� �޼��� ȣ��(�����ε�)
		bus.take(1000);
		this.money-= 1000;
		this.distance=distance;
	}
	
	
	public void takeSubway(Subway subway) {     // �л��� ����ö�� Ÿ�� 1500���� �����ϴ� ����� ������ �޼���
		subway.take(1500);
		this.money-= 1500;
	}
	
	public void takeBicycle(Bicycle bicycle) {
		bicycle.take(1000, distance);
		this.money-=1000;
		this.distance+=distance;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(money,distance);
		this.money-=taxi.money;
		this.distance+=distance;
	
		
	}
	
	public void showRestMoney() {
		System.out.println(studentName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}

		
	
}
