package com.collection.languageidentifier;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws FileNotFoundException {
	   
       // Write into file instead of console 
       PrintStream o = new PrintStream(new File("..\\LanguageIdentifier\\Output\\output.txt"));
       System.setOut(o);
       
       final File file = new File("..\\LanguageIdentifier\\Datasets");
       
       // Identify languages of all files given in subfolders of Dataset folder
       for(final File child1 : file.listFiles()) {
		   
    	   System.out.println("\n\n#######################");
		   System.out.println("Test files for "+child1.getName());
		   System.out.println("#######################\n\n");
		   
		   for(final File child : child1.listFiles()) {
			   @SuppressWarnings("resource")
			   String entireFileText = new Scanner(child).useDelimiter("\\A").next();
			   
			   // IdentifierFunctions.identifyLanguage identify the language of given file
			   System.out.println("File Name: "+child.getName()+", Original Language: "+child1.getName()+", Identified Language: "+IdentifierFunctions.identifyLanguage(entireFileText));
		   }
	   }
   }
}
