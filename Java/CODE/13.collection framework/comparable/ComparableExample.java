package comparable;

import java.util.TreeSet;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ComparableExample {
	
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("neo", 45));
		treeSet.add(new Person("trinity", 25));
		treeSet.add(new Person("john", 31));
		
		log.info(treeSet);
		
	}

}
