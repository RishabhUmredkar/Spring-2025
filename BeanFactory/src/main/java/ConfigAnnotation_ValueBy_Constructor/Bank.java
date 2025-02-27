package ConfigAnnotation_ValueBy_Constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myBank")
public class Bank {
	private int id;
	private String name;

	
	public Bank(@Value(value = "101")int id, @Value(value = "SBI") String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
