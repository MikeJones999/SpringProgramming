package com.fockers.logger;

public class ConsoleWriter implements LogWriter {

	public void write(String text) {
	
		System.out.println("Write to Console: " + text);
		
	}

	
	
	
}
