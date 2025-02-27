package Dependecy_Injection_ObjectUsing_Setter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Person ps = ac.getBean("myPerson",Person.class);
		ps.work();
		
		
	}

}
