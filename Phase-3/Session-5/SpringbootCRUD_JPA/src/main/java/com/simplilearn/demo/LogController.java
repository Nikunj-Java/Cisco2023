package com.simplilearn.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

	//create logger
	
	Logger logger=LoggerFactory.getLogger(LogController.class);
	
	@RequestMapping("/log")
	public String log() {
		logger.trace("Log Level: TRACE");
		logger.info("Log Level: INFO");
		logger.debug("Log Level: DEBUG");
		logger.error("Log Level: ERROR");
		logger.warn("Log Level: WARN");
		
		return "Hey ! Welcome to Springboot Logging";
	}
}
