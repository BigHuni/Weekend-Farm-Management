package knu.mypackage;

public class Delivery {
	String id;
	String expiration;
	String district;

	public String toString() {
		return "Delivery [id=" + id + ", expiration=" + expiration + ", district=" + district + "]";
	}

	public Delivery(String id, String expiration, String district) {
		super();
		this.id = id;
		this.expiration = expiration;
		this.district = district;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
