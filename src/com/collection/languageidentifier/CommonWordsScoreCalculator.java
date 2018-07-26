package com.collection.languageidentifier;

public class CommonWordsScoreCalculator {
	
	// Calculate common word score 
	public static int CommonWordsScore(String content, String[] languageTokens) {
		
		String[] contentTokens = content.split(" ");
		int score = 0;
		
		for(String token: contentTokens) {
			for(String languageToken: languageTokens ) {
				if(token.equals(languageToken)) {
					score = score + 1;
					//System.out.println(token);
				}
			}
		}
		return score;
	}
}