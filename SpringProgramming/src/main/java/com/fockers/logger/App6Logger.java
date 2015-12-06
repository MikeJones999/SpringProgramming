package com.fockers.logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App6Logger {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/fockers/springtest/beans/Beans1.xml");
		
		Logger logger = (Logger) context.getBean("logger");
		
		logger.writeFiles("hello there");
		logger.writeConsole("hey");
		
		((ClassPathXmlApplicationContext)context).close();
}

}