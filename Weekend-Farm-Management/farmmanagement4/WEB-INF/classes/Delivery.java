package net.codejava.javaee.Delivery;

/**
 * Citizen.java
 * This is a model class represents a cust entity
 * @author www.codejava.net
 *
 */
public class Delivery {
	protected String ID;
	protected String expiration;
	protected String district;


	public Delivery() {
	}

	public Delivery(String ID, String expiration, String district) {
		this.ID = ID;
		this.expiration = expiration;
		this.district = district;
	}
	

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}



	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

}
