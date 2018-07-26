package com.collection.languageidentifier;

import java.util.ArrayList;
import java.util.List;

public class LetterSequenceScoreCalculator {
	
	// Calculate suffix score
	public static int LetterSequenceScore(String content, String[] languageTokens)
	{
		int score = 0;
		List<String> alltokens = getAllLetterSequences(content);
		
		for (String token : alltokens) {
			for(String languageToken: languageTokens) {
				if(token.equals(languageToken)) {
					score = score + 1;
					//System.out.println(token);
				}
			}
		}
		
		return score;
	}
	
	// Find all digraphs and trigraphs 
	public static List<String> getAllLetterSequences(String content)
	{
		String[] contentTokens = content.split(" ");
		List<String> alltokens = new ArrayList<String>();
		
		for(String token: contentTokens) {
			for (int i = 0; i < token.length(); i++)
			{
				for(int j = 2; j <= 3 && (i+j) <= token.length(); j++)
				{
					alltokens.add(token.substring(i, i+j));
				}
			}
		}
		
		return alltokens;
	}
}