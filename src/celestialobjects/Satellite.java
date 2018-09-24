package celestialobjects;

import java.util.ArrayList;
import controllers.Question;

public class Satellite extends Planet {
	
	private String orbit;
	
	public Satellite(String _name, String _shortDescription, String _extendedDescription,
					String _radius, String _onApproachText, String _surfaceArea, 
					String _volume, String _mass, String _temperature, int _cost,
					ArrayList<Question> _questions, String _aphelion, String _perihelion,
					String _orbitalPeriod, String _orbit) {
		
		super(_name, _shortDescription, _extendedDescription, _radius, _onApproachText, _surfaceArea,
				_volume, _mass, _temperature, _cost, _questions, _aphelion, _perihelion, _orbitalPeriod);
		
		orbit = _orbit;
		
	}
	
	@Override
	public void displayInformation() {
		
		super.displayInformation();
		System.out.println(name + " is a satellite of " + orbit);
		
	}

}
