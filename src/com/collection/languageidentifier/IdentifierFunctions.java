package com.collection.languageidentifier;


public class IdentifierFunctions {
	
	static Object[][] allLanguages = {{"English",0}, {"Italian",0}, {"French",0}};
	
	static int englishScore = 0;
	static int italianScore = 0;
	static int frenchScore = 0;
	
	//Identify language with highest score 
	public static String languageIdentifier(String content) {
		
		allLanguages[0][1] = CommonWordsScoreCalculator.englishCommonWordsScore(content);
		allLanguages[1][1] = CommonWordsScoreCalculator.italianCommonWordsScore(content);
		allLanguages[2][1] = CommonWordsScoreCalculator.frenchCommonWordsScore(content);
		
		//Temporary
		for(int i = 0; i<3; i++)
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