package com.smartiot.smart.aops;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("appLogger")
public class AppLogger {

	static private Logger logger = null;
	
    public AppLogger init(final Class<?> clazz) {
		logger = LogManager.getLogger(clazz);
		return this;
	}
	
	public void debug(String msg) {
		logger.debug(msg);
	}
	
	public void error(String msg) {
		logger.error(msg);
	}
	
}
