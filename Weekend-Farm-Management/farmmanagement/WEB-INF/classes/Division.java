package knu.mypackage;
public class Division {
	String id;
	String division;
	
	public Division(String id, String division) {
		super();
		this.id = id;
		this.division = division;
	}

	public String toString() {
		return "Division [id=" + id + ", division=" + division + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
	
}
