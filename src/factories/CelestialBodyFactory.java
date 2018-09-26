package factories;

import java.util.ArrayList;
import celestialobjects.*;
import controllers.MultiQuestion;
import controllers.Question;

/* This class is used only for creating game objects */

public class CelestialBodyFactory {
	
	private ArrayList<CelestialBody> celestialBodies = new ArrayList<CelestialBody>();
	
	
	/* Constructor for the new game */
	
	public CelestialBodyFactory() {
		
		createSun();
		createMercury();
		createVenus();
		createMoon();
		
	}
		

	/* Constructor for the loaded game */
	
	public CelestialBodyFactory(ArrayList<String> loadedData) {
		
		for(int i = 1; i < loadedData.size(); i++) {  // we are sure that unvisited objects start at index 1
		                                              // (index 0 is credits)
			switch(loadedData.get(i)) {
			
			case "Sun":
				createSun();
				break;
			
			case "Mercury":
				createMercury();
				break;
				
			case "Venus":
				createVenus();
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
		String moonExtendedDescription = "The Moon is an astronomical body that orbits planet Earth\n and is Earth's only permanent natural satellite.\n"
				+ " It is the fifth-largest natural satellite in the Solar System,"
				+ " and the largest among\n planetary satellites relative to the size of the planet that it"
				+ " orbits (its primary).\n"
				+ " The Moon is after Jupiter's satellite Io the second-densest satellite"
				+ " in the Solar System among those whose densities are known.\n";
		String moonOnApproachText = "We are approaching the Moon! Look at those craters! I wonder, what"
				+ " are we going to find there...";
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
		String moonAnswer3 = "3"; // when creating MultiQuestion, we have to give number of option as an answer
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
										moonOnApproachText, moonRadius, moonSurfaceArea, moonVolume,
										moonMass, moonTemperature, moonCost, moonQuestions, moonAphelion,
										moonPerihelion, moonOrbitalPeriod, moonOrbit);
		celestialBodies.add(moon);
		
	}
	
	private void createMercury() {
		
	// Mercury
		
		String name = "Mercury";
		String shortDescription = "Messenger of gods, wandering through the night sky in a flash";
		String extendedDescription = "Mercury is the smallest and innermost planet in the Solar System.\n"
				+ " Its orbital period around the Sun of 87.97 days is the shortest of all the planets"
				+ " in the Solar System.\n"
				+ " It is named after the Roman deity Mercury, the messenger of the gods.\n" + 
				"Like Venus, Mercury orbits the Sun within Earth's orbit as an inferior planet,\n and never exceeds 28°"
				+ " away from the Sun. When viewed from Earth, this proximity to the Sun\n"
				+ " means the planet can only be seen near the western or eastern horizon during the early evening\n"
				+ " or early morning.\n At this time it may appear as a bright star-like object,"
				+ " but is often far more difficult to observe than Venus. The planet telescopically displays\n"
				+ " the complete range of phases, similar to Venus and the Moon, as it moves in its inner\n "
				+ "orbit relative to Earth, which reoccurs over the so-called synodic period approximately"
				+ " every 116 days.\n";
		String onApproachText = "It's getting warmer and warmer! The Sun is closer and closer, and so is our destination -"
				+ "a tiny, rocky sphere...";
		String radius = "2,439.7 km";
		String surfaceArea = "7.48 * 10^7 km^2";
		String volume = "6.083 * 10^10 km^3";
		String mass = "3.3011 * 10^23 kg";
		String temperature = "100K - 700K";
		int cost = 300;
		String aphelion = "69,816,900 km";
		String perihelion = "46,001,200 km"; 
		String orbitalPeriod =  "87.969 d";
		
		
		// Mercury questions
		
		ArrayList<Question> questions = new ArrayList<Question>();
		
		String questionText1 = "How long is the solar day on Mercury (in full Earth days)?";
		String answer1 = "2";
		String option11 = "64";
		String option12 = "58";
		String option13 = "12";
		String option14 = "76";
		int reward1 = 300;
		int penalty1 = 50;
		String questionText2 = "Mercury has many craters on its surface. Which is the largest in diameter?";
		String answer2 = "Caloris Basin";
		int reward2 = 500;
		int penalty2 = 100;
		
		ArrayList<String> answers1 = new ArrayList<String>();
		
		answers1.add(option11);
		answers1.add(option12);
		answers1.add(option13);
		answers1.add(option14);
		
		Question question1 = new MultiQuestion(questionText1, answer1, reward1, penalty1,
									answers1);
	
		Question question2 = new Question(questionText2, answer2, reward2, penalty2);
		
		questions.add(question1);
		questions.add(question2);
	
		// Create Mercury object and add to created objects array
		
		CelestialBody mercury = new Planet(name, shortDescription, extendedDescription, onApproachText,
										radius, surfaceArea, volume, mass, temperature, cost, questions,
										aphelion, perihelion, orbitalPeriod);
		celestialBodies.add(mercury);
		
	}
	
	private void createVenus() {
		
	// Venus
		
		String name = "Venus";
		String shortDescription = "Named after the Roman goddess of love and beauty, the second-brightest natural object"
				+ " in the sky after the Moon";
		String extendedDescription = "Venus is a terrestrial planet and is sometimes called Earth's \"sister planet\"\n "
				+ "because of their similar size, mass, proximity to the Sun, and bulk composition.\n"
				+ " It is radically different from Earth in other respects. It has the densest atmosphere\n"
				+ " of the four terrestrial planets, consisting of more than 96% carbon dioxide.\n"
				+ " The atmospheric pressure at the planet's surface is 92 times that of Earth,"
				+ " or roughly the pressure found\n 900 m (3,000 ft) underwater on Earth. Venus "
				+ "is by far the hottest planet\n"
				+ " in the Solar System, with a mean surface temperature of 735 K (462 °C; 863 °F), even though Mercury"
				+ " is closer to the Sun.\n Venus is shrouded by an opaque layer of highly reflective "
				+ "clouds of sulfuric acid, preventing its surface from being seen from space\n "
				+ "in visible light. It may have had water oceans in the past,"
				+ " but these would have vaporized as the temperature rose due to a runaway greenhouse effect.\n"
				+ "The water has probably photodissociated, and the free hydrogen has been swept"
				+ " into interplanetary space by the solar wind \n because of the lack of a planetary magnetic field.\n"
				+ " Venus's surface is a dry desertscape interspersed with slab-like rocks and is periodically resurfaced"
				+ " by volcanism.\n";
		String onApproachText = "Wake up, we're approaching Venus! It's so bright,"
				+ " almost like it's creating its own light...";
		String radius = "6,051.8 km";
		String surfaceArea = "4.6023 * 10^8 km^2";
		String volume = "9.2843 * 10^11 km^3";
		String mass = "4.8675 * 10^24 kg";
		String temperature = "737 K";
		int cost = 500;
		String aphelion = "108,939,000 km";
		String perihelion = "107,477,000 km"; 
		String orbitalPeriod =  "224.701 d";
		
		
		// Venus questions
		
		ArrayList<Question> questions = new ArrayList<Question>();
		
		String questionText1 = "Venus is the Roman goddess of love."
				+ " Her Greek counterpart is Aphrodite, but what is the Babylonian counterpart?";
		String answer1 = "Ishtar";
		int reward1 = 700;
		int penalty1 = 200;
		String questionText2 = "Venus is the _______ planet.";
		String answer2 = "4";
		String option21 = "smallest";
		String option22 = "fastest";
		String option23 = "farthest";
		String option24 = "hottest";
		int reward2 = 800;
		int penalty2 = 600;
		
		ArrayList<String> answers2 = new ArrayList<String>();
		
		answers2.add(option21);
		answers2.add(option22);
		answers2.add(option23);
		answers2.add(option24);
		
		Question question1 = new Question(questionText1, answer1, reward1, penalty1);	
		Question question2 = new MultiQuestion(questionText2, answer2, reward2, penalty2, answers2);
		
		questions.add(question1);
		questions.add(question2);
	
		// Create Venus object and add to created objects array
		
		CelestialBody venus = new Planet(name, shortDescription, extendedDescription, onApproachText,
										radius, surfaceArea, volume, mass, temperature, cost, questions,
										aphelion, perihelion, orbitalPeriod);
		celestialBodies.add(venus);
		
	}

	
	
	private void createSun() {
		
		// Sun
		
				String sunName = "Sun";
				String sunShortDescription = "Our precious, shining diamond.";
				String sunExtendedDescription = "The Sun is the star at the center of the Solar System."
						+ " It is a nearly perfect sphere"
						+ " of hot plasma\n, with internal convective motion that generates a magnetic field via"
						+ " a dynamo process. It is by far the most important source of energy for life on Earth.\n"
						+ " Its diameter is about 1.39 million kilometers, i.e. 109 times that of Earth, and its mass"
						+ " is about 330,000 times that of Earth,\n"
						+ " accounting for about 99.86% of the total mass of the Solar System."
						+ " About three quarters of the Sun's mass consists of hydrogen (~73%);\n "
						+ "the rest is mostly helium (~25%), with much smaller quantities of heavier elements,"
						+ " including oxygen, carbon, neon, and iron.\n";
				String sunOnApproachText = "Time to wake up, no more time for a nap! We have to be really quick here,\n"
						+ " our shuttle shields have hard times while resisting the high temperatures\n"
						+ " and enormous portion of radiation. This is probably going to be our hardest mission!";
				String sunRadius = "695,700 km";
				String sunSurfaceArea = "6.09 * 10^12 km^2";
				String sunVolume = "1.41 * 10^18 km^3";
				String sunMass = "1.9885 * 10^30 kg";
				String sunTemperature = "1.57 * 10^7 K";
				int sunCost = 1800;
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
