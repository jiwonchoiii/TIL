package cooperation;

public class TakeCoffee {

	public static void main(String[] args) {
		Person personKim = new Person("�� ��", "�Ƹ޸�ī��",50000);
		Person personLee = new Person("�� ��", "��",30000);
		
		Starbucks starbucks = new Starbucks("�Ƹ޸�ī��");
		personKim.takeAmericano(starbucks);
		personKim.showRestMoney();
		starbucks.showInfo();

		
		Coffeebean coffeebean = new Coffeebean("��");
		personLee.takeLatte(coffeebean);
		personLee.showRestMoney();
		coffeebean.showInfo();
	

}
}