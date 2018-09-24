package tools;

import java.util.ArrayList;
import java.io.*;
import celestialobjects.CelestialBody;


/* FileReader (for text files) should usually be wrapped in a BufferedFileReader.
 * This saves up data so you can deal with it a line at a time or whatever instead of 
 * character by character (which usually isn't much use). 
 */

public class SaveAndLoadManager {
	
	public static void saveData(int credits, ArrayList<CelestialBody> unvisitedObjects) {
		
		try {
			
			FileWriter file = new FileWriter("save.txt");
			BufferedWriter writer = new BufferedWriter(file);
			
			String creditsString = Integer.toString(credits) + "\n";
			String objectsString = "";
			
			for(int i = 0; i < unvisitedObjects.size(); i++) 
				objectsString += unvisitedObjects.get(i).getName() + "\n";	
			
			String savedData = creditsString + objectsString;
			
			writer.write(savedData);
			
			writer.close();
	
		}
		catch (IOException e) {
			 
			System.out.println("\nError when trying to save the game! :( Now you got to finish it!\n");	
			
		}
	}
	
	public static ArrayList<String> loadData() {
		
		ArrayList<String> loadedData = new ArrayList<String>();
		
		try {
			
			FileReader file = new FileReader("save.txt");
			BufferedReader reader = new BufferedReader(file);
			
			String line;
			
			while((line = reader.readLine()) != null)
				loadedData.add(line);
			
			reader.close();
		}
		catch (IOException e) {
			
			System.out.println("\nUnable to load game - file is corrupted or doesn't exist\n");
			
		}
		
		return loadedData;
	}

}
