package controllers;

import java.util.ArrayList;
import java.util.Scanner;
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
	
	public void userInterface(Scanner reader) {
		
		System.out.println("Select your destination: ");
		
		for(int i = 0; i <= unvisitedObjects.size(); i++) {
			
			System.out.println(i + ". " + unvisitedObjects.get(i).getName() +
						" - " + Integer.toString(unvisitedObjects.get(i).getCost()));
		}
		
		int selectedOption = reader.nextInt();
		
		
	}
	
}
