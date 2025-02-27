package AutoWired_objectTo_Variable;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Person person = ac.getBean("person", Person.class);
		Mobile m = person.getMobile();
		m.ring();
	}

}
