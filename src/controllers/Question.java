package controllers;

import java.util.Scanner;

public class Question {
	
	protected String text;
	protected int reward;
	protected int penalty;
	protected String correctAnswer;
	
	public Question(String _text, String _correctAnswer, int _reward, int _penalty) {
		
		text = _text;
		correctAnswer = _correctAnswer;
		reward = _reward;
		penalty = _penalty;
		
	}
	
	public String getText() {
		
		return text;
		
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
		
		if(userAnswer.toLowerCase().equals(correctAnswer.toLowerCase())) {
			
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