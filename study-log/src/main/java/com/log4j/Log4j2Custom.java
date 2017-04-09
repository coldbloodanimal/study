package com.log4j;

import org.apache.logging.log4j.*;

public class Log4j2Custom {
	public static void main(String[] args) {  
		System.out.println(Log4j2Custom.class);
	    Logger logger = LogManager.getLogger(Log4j2Custom.class);  
	    logger.trace("trace level");  
	    logger.debug("debug level");  
	    logger.info("info level");  
	    logger.warn("warn level");  
	    logger.error("error level");  
	    logger.fatal("fatal level");  
	}  
}
