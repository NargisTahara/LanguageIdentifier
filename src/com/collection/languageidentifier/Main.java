package com.collection.languageidentifier;


public class Main {
   public static void main(String[] args) {
	   
	   String content = "Mentir�a si dijera que era del todo nuevo el sentimiento de que ya no iba a poder ser m�s que lo que era, que era un hombre que hab�a envejecido m�s de lo que supon�a, que hab�a sospechado tener toda la vida por delante y hab�a ido dejando pasar los a�os a la espera de que llegara su momento, y ahora la ten�a a su espalda. La vida pospuesta para cuando las condiciones fueran favorables. Vivir en una suerte de provisionalidad que le hab�a empujado a aplazarlo todo. Ahora que no ten�a futuro alguno, o que �ste era una pl�cida, rutinaria, repetici�n del presente. Ciertas madrugadas le hab�an ense�ado la serenidad de lo irremediable. Despertarse, ventearse como un perro la vida, ocuparse de sus asuntillos, sacar provecho de ellos, comer, beber, dormir. Ahora, s�lo ahora, cuando estaba de verdad solo, sab�a que la vida se escapa por las buenas, corre mucho m�s deprisa de lo que �l mismo supon�a. Su vida pod�a resumirse en un apretado rosario de decepciones secretas, de sue�os malogrados que hab�a ido disfrazando como hab�a podido, de tentativas m�s o menos racionales de salir del terreno pantanoso en el que se debat�a desde hac�a m�s de quince a�os: los negocios para los que no estaba capacitado. Siempre en lucha y en desacuerdo consigo mismo, haciendo aquello que en el fondo no quer�a hacer, simulando un inter�s por las cosas en las que se ocupaba que estaba muy lejos de tener, hasta convertirse en un fantasma, en una sombra de s� mismo. En ese barullo se le hab�a ido algo m�s de media vida.";
	   
	   // Identify langugae of text
	   String detectedLanguage = IdentifierFunctions.languageIdentifier(content);
	   
	   System.out.println();
	   System.out.println();
	   System.out.println("Language of the document is: " + detectedLanguage);
   }
}