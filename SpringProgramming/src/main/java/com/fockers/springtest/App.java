package com.fockers.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;


public class App {

	public static void main(String[] args) {

	
		//class to instantiate bean objects
		ApplicationContext context;
		context = new ClassPathXmlApplicationContext("com/fockers/springtest/beans/Beans.xml");
		//no need to put path to bean.xml as it is in main project directory
//		context = new FileSystemXmlApplicationContext("src/main/java/com/fockers/springtest/beans/Beans.xml");
		
		Person personSpring = (Person)context.getBean("person");
		
		personSpring.speak();
		
		
		System.out.println("****Closing ClassPathXmlApplicationContext*****");
		//used to close down the connection + stop resource leaks
		//((FileSystemXmlApplicationContext)context).close();
		((ClassPathXmlApplicationContext)context).close();
		
		System.out.println(personSpring);
		
	}

}
