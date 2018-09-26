package controllers;

import java.util.Scanner;
import java.util.ArrayList;
import celestialobjects.CelestialBody;
import factories.CelestialBodyFactory;
import tools.SaveAndLoadManager; 

public class MainController {
	
	/* Entry point for the application - shows main interface. The Scanner is passed to methods, because
	 * you can create only one instance of it per application - after closing it, you can't open it again, and
	 * creating a new one can cause bugs */

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
		
	/* New game */
	
	static void startTravel(Scanner reader) throws InterruptedException {
		
		CelestialBodyFactory factory = new CelestialBodyFactory(); // call default constructor (because new game)
		ArrayList<CelestialBody> createdObjects = factory.getCelestialBodiesArray(); // get array of objects to visit
		
		TravelController travelController = new TravelController(reader, createdObjects); // create new game
			
		showGameMenu(reader, travelController); // show in-game user interface
				
	}

	
	/* Load game */
	
	static void continueTravel(Scanner reader) throws InterruptedException {
		
		ArrayList<String> loadedData = SaveAndLoadManager.loadData();

		if(!loadedData.isEmpty()) {
			
			int loadedCredits = Integer.parseInt(loadedData.get(0)); // get credits from save
			CelestialBodyFactory factory = new CelestialBodyFactory(loadedData); // call constructor for loadedData
			ArrayList<CelestialBody> loadedObjects = factory.getCelestialBodiesArray(); // get loaded objects
			
			TravelController travelController = new TravelController(reader, loadedObjects,
																	loadedCredits); // create loaded game
			
			System.out.println("\n\nGame succesfully loaded!\n\n");
			
			showGameMenu(reader, travelController); // show in-game user interface
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