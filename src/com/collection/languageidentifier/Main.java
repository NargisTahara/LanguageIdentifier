package com.collection.languageidentifier;


public class Main {
   public static void main(String[] args) {
	   
	   String content = "Enhver har ret til undervisning. Undervisningen skal v�re gratis, i det mindste p� de element�re og grundl�ggende trin. Element�r undervisning skal v�re obligatorisk. Teknisk og faglig uddannelse skal g�res almindelig tilg�ngelig for alle, og p� grundlag af evner skal der v�re lige adgang for alle til h�jere undervisning.";
	   
	   // Identify langugae of text
	   String detectedLanguage = IdentifierFunctions.languageIdentifier(content);
	   
	   System.out.println();
	   System.out.println();
	   System.out.println("Language of the document is: " + detectedLanguage);
   }
}