package com.collection.languageidentifier;


public class Main {
   public static void main(String[] args) {
	   
	   String content = "Enhver har ret til undervisning. Undervisningen skal være gratis, i det mindste på de elementære og grundlæggende trin. Elementær undervisning skal være obligatorisk. Teknisk og faglig uddannelse skal gøres almindelig tilgængelig for alle, og på grundlag af evner skal der være lige adgang for alle til højere undervisning.";
	   
	   // Identify langugae of text
	   String detectedLanguage = IdentifierFunctions.languageIdentifier(content);
	   
	   System.out.println();
	   System.out.println();
	   System.out.println("Language of the document is: " + detectedLanguage);
   }
}