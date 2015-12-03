package jungle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5JungleMap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/fockers/springtest/beans/Beans.xml");
		
		JungleMap jungle = (JungleMap) context.getBean("jungleMap");
		
		System.out.println(jungle);
		
		((ClassPathXmlApplicationContext)context).close();
		
		
	}

}
