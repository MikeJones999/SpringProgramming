package fruitTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/fockers/springtest/beans/Beans.xml");
		
		FruitBasket fb = (FruitBasket) context.getBean("basket");
		
		System.out.println(fb);

		((ClassPathXmlApplicationContext)context).close();
		
	}

}

