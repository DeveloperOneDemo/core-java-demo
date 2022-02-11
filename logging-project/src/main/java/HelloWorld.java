import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {

	final double PI = 3.14;
	
	static final Logger LOG = LogManager.getLogger(HelloWorld.class);
	
	public static void main(String[] args) {
		
		System.out.println("Hello World!!");
		
		LOG.trace("trace logged");
		LOG.debug("debug logged");
		LOG.info("info logged"); // used while entering and exiting a method
		LOG.warn("warn logged");
		LOG.error("error logged"); // used in the catch block
		LOG.fatal("fatal logged");
		

	}

}
