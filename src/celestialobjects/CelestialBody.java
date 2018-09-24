package celestialobjects;

import java.util.ArrayList;
import controllers.Question;

public abstract class CelestialBody {
	
	protected String name;
	protected String shortDescription;
	protected String extendedDescription;
	protected String onApproachText;
	protected String radius;
	protected String surfaceArea;
	protected String volume;
	protected String mass;
	protected String temperature;
	protected int cost;
	protected ArrayList<Question> questions = new ArrayList<Question>();
	
	public CelestialBody(String _name, String _shortDescription, String _extendedDescription,
						String _onApproachText, String _radius, String _surfaceArea,
						String _volume, String _mass, String _temperature,
						int _cost, ArrayList<Question> _questions) {
		
		name = _name;
		shortDescription = _shortDescription;
		extendedDescription = _extendedDescription;
		onApproachText = _onApproachText;
		radius = _radius;
		surfaceArea = _surfaceArea;
		volume = _volume;
		mass = _mass;
		temperature = _temperature;
		cost = _cost;
		questions = _questions;
		
	}
	
	public String getName() {
		
		return name;
		
	}
	
	public int getCost() {
		
		return cost;
		
	}
	
	
	public ArrayList<Question> getQuestions() {
		
		return questions;
				
	}
	
	public String getShortDescription() {
		
		return shortDescription;
		
	}
	
	public String getApproachText() {
		
		return onApproachText;
				
	}
	
	public void displayInformation() {
		
		System.out.println("Name: " + name);
		System.out.println("Description: " + extendedDescription);
		System.out.println("Radius: " + radius);
		System.out.println("Surface area: " + surfaceArea);
		System.out.println("Volume: " + volume);
		System.out.println("Mass: " + mass);
		System.out.println("Temperature: " + temperature);
		
	}
	
	
}
