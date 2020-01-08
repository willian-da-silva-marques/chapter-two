package com.ocajexam.chapter.two;

/**
 * @since 08/01/2020
 * @author willian
 *
 * A instrução de tranferência de controle continue é usada para terminar a iteração atual 
 * de um laço for, foreach, while e do-while e passar para a proxima iteração.
 */
public class InstrucaoDeTransferenciaDeControleContinue {

	public static void main(String[] args) {
		/**
		 * A forma geral da isntrução continue é:
		 */
		// continue;
		int totalDaysCamping = 0;
		int daysAllowedFishing = 5;
		for (int i = 1; i < 8; ++i) {
			System.out.print("\nDay " + i + ": camping ");
			totalDaysCamping++;
			if (totalDaysCamping > daysAllowedFishing)
				continue;
			System.out.print("and fishing");
		}
	}
}
