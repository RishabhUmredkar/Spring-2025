package PropertiesFile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "PropertiesFile")
@PropertySource("classpath:student.properties")
public class MyConfig {
	
}
