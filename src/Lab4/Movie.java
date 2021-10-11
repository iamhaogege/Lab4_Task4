package Lab4;

public class Movie {
	private String name;
	private double adultPrice;
	private double childPrice;
	private int duration;
	
	public Movie(String name, int duration) {
		this.name = name;
		this.duration = duration;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String toString() {
		return name + "(" + duration + " minutes)";
	}
}
