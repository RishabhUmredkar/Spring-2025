package Depedency_Injection_ObjectUsing_Constructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Person p = ac.getBean("per", Person.class);
		Mobile m = p.getMobile();
		m.ring();
	}

}
