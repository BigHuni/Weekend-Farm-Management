package knu.mypackage;

public class Citizen {
	String id;
    String district;
	
    public Citizen() {
	}
    
	public Citizen(String id, String district) {
		this.id = id;
		this.district = district;
	}
	
	public String toString() {
		return "Citizen [id=" + id + ", district=" + district + "]";
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
