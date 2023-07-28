// Class to create CheckMatch object.
// This will take 3 cards as parameters (arguments), and analyze them for each attribute.
// The 4 attributes have their own boolean. "matchCheck" is the final true / false variable.

package javaFiles;

import java.util.*;

import javaFiles.Card;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.io.*;

public class CheckMatch {
	
	boolean colorSame, numberSame, typeSame, fillSame;
	boolean colorDifferent, numberDifferent, typeDifferent, fillDifferent;
	boolean colorCheck, numberCheck, typeCheck, fillCheck, matchCheck;
	Card first, second, third;
	
	CheckMatch(Card uno, Card dos, Card tres) {
		
		first = uno; second = dos; third = tres;
		
		if (sameColor(first, second, third) == true || differentColor(first, second, third) == true) {
			colorCheck = true;
		} else {colorCheck = false;}
		
		if (sameNumber(first, second, third) == true || differentNumber(first, second, third) == true) {
			numberCheck = true;
		} else {numberCheck = false;}
		
		if (sameType(first, second, third) == true || differentType(first, second, third) == true) {
			typeCheck = true;
		} else {typeCheck = false;}
		
		if (sameFill(first, second, third) == true || differentFill(first, second, third) == true) {
			fillCheck = true;
		} else {fillCheck = false;}
		
		if ((colorCheck == true) && (numberCheck == true) && (typeCheck == true) && (fillCheck == true)) {
			matchCheck = true;
		} else {matchCheck = false;}			
	}

	public boolean sameColor(Card cardOne, Card cardTwo, Card cardThree) {
		
		if ((cardOne.color == cardTwo.color) && (cardThree.color == cardTwo.color) && (cardThree.color == cardOne.color)) {
			colorSame = true;
		} else {
			colorSame = false;
		}		
		return colorSame;		
	}
	
	public boolean sameNumber(Card cardOne, Card cardTwo, Card cardThree) {
		
		if ((cardOne.number == cardTwo.number) && (cardThree.number == cardTwo.number) && (cardThree.number == cardOne.number)) {
			numberSame = true;
		} else {
			numberSame = false;
		}		
		return numberSame;		
	}
	
	public boolean sameType(Card cardOne, Card cardTwo, Card cardThree) {
		
		if ((cardOne.shape == cardTwo.shape) && (cardThree.shape == cardTwo.shape) && (cardThree.shape == cardOne.shape)) {
			typeSame = true;
		} else {
			typeSame = false;
		}		
		return typeSame;		
	}
	
	public boolean sameFill(Card cardOne, Card cardTwo, Card cardThree) {
		
		if ((cardOne.fill == cardTwo.fill) && (cardThree.fill == cardTwo.fill) && (cardThree.fill == cardOne.fill)) {
			fillSame = true;
		} else {
			fillSame = false;
		}		
		return fillSame;		
	}
	
	public boolean differentColor(Card cardOne, Card cardTwo, Card cardThree) {
		
		if ((cardOne.color != cardTwo.color) && (cardThree.color != cardTwo.color) && (cardThree.color != cardOne.color)) {
			colorDifferent = true;
		} else {
			colorDifferent = false;
		}		
		return colorDifferent;		
	}
	
	public boolean differentNumber(Card cardOne, Card cardTwo, Card cardThree) {
		
		if ((cardOne.number != cardTwo.number) && (cardThree.number != cardTwo.number) && (cardThree.number != cardOne.number)) {
			numberDifferent = true;
		} else {
			numberDifferent = false;
		}		
		return numberDifferent;		
	}
	
	public boolean differentType(Card cardOne, Card cardTwo, Card cardThree) {
		
		if ((cardOne.shape != cardTwo.shape) && (cardThree.shape != cardTwo.shape) && (cardThree.shape != cardOne.shape)) {
			typeDifferent = true;
		} else {
			typeDifferent = false;
		}		
		return typeDifferent;		
	}
	
	public boolean differentFill(Card cardOne, Card cardTwo, Card cardThree) {
		
		if ((cardOne.fill != cardTwo.fill) && (cardThree.fill != cardTwo.fill) && (cardThree.fill != cardOne.fill)) {
			fillDifferent = true;
		} else {
			fillDifferent = false;
		}		
		return fillDifferent;		
	}
	
	public void result() {
		System.out.println("Are Cards a Match? " + matchCheck);
	}
	
	public void listCards() {
		first.info();
		second.info();
<<<<<<< HEAD
		third.info();		
	}
=======
		third.info();
		
	}
	
>>>>>>> main
}
