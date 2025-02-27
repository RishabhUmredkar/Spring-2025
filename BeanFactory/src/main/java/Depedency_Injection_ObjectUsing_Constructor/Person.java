package Depedency_Injection_ObjectUsing_Constructor;

public class Person {
	private Mobile mobile;

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
