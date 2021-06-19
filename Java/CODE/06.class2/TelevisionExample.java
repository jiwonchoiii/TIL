package static_block;

import lombok.extern.log4j.Log4j;

@Log4j

public class TelevisionExample {

	public static void main(String[] args) {

		log.info("main(args) invoked.");

		log.info(Television.info);
		log.info(Television.info); 
		log.info(Television.info);
		log.info(Television.info);
		log.info(Television.info);
		log.info(Television.info);
		log.info(Television.info);
		

	} // main
} // end class
