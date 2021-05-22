package cooperation;

public class TakeCoffee {

	public static void main(String[] args) {
		Person personKim = new Person("±è ¾¾", "¾Æ¸Þ¸®Ä«³ë",50000);
		Person personLee = new Person("ÀÌ ¾¾", "¶ó¶¼",30000);
		
		Starbucks starbucks = new Starbucks("¾Æ¸Þ¸®Ä«³ë");
		personKim.takeAmericano(starbucks);
		personKim.showRestMoney();
		starbucks.showInfo();

		
		Coffeebean coffeebean = new Coffeebean("¶ó¶¼");
		personLee.takeLatte(coffeebean);
		personLee.showRestMoney();
		coffeebean.showInfo();
	

}
}