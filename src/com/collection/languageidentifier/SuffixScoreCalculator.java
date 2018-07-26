package com.collection.languageidentifier;

public class SuffixScoreCalculator {
	
	// Calculate suffix score
	public static int SuffixScore(String content, String[] languageTokens)
	{
		String[] contentTokens = content.split(" ");
		int score = 0;
		
		for(String token: contentTokens) {
			for(String languageToken: languageTokens ) {
				// check suffix of length 1 
				if(token.substring(token.length()-1).equals(languageToken)) {
					score = score + 1;
					//System.out.println(token);
				}
				
				// check suffix of length 2 
				if(token.length() >= 2 && token.substring(token.length()-2).equals(languageToken)) {
					score = score + 1;
					//System.out.println(token);
				}
				
				// check suffix of length 3 
				if(token.length() >= 3 && token.substring(token.length()-3).equals(languageToken)) {
					score = score + 1;
					//System.out.println(token);
				}
				
				// check suffix of length 4 
				if(token.length() >= 4 && token.substring(token.length()-4).equals(languageToken)) {
					score = score + 1;
					//System.out.println(token);
				}
			}
		}
		
		return score;
	}
}