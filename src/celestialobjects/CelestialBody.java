package celestialobjects;

public abstract class CelestialBody {
	
	protected String name;
	protected String description;
	protected String radius;
	protected String surface_area;
	protected String volume;
	protected String mass;
	protected String temperature;
	protected int cost;
	
	
	public String getName() {
		
		return name;
		
	}
	
	public int getCost() {
		
		return cost;
		
	}
	
	protected void displayInformation() {
		
		System.out.println("Name: " + name);
		System.out.println("Description: " + description);
		System.out.println("Radius: " + radius);
		System.out.println("Surface area: " + surface_area);
		System.out.println("Volume: " + volume);
		System.out.println("Mass: " + mass);
		System.out.println("Temperature: " + temperature);
		
	}
	
}
