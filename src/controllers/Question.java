package controllers;

import java.util.ArrayList;
import java.util.Scanner;

public class Question { // zastanowic sie czy odpowiednia kolejnosc dziedziczenia (hard question przed czy po?)
	
	protected String text;
	protected int reward;
	protected int penalty;
	protected String correctAnswer;
	private ArrayList<String> answers;
	
	public Question(String _text, String _correctAnswer, int _reward, int _penalty) {
		
		text = _text;
		correctAnswer = _correctAnswer;
		reward = _reward;
		penalty = _penalty;
		
	}
	
	public String getText() {
		
		return text;
		
	}
	
	public ArrayList<String> getAnswers() {
		
		return answers;
		
	}
	
	
	public int getReward() {
		
		return reward;
		
	}
	
	public int getPenalty() {
		
		return penalty;
		
	}
	
	public void answerQuestion(Scanner reader, TravelController controller) {
		
		reader.useDelimiter("\n");
		String userAnswer = reader.next();
		System.out.println(userAnswer);
		
		if(userAnswer.toLowerCase() == correctAnswer.toLowerCase()) {
			
			System.out.println("\nThe answer is correct! You receive " + reward + " credits.");
			controller.addCredits(reward);
			
		}
		
		else {
			
			if(penalty > 0)
				System.out.println("\nThe answer is incorrect! You lose " + penalty + " credits.");
			else
				System.out.println("\nThe answer is incorrect!");
		}
		
	}
	
	/*public boolean isAnswerCorrect(String _userAnswer) {
		
		return _userAnswer.toLowerCase() == correctAnswer.toLowerCase();
		
	}*/

}
