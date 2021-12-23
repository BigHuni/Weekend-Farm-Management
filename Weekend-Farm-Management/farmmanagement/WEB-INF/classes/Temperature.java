package knu.mypackage;
public class Temperature {
	String name;

	public Temperature(String name) {
		super();
		this.name = name;
	}

	public String toString() {
		return "Temperature [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
