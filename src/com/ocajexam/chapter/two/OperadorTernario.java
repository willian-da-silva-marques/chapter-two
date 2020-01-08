package com.ocajexam.chapter.two;

/**
 * @since 08/01/2020
 * @author willian
 * 
 * O operador ternário é uma variação da instrução condicional if-then-else, mas, nunca inclui else if opcionais.
 * Tem esse nome por ser o único operador a usar três operandos.
 */
public class OperadorTernario {

	public static void main(String[] args) {
		/**
		 * A forma geral da instrução condicional do operador ternário é:
		 */
		int numero = 5;
		
		boolean condicaoDeTeste = numero > 0;
		
		String seExpressaoVerdadeira = numero + " é maior que 0";
		String seExpressaoFalsa = numero + " não é maior que 0";
		String resultado = condicaoDeTeste ? seExpressaoVerdadeira : seExpressaoFalsa;
		
		System.out.printf("%s", resultado);
	}
}