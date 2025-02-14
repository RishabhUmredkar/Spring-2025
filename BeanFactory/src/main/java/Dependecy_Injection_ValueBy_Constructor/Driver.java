package Dependecy_Injection_ValueBy_Constructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Student st = ac.getBean("std", Student.class);
		System.out.println(st.getId());
		System.out.println(st.getName());
	}

}
