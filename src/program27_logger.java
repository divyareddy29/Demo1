import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class program27_logger {
	static Logger log = Logger.getLogger(program27_logger.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.setLevel(Level.ALL);
		log.info("Test started.....");
		log.info("Test is under execution...");
		log.info("Test is over...");
		log.debug("Program is under execution");
		log.fatal("Error");
		log.error("There is an error in the program");

	}

}
