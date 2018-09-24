package controllers;

import java.util.Scanner;
import java.util.ArrayList;
import celestialobjects.CelestialBody;
import factories.CelestialBodyFactory; 

public class MainController {

	public static void main(String[] args) {
		
		System.out.println("*************OOP PROJECT*************");
		System.out.println("  _________      .__                 ___________                         .__  .__                \n" + 
				" /   _____/ ____ |  | _____ _______  \\__    ___/___________ ___  __ ____ |  | |  |   ___________ \n" + 
				" \\_____  \\ /  _ \\|  | \\__  \\\\_  __ \\   |    |  \\_  __ \\__  \\\\  \\/ // __ \\|  | |  | _/ __ \\_  __ \\\n" + 
				" /        (  <_> )  |__/ __ \\|  | \\/   |    |   |  | \\// __ \\\\   /\\  ___/|  |_|  |_\\  ___/|  | \\/\n" + 
				"/_______  /\\____/|____(____  /__|      |____|   |__|  (____  /\\_/  \\___  >____/____/\\___  >__|   \n" + 
				"        \\/                 \\/                              \\/          \\/               \\/     ");
		
		while(true) {
			
			System.out.println("****MAIN MENU****");
			System.out.println("1. Start your travel");
			System.out.println("2. Continue your travel");
			System.out.println("3. Quit");
			
			Scanner input_reader = new Scanner(System.in);
			int user_choice = input_reader.nextInt();
			
			switch(user_choice) {
			
			case 1:
				startTravel(input_reader);
				break;
			case 2:
				continueTravel();
				break;
			case 3:
				input_reader.close();
				break;
			default:
				System.out.println("Please type in correct number!");
				break;
				
			}
		}
	}
		
	static void startTravel(Scanner reader) {
		
		CelestialBodyFactory factory = new CelestialBodyFactory();
		ArrayList<CelestialBody> createdObjects = factory.getCelestialBodiesArray();
		
		TravelController travelController = new TravelController(reader, createdObjects);
		try {
			
			travelController.selectDestination();
			
		} catch (InterruptedException e) {
	
			e.printStackTrace();
			
		}
		
	}
	
	static void continueTravel() {
		
		System.out.println("Cos sie dzieje...");
		//TravelController travelController = new TravelController();
		
	}
	
	static void quit() {
		
		System.out.println("cos sie dzieje...");
		
	}
	
}