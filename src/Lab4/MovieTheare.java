package Lab4;

public class MovieTheare {
	private String location;
	private int openingHours;
	private int numberOfrooms;
	
	public MovieTheare(String location, int numberOfrooms) {
		this.location = location;
		this.numberOfrooms = numberOfrooms;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public int getOpeningHours() {
		return openingHours;
	}
	
	public void setOpeningHours(int openingHours) {
		this.openingHours = openingHours;
	}
	
	public String toString() {
		return location + "(" + numberOfrooms + ")";
	}
}
