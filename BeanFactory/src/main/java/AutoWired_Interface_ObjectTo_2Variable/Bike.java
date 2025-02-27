package AutoWired_Interface_ObjectTo_2Variable;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Primary
@Component
public class Bike implements Vehicle{
	public void type()
	{
		System.out.println("Bike..........");
	}
}
