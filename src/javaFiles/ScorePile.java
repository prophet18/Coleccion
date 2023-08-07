package javaFiles;

import java.util.Stack;

public class ScorePile extends Stack<Card> {
	
	int numCard, numMatch;
	String numMatching;
	Card card;
	
	public ScorePile() {
		numCard = 0;
		numMatch = 0;
		card = null;
	}
	
	public int scoreTotal() {
		
		numCard = this.size();
		
		numMatch = (int) Math.floor(numCard/3);		
		
		return numMatch;		
	}
	
	public String scoreFinal() {
		
		numCard = this.size();
		
		numMatch = (int) Math.floor(numCard/3);
		
		numMatching =  Integer.toString(numMatch);
		
		return numMatching;		
	}
}
