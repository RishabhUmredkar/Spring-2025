package AutoWired_ObjectUsing_Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private Mobile mobile;

	public Person(Mobile mobile) {
		super();
		this.mobile = mobile;
	}

	public Mobile getMobile() {
		return mobile;
	}
	@Autowired
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
	
}
