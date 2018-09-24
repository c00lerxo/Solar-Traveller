package controllers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import celestialobjects.CelestialBody;

public class TravelController {
	
	private int credits;
	private ArrayList<CelestialBody> visitedObjects = new ArrayList();
	private ArrayList<CelestialBody> unvisitedObjects = new ArrayList();
	private Scanner reader;
	
	public TravelController(Scanner _reader, ArrayList<CelestialBody> createdObjects) {
		
		credits = 100;
		reader = _reader;
		unvisitedObjects = createdObjects;
		
	}
	
	public TravelController(Scanner _reader, ArrayList<CelestialBody> createdObjects, 
							int loadedCredits) {
		
		credits = loadedCredits;
		reader = _reader;
		
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
			
			for(int i = 0; i < unvisitedObjects.size(); i++) {
				
				CelestialBody destinationObject = unvisitedObjects.get(i);
				
				System.out.println("\n" + i + ". " + destinationObject.getName() +
							" - " + Integer.toString(destinationObject.getCost()));
				System.out.println("\n" + destinationObject.getShortDescription());
				
			}
			
			int selectedOption = reader.nextInt();
			CelestialBody destinationObject = unvisitedObjects.get(selectedOption);
			
			if(manageCredits(destinationObject.getCost()))
				travelToDestination(destinationObject);
			else
				System.out.println("Unsufficient credits!");
		}
	}
	
	private void travelToDestination(CelestialBody destinationObject) throws InterruptedException { //
		                                                                                         // thrown by
		                                                                                        // sleep
		System.out.println("\nYou and your space shuttle on your way to "
							+ destinationObject.getName());
		
		for(int i = 0; i < 5; i++) {
			
			TimeUnit.SECONDS.sleep(1);
			System.out.println(".");
		}
		
		System.out.println(destinationObject.getApproachText());
		destinationObject.displayInformation();
		System.out.println("\nTime for questions! \n");
		askQuestion(destinationObject.getQuestions());
		System.out.println("\n");
	}
	
	private boolean manageCredits(int travelCost) {
		
		if(credits >= travelCost) {
			
			credits =- travelCost;
			return true;
		
		}
		else
			return false;
				
	}
	
	private void askQuestion(ArrayList<Question> questions) {
		
		for(int i = 0; i < questions.size(); i++) {
			
			Question question = questions.get(i);
			
			System.out.println(question.getText());
			question.answerQuestion(reader, this);
		}
	}
}
