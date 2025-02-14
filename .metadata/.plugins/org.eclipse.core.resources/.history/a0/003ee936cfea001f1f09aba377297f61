package ConfigAnnotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Bank bank = ac.getBean("myBank", Bank.class);
		bank.getloan();
	}
}
