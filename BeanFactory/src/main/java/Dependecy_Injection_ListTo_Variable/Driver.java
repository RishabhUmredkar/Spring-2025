package Dependecy_Injection_ListTo_Variable;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Trainer tr = ac.getBean("trainer", Trainer.class);
		List<String> sub = tr.getSubject();
		System.out.println(sub);
	}
}
