package com.collection.languageidentifier;


public class IdentifierFunctions {
	
	static Object[][] allLanguages = {{"English",0}, {"Italian",0}, {"French",0}, {"Spanish",0}, {"Dutch",0}, {"German",0}, {"Danish",0}, {"Romanian",0}, {"Portuguese",0}, {"Walloon",0}, {"Swedish",0}, {"Norwegian",0}, {"Azeri",0}, {"Icelandic",0}, {"Polish",0}, {"Guaraní",0}};
	
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
		allLanguages[7][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.romanianCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.romanianSuffixes);
		allLanguages[8][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.portugueseCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.portugueseSuffixes);
		allLanguages[9][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.walloonCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.walloonSuffixes);
		allLanguages[10][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.swedishCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.swedishSuffixes);
		allLanguages[11][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.norwegianCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.norwegianSuffixes);
		allLanguages[12][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.azeriCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.azeriSuffixes);
		allLanguages[13][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.icelandicCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.icelandicSuffixes);
		allLanguages[14][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.polishCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.polishSuffixes);
		allLanguages[15][1] = CommonWordsScoreCalculator.CommonWordsScore(content,LanguageRules.guaraníCommonWords) + SuffixScoreCalculator.SuffixScore(content,LanguageRules.guaraníSuffixes);
		
		//Temporary
		for(int i = 0; i < allLanguages.length; i++)
		{
		    for(int j = 0; j<2; j++)
		    {
		        //System.out.print(allLanguages[i][j]);
		    }
		    //System.out.println();
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