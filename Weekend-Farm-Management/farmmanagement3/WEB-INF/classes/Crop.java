package net.codejava.javaee.Crop;

/**
 * Citizen.java
 * This is a model class represents a cust entity
 * @author www.codejava.net
 *
 */
public class Crop {
	protected String name;
	protected String expiration;
	protected String division;

	public Crop() {
	}

	public Crop(String name, String expiration, String division) {
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
