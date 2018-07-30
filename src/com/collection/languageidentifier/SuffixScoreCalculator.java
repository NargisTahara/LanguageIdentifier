package com.collection.languageidentifier;

public class SuffixScoreCalculator {
	
	// Calculate suffix score
	public static int computeSuffixScore(String content, String[] languageTokens){
		String[] contentTokens = content.split(" ");
		int score = 0;
		
		for(String token: contentTokens) {
			for(String languageToken: languageTokens ) {
				// check suffix of length 1 
				if(token.substring(token.length()-1).equals(languageToken)) {
					score = score + 1;
				}
				
				// check suffixes of length 2 
				if(token.length() >= 2 && token.substring(token.length()-2).equals(languageToken)) {
					score = score + 1;
				}
				
				// check suffixes of length 3 
				if(token.length() >= 3 && token.substring(token.length()-3).equals(languageToken)) {
					score = score + 1;
				}
				
				// check suffixes of length 4 
				if(token.length() >= 4 && token.substring(token.length()-4).equals(languageToken)) {
					score = score + 1;
				}
			}
		}
		
		return score;
	}
}