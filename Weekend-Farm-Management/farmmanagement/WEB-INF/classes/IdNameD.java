package knu.mypackage;
public class IdNameD {
	String id;
	String name;
	
	public IdNameD(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return "IdNameD [id=" + id + ", name=" + name + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
