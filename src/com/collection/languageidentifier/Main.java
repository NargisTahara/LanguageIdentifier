package com.collection.languageidentifier;


public class Main {
   public static void main(String[] args) {
	   
	   String content = "Mbaé’chepa nderéra? Ndaikuaái la ereséva. Reñe’ẽ piko avañe’ẽnte térã ambue ñe’ẽ avei. Mboý kóa?";
	   
	   // Identify langugae of text
	   String detectedLanguage = IdentifierFunctions.languageIdentifier(content);
	   
	   System.out.println();
	   System.out.println();
	   System.out.println("Language of the document is: " + detectedLanguage);
   }
}