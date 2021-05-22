package cooperation;

public class TakeTrans {


	public static void main(String[] args) {
		Student studentJames = new Student("James" , 5000, 0.2);
		Student studentTomas = new Student("Tomas" , 10000, 0.1);
		Student studentEdward = new Student("Edward", 50000, 0.5);
		Student studentAmy = new Student("Amy", 30000, 2);
		
		Bus bus100 = new Bus(100);		// ��ȣ�� 100���� ���� ����
		studentJames.takeBus(bus100);	// james�� 100�� ������ Ž
		studentJames.showRestMoney();	// james�� ���� �� ���
		bus100.showInfo();				// 100�� ������ �°���, ���� ���
		
		Subway subwayGreen = new Subway("2ȣ��");	// 2ȣ���� ����ö ����
		studentTomas.takeSubway(subwayGreen);		// tomas�� 2ȣ�� ����ö�� Ž
		studentTomas.showRestMoney();				// tomas�� ���� �� ���
		subwayGreen.showInfo();						// 2ȣ���� �°� ��, ���� ���
		
		Bicycle bicycle7 = new Bicycle("7��");		// 7�� ������ ����
		studentEdward.takeBicycle(bicycle7);		// edward�� 7�� �����Ÿ� ���� 0.5km �̵���
		studentEdward.showRestMoney();				// edward�� ���� �� ���
		bicycle7.showInfo();						// ������(ȸ��)�� ����, �޸� �Ÿ� ���
		
		Taxi taxi123 = new Taxi(123);				// 123�� �ý� ���� 
		studentAmy.takeTaxi(taxi123);				// Amy�� 'taxi123'�� Ÿ�� 2km �̵���
		studentAmy.showRestMoney();
		taxi123.showInfo();
		
	}

}
