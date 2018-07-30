package com.collection.languageidentifier;

public class SpecialCharactersScoreCalculator {
	
	// Calculate special character score 
	public static int computeSpecialCharactersScore(String content, char[] languageTokens) {
		
		char[] cArray = content.toCharArray();
		int score = 0;
		
		for(char token: cArray) {
			for(char languageToken: languageTokens ) {
				if(token == languageToken) {
					score = score + 1;
				}
			}
		}
		return score;
	}
}