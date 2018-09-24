package controllers;

import java.util.ArrayList;

public class Question { // zastanowic sie czy odpowiednia kolejnosc dziedziczenia (hard question przed czy po?)
	
	protected String text;
	protected int reward;
	protected int penalty;
	protected String correctAnswer;
	private ArrayList<String> answers;
	
	public Question(String _text, String _answerA, String _answerB, String _answerC, String _answerD,
			int _reward, int _penalty, ArrayList<String> _answers) {
		
		text = _text;
		answers = _answers;
		
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
	
	public boolean isAnswerCorrect(String _userAnswer) {
		
		return _userAnswer.toLowerCase() == correctAnswer.toLowerCase();
		
	}

}
