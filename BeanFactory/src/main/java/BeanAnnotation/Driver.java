package BeanAnnotation;

import java.sql.Connection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Connection con = ac.getBean("getCon", Connection.class);
		System.out.println(con);
	}

}
