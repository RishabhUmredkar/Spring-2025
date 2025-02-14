package ConfigAnnotation_ValueBy_Setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "myBank")
public class Bank {
	private int id;
	private String name;

	
	public int getId() {
		return id;
	}
	@Value(value = "11")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value(value = "SBI")
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
