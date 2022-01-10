package oop_class_notes;

import java.util.List;

public class Application {
	
	static Logger Logger;

	public static void main(String[] args) {
		
		
		Logger logger = new FileLogger();
		
		logger.info("Hello");
		logger.warning("This is a warning");
		logger.error("Oops , this and error!");
		logger.fatal("Fatal error");
		
		logger.close();
		
		setLogger(new FileLogger());
		setLogger(new ConsoleLogger());

	}
	
	public static void setLogger(Logger l) {
		Logger = l;
	}

}
