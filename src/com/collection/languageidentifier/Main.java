package com.collection.languageidentifier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) throws FileNotFoundException {
	  
	   final File file = new File("C:\\\\Users\\\\Mining\\\\Documents\\\\GitHub\\\\MGR-repo\\\\LanguageIdentifier\\\\Datasets\\\\Italian");
	   for(final File child : file.listFiles()) {
		   String entireFileText = new Scanner(child).useDelimiter("\\A").next();
		   System.out.println(child.getName()+" "+IdentifierFunctions.languageIdentifier(entireFileText));
	   }
   }
}