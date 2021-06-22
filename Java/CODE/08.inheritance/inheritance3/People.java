package inheritance2;


import lombok.extern.log4j.Log4j;


@Log4j
public class People {
	public String name;
	public String ssn;

	
//	public People() {
//		log.debug("People() constructor invoked.");
//	} // default constructor
	
	public People(String name, String ssn) {
		log.debug("People(name,ssn) constructor invoked");

		this.name = name;
		this.ssn = ssn;
	} // constructor

} // end class