package knu.mypackage;
public class Environment {
	String name;
	String temperature;
	String humidity;
	
	public String toString() {
		return "Environment [name=" + name + ", temperature=" + temperature + ", humidity=" + humidity + "]";
	}

	public Environment(String name, String temperature, String humidity) {
		super();
		this.name = name;
		this.temperature = temperature;
		this.humidity = humidity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	
	
}