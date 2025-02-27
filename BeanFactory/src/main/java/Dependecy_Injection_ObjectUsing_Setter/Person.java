package Dependecy_Injection_ObjectUsing_Setter;

public class Person {
	private Mobile mobile;

	public void work()
	{
		System.out.println("Calling.........");
		mobile.ring();
	}
	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	
}
