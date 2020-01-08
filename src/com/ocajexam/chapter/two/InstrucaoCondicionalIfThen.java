package com.ocajexam.chapter.two;

/**
 * @since 07/01/2020
 * @author willian
 * 
 * A instrução if-then ou if else if como também é conhecida é usada
 * quando várias condições precisam ser percorridas em um cenário
 * baseado em decisões.
 */
public class InstrucaoCondicionalIfThen {

	public static void main(String[] args) {
		/**
		 * A forma geral da instrução condicional if-then é:
		 */
		boolean expressaoA = false;
		boolean expressaoB = true;
		String instrucaoA = "'expressaoA' = true";
		String instrucaoB = "'expressaoB' = true";
		if (expressaoA) {
			System.out.printf("%s%n", instrucaoA);
		} else if (expressaoB) {
			System.out.printf("%s%n", instrucaoB);
		}

		// Exemplo 1
		int pyramidSinker = 3;
		System.out.print("A pyramid sinker that weighs " + pyramidSinker + " ounces is ");
		if (pyramidSinker == 2)
			System.out.print("used for a slow moving tide.");
		else if (pyramidSinker == 3)
			System.out.print("used for a moderate moving tide.");
		else if (pyramidSinker == 4)
			System.out.print("used for a fast moving tide.");
	}
}