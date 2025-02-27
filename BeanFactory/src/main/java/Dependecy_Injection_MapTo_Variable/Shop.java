package Dependecy_Injection_MapTo_Variable;

import java.util.Map;

public class Shop {
	private String name;
	private Map<String, Double> itmes;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Double> getItmes() {
		return itmes;
	}
	public void setItmes(Map<String, Double> itmes) {
		this.itmes = itmes;
	}
	
	
}
