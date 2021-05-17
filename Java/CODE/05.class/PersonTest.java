package classpart;

public class PersonTest {


		public static void main(String[] args) {
			Person person1 = new Person();
			person1.setAge(40);
			System.out.println("이 사람의 나이: "+person1.getAge());		
			person1.setName("James");
			System.out.println("이 사람의 이름: "+person1.getName());
			person1.isMarried = true;
			System.out.println("이 사람의 결혼 여부: "+person1.isMarried());
			person1.setKids(3);
			System.out.println("이 사람의 자녀 수: "+person1.getKids());
	
			
			System.out.println();
			
			Person person2 = new Person();
			person2.setAge(28);
			System.out.println("이 사람의 나이: "+person2.getAge());
			person2.setName("최지원");
			System.out.println("이 사람의 이름: "+person2.getName());
			person2.isMarried = false;
			System.out.println("이 사람의 결혼 여부: "+person2.isMarried());
			person2.setKids(0);
			System.out.println("이 사람의 자녀 수: "+person2.getKids());
		}



}
