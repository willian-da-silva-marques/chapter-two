package com.ocajexam.chapter.two;

/**
 * @since 07/01/2020
 * @author willian
 * 
 * A instru��o if existe para executar condicionalmente uma instru��o,
 * ou selecionar condicionalmente uma entre v�rias instru��es
 */
public class InstrucaoCondicionalIf {

	public static void main(String[] args) {
		/**
		 * A forma geral da instru��o condicional if �:
		 */
		boolean expressao = true;
		String instrucaoA = "'expressao' = true";
		String instrucaoB = "'expressao' = false";
		if (expressao) {
			System.out.printf("%s", instrucaoA);
		} else {
			System.out.printf("%s", instrucaoB);
		}
	}
}