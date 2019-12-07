package log4j;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class Example {
	static Logger log=Logger.getLogger(Example.class.getName());
	public static void main(String[] args) {
		BasicConfigurator.configure();

		log.debug("Debug");
		log.info("Info");

	}

}
