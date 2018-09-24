#Solar Traveller Console Project

A small quiz game, made as a project for Object-Oriented Programming course.

$ echo "pozdro hateread"


#Structure

<ul>
	<li><strong>celestialobjects</strong></li>
		<ol>
			<li>CelestialBody</li>
				Abstract base class for Planet, Satellite and Star. Provides basic methods and 
				attributes, shared by 	those classes.
			<li>Planet</li>
				Subclass of CelestialBody. Overrides the method displayInformation(), adding to its
				content its own attributes.
			<li>Star</li>
				Subclass of CelestialBody. Overrides the method displayInformation(), adding to its
				content its own attributes.
			<li>Satellite</li>
				Subclass of Planet. Overrides the method displayInformation(), adding to its
				content its own attributes.
		</ol>
	<li><strong>controllers</strong></li>
		<ol>
			<li>MainController</li>
				An entry point for the application. Handles showing the menu and uses                	SaveAndLoadManager to save or load the data.
			<li>TravelController</li>
				Controls the gameplay.
			<li>Question</li>
				Provides basic attributes and methods to ask and takes user input to answer the question.
			<li>MultiQuestion</li>
				Inherits from Question, adds the function of showing 4 possible answers.
		</ol>
	<li><strong>factories</strong></li>
		<ol>
			<li>CelestialBodyFactory</li>
				Class used for creation of objects (CelestialBodies, Questions).
		</ol>
	<li><strong>tools</strong>
		<ol>
			<li>SaveAndLoadManager</li>
				Handles loading and saving the user data.
		</ol>
</ul>

#Tips for friend

<ul>
	<li>You can explain <strong>polymorphism</strong> basing on ArrayList<CelestialBody> and ArrayList<Question> (there are plenty of them throughout the program) </li>
	<li>Read something about <strong>throws</strong> statement (you can find it especially in controllers), also about try catch block (best example can be found in SaveAndLoadManager)</li>
	<li>A <strong>saved file</strong> is in format CREDITS (newline) OBJECT (newline) OBJECT (newline)... Run the app on your PC, save the game and check local directory to see what I mean</li>
	<li><strong>Before presenting</strong> make sure that the app works on the university computers. To run the app, you can use Eclipse (just select the directory with project as a workspace [should work, if not, try to do File->Import project or something like this]) or command line. Further instructions for running from command line: <br/><a>https://ymichael.com/2014/09/24/build-and-run-eclipse-java-projects-on-the-command-line.html</a>
	<li><strong>Ask me if you need something!</strong><li>
</ul>

#TWOI LUDZIE DZIĘCIOŁY. DZIEŃ DOBRY


