package com.collection.languageidentifier;


public class IdentifierFunctions {
	
	// Array to save scores for all languages
	static Object[][] allLanguages = {{"English",0}, {"Italian",0}, {"French",0}, {"Spanish",0}, {"Dutch",0}, {"German",0}, {"Romanian",0}, {"Portuguese",0}, {"Walloon",0}, {"Swedish",0}, {"Norwegian",0}, {"Azeri",0}, {"Icelandic",0}, {"Polish",0}, {"Guaraní",0}};
	
	//Identify language with highest score 
	public static String identifyLanguage(String content) {
		
		// Add the scores of commonWords, Suffix and Special characters and save in respective indexes
		allLanguages[0][1] = CommonWordsScoreCalculator.computeCommonWordsScore(content,LanguageRules.englishCommonWords) + SuffixScoreCalculator.computeSuffixScore(content,LanguageRules.englishSuffixes) + SpecialCharactersScoreCalculator.computeSpecialCharactersScore(content,LanguageRules.englishSpecialCharacters);
		allLanguages[1][1] = CommonWordsScoreCalculator.computeCommonWordsScore(content,LanguageRules.italianCommonWords) + SuffixScoreCalculator.computeSuffixScore(content,LanguageRules.italianSuffixes) + SpecialCharactersScoreCalculator.computeSpecialCharactersScore(content,LanguageRules.italianSpecialCharacters);
		allLanguages[2][1] = CommonWordsScoreCalculator.computeCommonWordsScore(content,LanguageRules.frenchCommonWords) + SuffixScoreCalculator.computeSuffixScore(content,LanguageRules.frenchSuffixes) + SpecialCharactersScoreCalculator.computeSpecialCharactersScore(content,LanguageRules.frenchSpecialCharacters);
		allLanguages[3][1] = CommonWordsScoreCalculator.computeCommonWordsScore(content,LanguageRules.spanishCommonWords) + SuffixScoreCalculator.computeSuffixScore(content,LanguageRules.spanishSuffixes) + SpecialCharactersScoreCalculator.computeSpecialCharactersScore(content,LanguageRules.spanishSpecialCharacters);
		allLanguages[4][1] = CommonWordsScoreCalculator.computeCommonWordsScore(content,LanguageRules.dutchCommonWords) + SuffixScoreCalculator.computeSuffixScore(content,LanguageRules.dutchSuffixes) + SpecialCharactersScoreCalculator.computeSpecialCharactersScore(content,LanguageRules.dutchSpecialCharacters);
		allLanguages[5][1] = CommonWordsScoreCalculator.computeCommonWordsScore(content,LanguageRules.germanCommonWords) + SuffixScoreCalculator.computeSuffixScore(content,LanguageRules.germanSuffixes) + SpecialCharactersScoreCalculator.computeSpecialCharactersScore(content,LanguageRules.germanSpecialCharacters);
		allLanguages[6][1] = CommonWordsScoreCalculator.computeCommonWordsScore(content,LanguageRules.romanianCommonWords) + SuffixScoreCalculator.computeSuffixScore(content,LanguageRules.romanianSuffixes) + SpecialCharactersScoreCalculator.computeSpecialCharactersScore(content,LanguageRules.romanianSpecialCharacters);
		allLanguages[7][1] = CommonWordsScoreCalculator.computeCommonWordsScore(content,LanguageRules.portugueseCommonWords) + SuffixScoreCalculator.computeSuffixScore(content,LanguageRules.portugueseSuffixes) + SpecialCharactersScoreCalculator.computeSpecialCharactersScore(content,LanguageRules.portugueseSpecialCharacters);
		allLanguages[8][1] = CommonWordsScoreCalculator.computeCommonWordsScore(content,LanguageRules.walloonCommonWords) + SuffixScoreCalculator.computeSuffixScore(content,LanguageRules.walloonSuffixes) + SpecialCharactersScoreCalculator.computeSpecialCharactersScore(content,LanguageRules.walloonSpecialCharacters);
		allLanguages[9][1] = CommonWordsScoreCalculator.computeCommonWordsScore(content,LanguageRules.swedishCommonWords) + SuffixScoreCalculator.computeSuffixScore(content,LanguageRules.swedishSuffixes) + SpecialCharactersScoreCalculator.computeSpecialCharactersScore(content,LanguageRules.swedishSpecialCharacters);
		allLanguages[10][1] = CommonWordsScoreCalculator.computeCommonWordsScore(content,LanguageRules.norwegianCommonWords) + SuffixScoreCalculator.computeSuffixScore(content,LanguageRules.norwegianSuffixes) + SpecialCharactersScoreCalculator.computeSpecialCharactersScore(content,LanguageRules.norwegianSpecialCharacters);
		allLanguages[11][1] = CommonWordsScoreCalculator.computeCommonWordsScore(content,LanguageRules.azeriCommonWords) + SuffixScoreCalculator.computeSuffixScore(content,LanguageRules.azeriSuffixes) + SpecialCharactersScoreCalculator.computeSpecialCharactersScore(content,LanguageRules.azeriSpecialCharacters);
		allLanguages[12][1] = CommonWordsScoreCalculator.computeCommonWordsScore(content,LanguageRules.icelandicCommonWords) + SuffixScoreCalculator.computeSuffixScore(content,LanguageRules.icelandicSuffixes) + SpecialCharactersScoreCalculator.computeSpecialCharactersScore(content,LanguageRules.icelandicSpecialCharacters);
		allLanguages[13][1] = CommonWordsScoreCalculator.computeCommonWordsScore(content,LanguageRules.polishCommonWords) + SuffixScoreCalculator.computeSuffixScore(content,LanguageRules.polishSuffixes) + SpecialCharactersScoreCalculator.computeSpecialCharactersScore(content,LanguageRules.polishSpecialCharacters);
		
		/*Uncomment if you want to check individual scores for all languages for each file*/
		/*for(int i = 0; i < allLanguages.length; i++)
		{
		    for(int j = 0; j<2; j++)
		    {
		        System.out.print(allLanguages[i][j]);
		    }
		    System.out.println();
		}*/
		
		int lan = getIndexOfLargest();
		
		// All languages with same score (The largest one)
		String identifiedLanguages = "";
		for ( int i = 0; i < allLanguages.length; i++ )
		    if ( (Integer)allLanguages[i][1] == (Integer)allLanguages[lan][1] ) identifiedLanguages = identifiedLanguages + (allLanguages[i][0].toString() + " ");
		
		return identifiedLanguages;
	}
	
	// Get the index of the language with highest scores
	public static int getIndexOfLargest(){
		int largest = 0;
		
		for ( int i = 1; i < allLanguages.length; i++ )
	      if ( (Integer)allLanguages[i][1] > (Integer)allLanguages[largest][1] ) largest = i;
	  
		return largest; // position of the first largest found
	}
}