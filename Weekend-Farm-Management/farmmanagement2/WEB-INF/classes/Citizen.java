package net.codejava.javaee.Citizen;

/**
 * Citizen.java
 * This is a model class represents a cust entity
 * @author www.codejava.net
 *
 */
public class Citizen {
	protected String id;
	protected String district;

	public Citizen() {
	}

	public Citizen(String id, String district) {
		this.id = id;
		this.district = district;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

}
