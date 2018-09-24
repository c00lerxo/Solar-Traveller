package celestialobjects;

public class Planet extends CelestialBody {
	
	private String aphelion;
	private String perihelion;
	private String orbitalPeriod;
	
	public Planet(String _name, String _shortDescription, String _extendedDescription, String _radius,
					String _surfaceArea, String _volume, String _mass, String _temperature, int _cost,
					String _aphelion, String _perihelion, String _orbitalPeriod) {
		
		super(_name, _shortDescription, _extendedDescription, _radius,
				_surfaceArea, _volume, _mass, _temperature, _cost);
		
		aphelion = _aphelion;
		perihelion = _perihelion;
		orbitalPeriod = _orbitalPeriod;
		
	}

}
