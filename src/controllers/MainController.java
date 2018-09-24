package controllers;

import java.util.Scanner; 

public class MainController {

	public static void main(String[] args) {
		
		System.out.println("*************KRYSTIAN GĄTAREK OOP PROJECT*************");
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
				startTravel();
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
		
	static void startTravel() {
		
		TravelController travelController = new TravelController();
	}
	
	static void continueTravel() {
		
		TravelController travelController = new TravelController();
	}
	
}