package Dependecy_Injection_MapTo_Variable;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Shop sh = ac.getBean("shop" ,Shop.class);
		System.out.println(sh.getName());
		System.out.println(sh.getItmes());
	}

}
