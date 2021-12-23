package knu.mypackage;

public class Crop {
	String name;
	String expiration;
	String division;
	
	public String toString() {
		return "Crop [name=" + name + ", expiration=" + expiration + ", division=" + division + "]";
	}

	public Crop(String name, String expiration, String division) {
		super();
		this.name = name;
		this.expiration = expiration;
		this.division = division;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}


	
}