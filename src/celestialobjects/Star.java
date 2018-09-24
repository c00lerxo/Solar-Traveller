package celestialobjects;

public class Star extends CelestialBody {
	
	private String visualBrightness;
	private String photosphericComposition;
	private String stellarClassification;
	
	public Star(String _name, String _shortDescription, String _extendedDescription, String _radius,
			String _surfaceArea, String _volume, String _mass, String _temperature, int _cost,
			String _visualBrightness, String _photosphericComposition, String _stellarClassification) {
		
		super(_name, _shortDescription, _extendedDescription, _radius,
				_surfaceArea, _volume, _mass, _temperature, _cost);
		
		visualBrightness = _visualBrightness;
		photosphericComposition = _photosphericComposition;
		stellarClassification = _stellarClassification;
		
	}
	
	@Override
	public void displayInformation() {
		
		super.displayInformation();
		System.out.println("Visual brightness: " + visualBrightness);
		System.out.println("Photospheric composition: " + photosphericComposition);
		System.out.println("Stellar classification: " + stellarClassification);
		
	}

}
