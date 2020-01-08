package com.ocajexam.chapter.two;

/**
 * @since 07/01/2020
 * @author willian
 * 
 * A instru��o if-then ou if else if como tamb�m � conhecida � usada
 * quando v�rias condi��es precisam ser percorridas em um cen�rio
 * baseado em decis�es.
 */
public class InstrucaoCondicionalIfThen {

	public static void main(String[] args) {
		/**
		 * A forma geral da instru��o condicional if-then �:
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