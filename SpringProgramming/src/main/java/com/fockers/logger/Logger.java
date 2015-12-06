package com.fockers.logger;


//dummy implementation of a logger class

public class Logger {

	private ConsoleWriter consoleWriter;
	private FileWriter fileWriter;

	public void setConsoleWriter(ConsoleWriter consoleWriter) {
		this.consoleWriter = consoleWriter;
	}

	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}
	
	public void writeFiles(String text)
	{
		fileWriter.write(text);
	}
	
	
	public void writeConsole(String text)
	{
		consoleWriter.write(text);
	}
	
	
}
