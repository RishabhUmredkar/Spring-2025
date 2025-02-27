package AutoWired_ObjectUsing_Constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private Mobile mobile;

	@Autowired
	public Person(Mobile mobile) {
		super();
		this.mobile = mobile;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	
}
