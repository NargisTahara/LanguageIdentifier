package com.collection.languageidentifier;


public class Main {
   public static void main(String[] args) {
	   
	   String content = "When you think of football legends, it's hard to compile a list that doesn't include former Green Bay Packers quarterback Brett Favre.";
	   
	   // Identify langugae of text
	   String detectedLanguage = IdentifierFunctions.languageIdentifier(content);
	   
	   System.out.println();
	   System.out.println();
	   System.out.println("Language of the document is: " + detectedLanguage);
   }
}