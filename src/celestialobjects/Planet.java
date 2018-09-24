package celestialobjects;

import java.util.ArrayList;
import controllers.Question;

public class Planet extends CelestialBody {
	
	protected String aphelion;
	protected String perihelion;
	protected String orbitalPeriod;
	
	public Planet(String _name, String _shortDescription, String _extendedDescription,
					String _radius, String _onApproachText, String _surfaceArea, 
					String _volume, String _mass, String _temperature, int _cost,
					ArrayList<Question> _questions, String _aphelion, String _perihelion,
					String _orbitalPeriod) {
		
		super(_name, _shortDescription, _extendedDescription, _onApproachText, _radius,
				_surfaceArea, _volume, _mass, _temperature, _cost, _questions);
		
		aphelion = _aphelion;
		perihelion = _perihelion;
		orbitalPeriod = _orbitalPeriod;
		
	}
	
	public String getAphelion() {
		
		return aphelion;
		
	}
	
	public String getPerihelion() {
		
		return perihelion;
		
	}
	
	public String getOrbitalPeriod() {
		
		return orbitalPeriod;
		
	}
	
	@Override
	public void displayInformation() {
		
		super.displayInformation();
		System.out.println("Aphelion: " + aphelion);
		System.out.println("Perihelion: " + perihelion);
		System.out.println("Orbital period: " + orbitalPeriod);
		
	}	

}
