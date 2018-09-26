package controllers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import celestialobjects.CelestialBody;

public class TravelController {
	
	private int credits;
	private ArrayList<CelestialBody> unvisitedObjects = new ArrayList<CelestialBody>();
	private Scanner reader;
	
	/* Constructor for new game */
	
	public TravelController(Scanner _reader, ArrayList<CelestialBody> createdObjects) {
		
		credits = 100;
		reader = _reader;
		unvisitedObjects = createdObjects;
		
	}
	
	/* Constructor for loaded game */
	
	public TravelController(Scanner _reader, ArrayList<CelestialBody> loadedObjects, 
							int loadedCredits) {
		
		credits = loadedCredits;
		reader = _reader;
		unvisitedObjects = loadedObjects;
		
	}
	
	public int getCredits() {
		
		return credits;
		
	}
	
	public ArrayList<CelestialBody> getUnvisitedObjects() {
		
		return unvisitedObjects;
		
	}
	
	public void addCredits(int gainedCredits) {
		
		credits += gainedCredits;
		
	}
	
	public void subtractCredits(int lostCredits) {
		
		credits -= lostCredits;
		
	}
	
	public void selectDestination() throws InterruptedException { // TimeUnit sleep raises this ex
		
		while(true) {
			System.out.println("\n Select your destination: ");
			System.out.println("\nYour credits: \n" + credits);
			
			int j;
			
			for(j = 0; j < unvisitedObjects.size(); j++) {
				
				CelestialBody destinationObject = unvisitedObjects.get(j);
				
				System.out.println("\n" + (j+1) + ". " + destinationObject.getName() +
							" - " + Integer.toString(destinationObject.getCost()));
				System.out.println("\n" + destinationObject.getShortDescription());
				
			}

			System.out.println("\n" + (j+1) + ". " + "Go back");
			
			int selectedOption = reader.nextInt();
			
			if(selectedOption == j+1)
				break; // exit menu of selecting travel destination - go back option
			else {
				
				CelestialBody destinationObject = unvisitedObjects.get(selectedOption-1);
				
				if(manageCredits(destinationObject.getCost())) { // check if player has sufficient credits
					
					travelToDestination(destinationObject); // if yes, go ahead!!
					break;
					
				}
				else
					System.out.println("Unsufficient credits!");
			}
		}
	}
	
	private void travelToDestination(CelestialBody destinationObject) throws InterruptedException { //
		                                                                                         // thrown by
		                                                                                        // sleep
		System.out.println("\nYou and your space shuttle on your way to "
							+ destinationObject.getName());
		
		delay();
		
		System.out.println("\n" + destinationObject.getApproachText() + "\n");
		System.out.println("\nLOADING DATA...\n");
		
		delay();
		
		destinationObject.displayInformation();
		System.out.println("\nEnter any key to continue...");
		reader.next();

		System.out.println("\nTime for questions! \n");
		askQuestion(destinationObject.getQuestions());
		System.out.println("\n");
		
		// Remove celestial body after visiting it
		
		for(int i = 0; i < unvisitedObjects.size(); i++) {
			
			if(unvisitedObjects.get(i).equals(destinationObject)) {
				
				unvisitedObjects.remove(i);
				break;
			}
		}
	}
	
	/* Returns true if player has sufficient credits to travel and subtract the required amount */
	
	private boolean manageCredits(int travelCost) {
		
		if(credits >= travelCost) {
			
			credits -= travelCost;
			return true;
		
		}
		else
			return false;
				
	}
	
	/* Uses the Question interface to show the questions (and possible answers if MultiQuestion) */
	
	private void askQuestion(ArrayList<Question> questions) {
		
		for(int i = 0; i < questions.size(); i++) {
			
			Question question = questions.get(i);
			
			System.out.println(question.getText());
			question.answerQuestion(reader, this);
		}
	}
	
	/* Aesthetic method - used to create delay effect */
	
	private void delay() {
		
		for(int i = 0; i < 5; i++) {
			
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(".");
		}
		
	}
}
