package com.demoRepo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jConcept {

	public static void main(String[] args) {
		
		Logger log = Logger.getLogger(Log4jConcept.class);
		
		PropertyConfigurator.configure("C:\\Stuff\\Reetu\\WorkSpace\\DemoGitRepo\\log4j.properties");
		
		log.trace("This is TRACE message");
		log.debug("This is DEBUG message");
		log.info("This is INFO message");
		log.warn("This is WARN message");
		log.error("This is ERROR message");
		log.fatal("This is FATAL message");
		
	}

}
