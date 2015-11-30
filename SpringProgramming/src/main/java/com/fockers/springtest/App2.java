package com.fockers.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) 
	{

		ApplicationContext context = new ClassPathXmlApplicationContext("com/fockers/springtest/beans/Beans.xml");
		
		//Person p1 = (Person) context.getBean("person");
		
		//p1.speak("Hello from App2");
	
		Person pFactory = (Person) context.getBean("person2");
		
		System.out.println(pFactory);
		
		Address address2 = (Address) context.getBean("address2");
		System.out.println(address2);
		
		
		((ClassPathXmlApplicationContext)context).close();
		

	}

}
