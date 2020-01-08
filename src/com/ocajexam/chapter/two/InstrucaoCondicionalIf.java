package com.ocajexam.chapter.two;

/**
 * @since 07/01/2020
 * @author willian
 * 
 * A instrução if existe para executar condicionalmente uma instrução,
 * ou selecionar condicionalmente uma entre várias instruções
 */
public class InstrucaoCondicionalIf {

	public static void main(String[] args) {
		/**
		 * A forma geral da instrução condicional if é:
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