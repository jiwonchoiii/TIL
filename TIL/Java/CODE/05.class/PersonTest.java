package classpart;

public class PersonTest {


		public static void main(String[] args) {
			Person person1 = new Person();
			person1.setAge(40);
			System.out.println("�� ����� ����: "+person1.getAge());		
			person1.setName("James");
			System.out.println("�� ����� �̸�: "+person1.getName());
			person1.isMarried = true;
			System.out.println("�� ����� ��ȥ ����: "+person1.isMarried());
			person1.setKids(3);
			System.out.println("�� ����� �ڳ� ��: "+person1.getKids());
	
			
			System.out.println();
			
			Person person2 = new Person();
			person2.setAge(28);
			System.out.println("�� ����� ����: "+person2.getAge());
			person2.setName("������");
			System.out.println("�� ����� �̸�: "+person2.getName());
			person2.isMarried = false;
			System.out.println("�� ����� ��ȥ ����: "+person2.isMarried());
			person2.setKids(0);
			System.out.println("�� ����� �ڳ� ��: "+person2.getKids());
		}



}
