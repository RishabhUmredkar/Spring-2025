package PropertiesFile;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Student st = ac.getBean("student", Student.class);
		System.out.println(st.getId());
		System.out.println(st.getName());
	}

}
