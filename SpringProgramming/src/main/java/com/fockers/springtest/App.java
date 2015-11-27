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
		
		Person person1 = (Person)context.getBean("person");
		
		person1.speak();
//		Address address = (Address) context.getBean("address");
//		System.out.println(address);
		
		Person person2 = (Person) context.getBean("person");
		person1.setGamerId(666);
		person2.setGamerId(111);//bean set to singleton - only one bean type - therefore last variable changed will 
		//change all beans.
		person1.setAddress(new Address("19 yr aran", "sa2 7px"));
		
		System.out.println("****Closing ClassPathXmlApplicationContext*****");
		//used to close down the connection + stop resource leaks
		//((FileSystemXmlApplicationContext)context).close();
		((ClassPathXmlApplicationContext)context).close();
		
		System.out.println(person1);
		System.out.println(person2);
	}

}
