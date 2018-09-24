package controllers;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiQuestion extends Question {

	private ArrayList<String> answers = new ArrayList<String>();
	
	public MultiQuestion(String _text, String _correctAnswer, int _reward, int _penalty,
							ArrayList<String> _answers) {
		
	
		super(_text, _correctAnswer, _reward, _penalty);
		answers = _answers;
		
		for(int i = 0; i < answers.size(); i++) {
			
			text += "\n" + (i+1) + ". " + answers.get(i) + "\n";
		}

	}
	

	@Override
	public void answerQuestion(Scanner reader, TravelController controller) {
		
		int userAnswer = reader.nextInt();
		
		if(userAnswer == Integer.parseInt(correctAnswer)) {
			
			System.out.println("\nThe answer is correct! You receive " + reward + " credits.\n");
			controller.addCredits(reward);
			
		}
		
		else {
			
			if(penalty > 0)
				System.out.println("\nThe answer is incorrect! You lose " + penalty + " credits.\n");
			else
				System.out.println("\nThe answer is incorrect!\n");
		}
		
	}
}
