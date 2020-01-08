package com.ocajexam.chapter.two;

/**
 * @since 08/01/2020
 * @author willian
 *
 * A instru��o de tranfer�ncia de controle break � usada para sairmos
 * ou for�armos a termina��o abrupta do corpo da instru��o condicional switch
 * assim como do corpo dos la�os for e foreach a das instru��es de itera��o while e do-while
 */
public class InstrucaoDeTransferenciaDeControleBreak {

	public static void main(String[] args) {
		/**
		 * A forma geral da isntru��o break �:
		 */
		// break;

		//Exemplo 1
		int totalHoursFishing = 0;
		int hoursAllowedFishing = 4;
		for (int i = 1; i < 25; i++) {
			++totalHoursFishing;
			if (totalHoursFishing > hoursAllowedFishing)
				break;
			System.out.println("Fishing for hour " + i +".");
		}
	}
}