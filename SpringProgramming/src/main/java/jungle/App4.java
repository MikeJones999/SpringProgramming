package jungle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/fockers/springtest/beans/Beans.xml");
		
		Jungle jungle = (Jungle) context.getBean("jungle");
		
		System.out.println(jungle);
		
		((ClassPathXmlApplicationContext)context).close();
		
		
	}

}
