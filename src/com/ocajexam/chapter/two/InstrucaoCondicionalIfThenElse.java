package com.ocajexam.chapter.two;

/**
 * @since 08/01/2020
 * @author willian
 *
 * Assim como nas instruções if e if-then todas as expressões devem ter
 * como resultado um valor primitivo booleano(true ou false) a principal
 * diferença da instrução if-then-else é que o código aceita o último
 * else quando a expressão não conseguir retornar true para nenhuma condição.
 */
public class InstrucaoCondicionalIfThenElse {

	public static void main(String[] args) {
		/**
		 * A forma geral da instrução condicional if-then-else é:
		 */
		boolean expressaoA = false;
		boolean expressaoB = false;
		boolean expressaoC = false;
		boolean expressaoD = false;
		
		String instrucaoA = "'expressaoA' = false";
		String instrucaoB = "'expressaoB' = false";
		String instrucaoC = "'expressaoC' = false";
		String instrucaoD = "'expressaoD' = false";
		String instrucaoE = "'expressaoE' = true";
		if (expressaoA) {
			System.out.printf("%s%n", instrucaoA);
		} else if (expressaoB) {
			System.out.printf("%s%n", instrucaoB);
		} else if (expressaoC) {
			System.out.printf("%s%n", instrucaoC);
		} else if (expressaoD) {
			System.out.printf("%s%n", instrucaoD);
		} else {
			System.out.printf("%s%n", instrucaoE);
		}
	}
}