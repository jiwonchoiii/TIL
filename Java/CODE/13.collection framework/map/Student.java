package map;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@AllArgsConstructor
public class Student {

	public int sno;
	public String name;

//	@Override
//	public int hashCode() {
//		return sno + name.hashCode();
//	}; // hashCode
//
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Student) {
//			Student student = (Student) obj;
//			return (sno == student.sno) && (name.equals(student.name));
//		} else {
//			return false;
//		} // if-else
//	} // equals

} // end class
