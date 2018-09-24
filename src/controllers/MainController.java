package controllers;

import java.util.Scanner;
import java.util.ArrayList;
import celestialobjects.CelestialBody;
import factories.CelestialBodyFactory;
import tools.SaveAndLoadManager; 

public class MainController {

	public static void main(String[] args) throws InterruptedException {
		
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
			
			Scanner inputReader = new Scanner(System.in);
			int userChoice = inputReader.nextInt();
			
			switch(userChoice) {
			
			case 1:
				startTravel(inputReader);
				break;
			case 2:
				continueTravel(inputReader);
				break;
			case 3:
				quit(inputReader);
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
			
			showGameMenu(reader, travelController);
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
				
	}

	
	static void continueTravel(Scanner reader) throws InterruptedException {
		
		ArrayList<String> loadedData = SaveAndLoadManager.loadData();

		if(!loadedData.isEmpty()) {
			
			int loadedCredits = Integer.parseInt(loadedData.get(0));
			CelestialBodyFactory factory = new CelestialBodyFactory(loadedData);
			ArrayList<CelestialBody> loadedObjects = factory.getCelestialBodiesArray();
			
			TravelController travelController = new TravelController(reader, loadedObjects,
																	loadedCredits);
			
			showGameMenu(reader, travelController);
		}
		
	}
	
	static void quit(Scanner reader) {
		
		reader.close();
		System.out.println("\n\nBye bye!");
		System.exit(0);
		
	}
	
	static void showGameMenu(Scanner reader, TravelController controller) throws InterruptedException {
		
		while(true) {
			
			System.out.println("\n");
			System.out.println("1. Select destination");
			System.out.println("2. Save game");
			System.out.println("3. Quit");
			
			int userChoice = reader.nextInt();
				
			switch(userChoice) {
			
			case 1:
				controller.selectDestination();
				break;
			case 2:
				SaveAndLoadManager.saveData(controller.getCredits(), controller.getUnvisitedObjects());
				break;	
			case 3:
				quit(reader);
				break;
			default:
				System.out.println("Wrong key!");
				break;
			}
		}
		
	}
	
}