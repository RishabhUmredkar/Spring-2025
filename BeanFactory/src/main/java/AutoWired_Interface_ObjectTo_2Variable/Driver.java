package AutoWired_Interface_ObjectTo_2Variable;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Person p = ac.getBean("person", Person.class);
		Vehicle vh = p.getVehicle();
		vh.type();
	}

}
