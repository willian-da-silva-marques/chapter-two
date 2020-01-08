package com.ocajexam.chapter.two;

/**
 * @since 08/01/2020
 * @author willian
 *
 * A instru��o de tranfer�ncia de controle continue � usada para terminar a itera��o atual 
 * de um la�o for, foreach, while e do-while e passar para a proxima itera��o.
 */
public class InstrucaoDeTransferenciaDeControleContinue {

	public static void main(String[] args) {
		/**
		 * A forma geral da isntru��o continue �:
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
