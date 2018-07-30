package com.collection.languageidentifier;


public class IdentifierFunctions {
	
	// Array to save scores for all languages
	static Object[][] allLanguages = {{"English",0}, {"Italian",0}, {"French",0}, {"Spanish",0}, {"Dutch",0}, {"German",0}, {"Romanian",0}, {"Portuguese",0}, {"Walloon",0}, {"Swedish",0}, {"Norwegian",0}, {"Azeri",0}, {"Icelandic",0}, {"Polish",0}, {"Guaraní",0}};
	
	//Identify language with highest score 
	public static String languageIdentifier(String content) {
		
		// Add the scores of commonWords, Suffix and Special characters and save in respective index
		
		allLanguages[0][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.englishCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.englishSuffixes) + SpecialCharactersScoreCalculator.SpecialCharactersScore(content,LanguageRules.englishSpecialCharacters);
		allLanguages[1][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.italianCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.italianSuffixes) + SpecialCharactersScoreCalculator.SpecialCharactersScore(content,LanguageRules.italianSpecialCharacters);
		allLanguages[2][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.frenchCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.frenchSuffixes) + SpecialCharactersScoreCalculator.SpecialCharactersScore(content,LanguageRules.frenchSpecialCharacters);
		allLanguages[3][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.spanishCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.spanishSuffixes) + SpecialCharactersScoreCalculator.SpecialCharactersScore(content,LanguageRules.spanishSpecialCharacters);
		allLanguages[4][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.dutchCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.dutchSuffixes) + SpecialCharactersScoreCalculator.SpecialCharactersScore(content,LanguageRules.dutchSpecialCharacters);
		allLanguages[5][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.germanCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.germanSuffixes) + SpecialCharactersScoreCalculator.SpecialCharactersScore(content,LanguageRules.germanSpecialCharacters);
		allLanguages[6][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.romanianCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.romanianSuffixes) + SpecialCharactersScoreCalculator.SpecialCharactersScore(content,LanguageRules.romanianSpecialCharacters);
		allLanguages[7][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.portugueseCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.portugueseSuffixes) + SpecialCharactersScoreCalculator.SpecialCharactersScore(content,LanguageRules.portugueseSpecialCharacters);
		allLanguages[8][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.walloonCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.walloonSuffixes) + SpecialCharactersScoreCalculator.SpecialCharactersScore(content,LanguageRules.walloonSpecialCharacters);
		allLanguages[9][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.swedishCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.swedishSuffixes) + SpecialCharactersScoreCalculator.SpecialCharactersScore(content,LanguageRules.swedishSpecialCharacters);
		allLanguages[10][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.norwegianCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.norwegianSuffixes) + SpecialCharactersScoreCalculator.SpecialCharactersScore(content,LanguageRules.norwegianSpecialCharacters);
		allLanguages[11][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.azeriCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.azeriSuffixes) + SpecialCharactersScoreCalculator.SpecialCharactersScore(content,LanguageRules.azeriSpecialCharacters);
		allLanguages[12][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.icelandicCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.icelandicSuffixes) + SpecialCharactersScoreCalculator.SpecialCharactersScore(content,LanguageRules.icelandicSpecialCharacters);
		allLanguages[13][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.polishCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.polishSuffixes) + SpecialCharactersScoreCalculator.SpecialCharactersScore(content,LanguageRules.polishSpecialCharacters);
		
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
	public static int getIndexOfLargest()
	{
	  int largest = 0;
	 
	  for ( int i = 1; i < allLanguages.length; i++ )
	      if ( (Integer)allLanguages[i][1] > (Integer)allLanguages[largest][1] ) largest = i;
	  
	  return largest; // position of the first largest found
	}
}