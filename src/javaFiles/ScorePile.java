package javaFiles;

import java.util.Stack;

public class ScorePile extends Stack<Card> {
	
	int numCard, numMatch;
	
	public ScorePile() {
		numCard = 0;
		numMatch = 0;
	}
}
