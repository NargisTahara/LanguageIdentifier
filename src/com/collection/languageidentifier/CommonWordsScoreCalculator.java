package com.collection.languageidentifier;

public class CommonWordsScoreCalculator {
	
	static int score = 0;
	
	// Calculate common word score for English language
	public static int englishCommonWordsScore(String content) {
		
		String[] contentTokens = content.split(" ");
		score = 0;
		
		for(String token: contentTokens) {
			for(String englishToken: LanguageRules.englishCommonWords ) {
				if(token.equals(englishToken))
					score = score + 1;
			}
		}
		return score;
	}
	
	// Calculate common word score for Italian language
	public static int italianCommonWordsScore(String content) {
			
		String[] contentTokens = content.split(" ");
		score = 0;
			
		for(String token: contentTokens) {
			for(String languageToken: LanguageRules.italianCommonWords ) {
				if(token.equals(languageToken))
					score = score + 1;
			}
		}
		return score;
	}
		
	// Calculate common word score for French language
	public static int frenchCommonWordsScore(String content) {
			
		String[] contentTokens = content.split(" ");
		score = 0;
			
		for(String token: contentTokens) {
			for(String languageToken: LanguageRules.frenchCommonWords ) {
				if(token.equals(languageToken))
					score = score + 1;
			}
		}
		return score;
	}
}