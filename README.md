#Solar Traveller Console Project

A small quiz game, made as a project for Object-Oriented Programming course.

$ echo "pozdro hateread"


#Structure


+ *celestialobjects*
	1. CelestialBody
	Abstract base class for Planet, Satellite and Star. Provides basic methods and 
	attributes, shared by 	those classes.
	2. Planet
	Subclass of CelestialBody. Overrides the method displayInformation(), adding to its
	content its own attributes.
	3. Star
	Subclass of CelestialBody. Overrides the method displayInformation(), adding to its
	content its own attributes.
	4. Satellite
	Subclass of Planet. Overrides the method displayInformation(), adding to its
	content its own attributes.
	
+ *controllers*
	1. MainController
	An entry point for the application. Handles showing the menu and uses SaveAndLoadManager to save or load the data.
	2. TravelController
	Controls the gameplay.
	3. Question
	Provides basic attributes and methods to ask and takes user input to answer the question.
	4. MultiQuestion
	Inherits from Question, adds the function of showing 4 possible answers.

+ *factories*
	1. CelestialBodyFactory
		Class used for creation of objects (CelestialBodies, Questions).
+ *tools*
	1. SaveAndLoadManager
		Handles loading and saving the user data.


#Tips for friend


+ You can explain *polymorphism* basing on ArrayList<CelestialBody> and ArrayList<Question> (there are plenty of them throughout the program)
+ Read something about *throws* statement (you can find it especially in controllers), also about try catch block (best example can be found in SaveAndLoadManager)
+ A *saved file* is in format CREDITS (newline) OBJECT (newline) OBJECT (newline)... Run the app on your PC, save the game and check local directory to see what I mean
+ *Before presenting* make sure that the app works on the university computers. To run the app, you can use Eclipse (just select the directory with project as a workspace [should work, if not, try to do File->Import project or something like this]) or command line. [Further instructions for running from command line](https://ymichael.com/2014/09/24/build-and-run-eclipse-java-projects-on-the-command-line.html)
+ *Ask me if you need something!*

#TWOI LUDZIE DZIĘCIOŁY. DZIEŃ DOBRY


