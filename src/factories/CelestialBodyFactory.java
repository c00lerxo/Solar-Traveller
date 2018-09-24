package factories;

import java.util.ArrayList;
import celestialobjects.*;
import controllers.MultiQuestion;
import controllers.Question;

public class CelestialBodyFactory {
	
	private ArrayList<CelestialBody> celestialBodies = new ArrayList<CelestialBody>();
	
	
	public CelestialBodyFactory() {
		
		/* Creating Solar System */
		
		createMoon();
		createSun();
		
	}
		

	public CelestialBodyFactory(ArrayList<String> loadedData) {
		
		for(int i = 1; i < loadedData.size(); i++) {  // we are sure that unvisited objects start at index 1
		
			switch(loadedData.get(i)) {
			
			case "Sun":
				createSun();
				break;
			
			case "Moon":
				createMoon();
				break;
				
			}
			
		}
	}
	
	
	public ArrayList<CelestialBody> getCelestialBodiesArray() {
		
		return celestialBodies;
		
	}
	
	
	
	private void createMoon() {
		
		// Moon
		
		String moonName = "Moon";
		String moonShortDescription = "Silver shield. Luna. Night princess.";
		String moonExtendedDescription = "The Moon is an astronomical body that orbits planet Earth and is Earth's only permanent natural satellite."
				+ " It is the fifth-largest natural satellite in the Solar System,"
				+ " and the largest among planetary satellites relative to the size of the planet that it"
				+ " orbits (its primary)."
				+ " The Moon is after Jupiter's satellite Io the second-densest satellite"
				+ " in the Solar System among those whose densities are known.";
		String moonOnApproachText = "We are approaching the Moon! Look at those craters! I wonder, what"
				+ "are we going to find there...";
		String moonRadius = "1737.1 km";
		String moonSurfaceArea = "3.793 * 10^7 km^2";
		String moonVolume = "2.1958 * 10^10 km^3";
		String moonMass = "7.342 * 10^22 kg";
		String moonTemperature = "100K - 390K";
		int moonCost = 100;
		String moonAphelion = "405400 km";
		String moonPerihelion = "362600 km"; 
		String moonOrbitalPeriod =  "27.321661 d";
		String moonOrbit = "Earth";
		
		
		// Moon questions
		
		ArrayList<Question> moonQuestions = new ArrayList<Question>();
		
		String moonQuestionText1 = "Who was the first man on the Moon?";
		String moonAnswer1 = "Neil Armstrong";
		int moonReward1 = 200;
		int moonPenalty1 = 50;
		String moonQuestionText2 = "What was the name of the mission, on which the first"
				+ " man stood on the Moon? Type with space!";
		String moonAnswer2 = "Apollo 11";
		int moonReward2 = 300;
		int moonPenalty2 = 100;
		String moonQuestionText3 = "In which year first man stood on the Moon?";
		String moonAnswer3 = "3";
		int moonReward3 = 400;
		int moonPenalty3 = 0;
		String moonOption31 = "1972";
		String moonOption32 = "1989";
		String moonOption33 = "1969";
		String moonOption34 = "1954";
		ArrayList<String> moonAnswers3 = new ArrayList<String>();
		moonAnswers3.add(moonOption31);
		moonAnswers3.add(moonOption32);
		moonAnswers3.add(moonOption33);
		moonAnswers3.add(moonOption34);
		
		Question moonQuestion1 = new Question(moonQuestionText1, moonAnswer1, moonReward1, moonPenalty1);
		Question moonQuestion2 = new Question(moonQuestionText2, moonAnswer2, moonReward2, moonPenalty2);
		Question moonQuestion3 = new MultiQuestion(moonQuestionText3, moonAnswer3, moonReward3, moonPenalty3,
													moonAnswers3);
		moonQuestions.add(moonQuestion1);
		moonQuestions.add(moonQuestion2);
		moonQuestions.add(moonQuestion3);
		
	
		// Create Moon object and add to created objects array
		
		CelestialBody moon = new Satellite(moonName, moonShortDescription, moonExtendedDescription,
										moonRadius, moonOnApproachText, moonSurfaceArea, moonVolume,
										moonMass, moonTemperature, moonCost, moonQuestions, moonAphelion,
										moonPerihelion, moonOrbitalPeriod, moonOrbit);
		celestialBodies.add(moon);
		
		/* public Satellite(String _name, String _shortDescription, String _extendedDescription,
					String _radius, String _onApproachText, String _surfaceArea, 
					String _volume, String _mass, String _temperature, int _cost,
					ArrayList<Question> _questions, String _aphelion, String _perihelion,
					String _orbitalPeriod, String _orbit) {
		*/
		
		
		
		
	}

	
	private void createSun() {
		
		// Sun
		
				String sunName = "Sun";
				String sunShortDescription = "Our precious, shining diamond.";
				String sunExtendedDescription = "The Sun is the star at the center of the Solar System. It is a nearly perfect sphere"
						+ " of hot plasma, with internal convective motion that generates a magnetic field via"
						+ " a dynamo process. It is by far the most important source of energy for life on Earth."
						+ " Its diameter is about 1.39 million kilometers, i.e. 109 times that of Earth, and its mass"
						+ " is about 330,000 times that of Earth,"
						+ " accounting for about 99.86% of the total mass of the Solar System."
						+ " About three quarters of the Sun's mass consists of hydrogen (~73%); "
						+ "the rest is mostly helium (~25%), with much smaller quantities of heavier elements,"
						+ " including oxygen, carbon, neon, and iron.";
				String sunOnApproachText = "Time to wake up, no more time for a nap! We have to be really quick here,"
						+ "our shuttle shields have hard times while resisting the high temperatures"
						+ "and enormous portion of radiation. This is probably going to be our hardest mission!";
				String sunRadius = "695,700 km";
				String sunSurfaceArea = "6.09 * 10^12 km^2";
				String sunVolume = "1.41 * 10^18 km^3";
				String sunMass = "1.9885 * 10^30 kg";
				String sunTemperature = "1.57 * 10^7 K";
				int sunCost = 10000;
				String sunVisualBrightness = "−26.74";
				String sunPhotosphericComposition = "Hydrogen 73.46%\n" + 
						"Helium	24.85%\n" + 
						"Oxygen	0.77%\n" + 
						"Carbon	0.29%\n" + 
						"Iron	0.16%\n" + 
						"Neon	0.12%\n" + 
						"Nitrogen	0.09%\n" + 
						"Silicon	0.07%\n" + 
						"Magnesium	0.05%\n" + 
						"Sulfur	0.04%";
				String sunStellarClassification = "G2V";
				
				// Questions for Sun
				
				ArrayList<Question> sunQuestions = new ArrayList<Question>();
				String sunQuestionText1 = "What is the spectral classification of the Sun?";
				String sunAnswer1 = "G2V";
				int sunReward1 = 500;
				int sunPenalty1 = 500;
				
				Question sunQuestion1 = new Question(sunQuestionText1, sunAnswer1, sunReward1, sunPenalty1);
				
				sunQuestions.add(sunQuestion1);
				
				CelestialBody sun = new Star(sunName, sunShortDescription, sunExtendedDescription,
											sunOnApproachText, sunRadius, sunSurfaceArea, sunVolume,
											sunMass, sunTemperature, sunCost, sunQuestions, sunVisualBrightness,
											sunPhotosphericComposition, sunStellarClassification);
				
				celestialBodies.add(sun);
			}	
}
