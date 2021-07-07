package predicate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student {
	private String name;
	
	@Getter private String sex;
	@Getter private int score;

} // end class
