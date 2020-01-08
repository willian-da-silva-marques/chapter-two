package com.ocajexam.chapter.two;

/**
 * @since 08/01/2020
 * @author willian
 *
 * A instrução de tranferência de controle break é usada para sairmos
 * ou forçarmos a terminação abrupta do corpo da instrução condicional switch
 * assim como do corpo dos laços for e foreach a das instruções de iteração while e do-while
 */
public class InstrucaoDeTransferenciaDeControleBreak {

	public static void main(String[] args) {
		/**
		 * A forma geral da isntrução break é:
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