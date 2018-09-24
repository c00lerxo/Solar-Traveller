package controllers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import celestialobjects.CelestialBody;

public class TravelController {
	
	private int credits;
	private ArrayList<CelestialBody> visitedObjects = new ArrayList();
	private ArrayList<CelestialBody> unvisitedObjects = new ArrayList();
	
	public TravelController() {
		
		credits = 0;
		
	}
	
	public TravelController(int loaded_credits) {
		
		credits = loaded_credits;
		
	}
	
	public void selectDestination(Scanner reader) throws InterruptedException { // TimeUnit sleep raises this ex
		
		System.out.println("\n Select your destination: ");
		
		for(int i = 0; i <= unvisitedObjects.size(); i++) {
			
			CelestialBody destinationObject = unvisitedObjects.get(i);
			
			System.out.println("\n" + i + ". " + destinationObject.getName() +
						" - " + Integer.toString(destinationObject.getCost()));
			System.out.println("\n" + destinationObject.getShortDescription());
			
		}
		
		int selectedOption = reader.nextInt();
		
		travelToDestination(unvisitedObjects.get(selectedOption));
	}
	
	private void travelToDestination(CelestialBody destinationObject) throws InterruptedException { //
		                                                                                         // thrown by
		                                                                                        // sleep
		System.out.println("You and your space shuttle on your way to "
							+ destinationObject.getName());
		
		for(int i = 0; i < 5; i++) {
			
			TimeUnit.SECONDS.sleep(1);
			System.out.println(".");
		}
		
		destinationObject.displayInformation();
		
	}
	
	private void askQuestion(CelestialBody destinationObject) {
		
		ArrayList<Question> questions = destinationObject.getQuestions();
		
		for(int i = 0; i < questions.size(); i++) {
			
			Question question = questions.get(i);
			ArrayList<String> answers = question.getAnswers();
			
			System.out.println(question.getText());
			
			/*for(int i = 0; i < answers.size(); i++) {
				
				Sy
			}*/
			
			
		}
			
		
		
	}
	
}
