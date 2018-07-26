package com.collection.languageidentifier;


public class IdentifierFunctions {
	
	static Object[][] allLanguages = {{"English",0}, {"Italian",0}, {"French",0}, {"Spanish",0}, {"Dutch",0}, {"German",0}, {"Danish",0}};
	
	static int englishScore = 0;
	static int italianScore = 0;
	static int frenchScore = 0;
	static int spanishScore = 0;
	
	//Identify language with highest score 
	public static String languageIdentifier(String content) {
		
		allLanguages[0][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.englishCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.englishSuffixes);
		allLanguages[1][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.italianCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.italianSuffixes);
		allLanguages[2][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.frenchCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.frenchSuffixes);
		allLanguages[3][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.spanishCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.spanishSuffixes);
		allLanguages[4][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.dutchCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.dutchSuffixes);
		allLanguages[5][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.germanCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.germanSuffixes);
		allLanguages[6][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.danishCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.danishSuffixes);
		
		//Temporary
		for(int i = 0; i < allLanguages.length; i++)
		{
		    for(int j = 0; j<2; j++)
		    {
		        System.out.print(allLanguages[i][j]);
		    }
		    System.out.println();
		}
		
		int lan = getIndexOfLargest();
		
		return allLanguages[lan][0].toString();
	}
	
	// Get the index of highest score language
	public static int getIndexOfLargest()
	{
	  int largest = 0;
	  for ( int i = 1; i < allLanguages.length; i++ )
	  {
	      if ( (Integer)allLanguages[i][1] > (Integer)allLanguages[largest][1] ) largest = i;
	  }
	  return largest; // position of the first largest found
	}
}