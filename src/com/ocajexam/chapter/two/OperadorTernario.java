package com.ocajexam.chapter.two;

/**
 * @since 08/01/2020
 * @author willian
 * 
 * O operador tern�rio � uma varia��o da instru��o condicional if-then-else, mas, nunca inclui else if opcionais.
 * Tem esse nome por ser o �nico operador a usar tr�s operandos.
 */
public class OperadorTernario {

	public static void main(String[] args) {
		/**
		 * A forma geral da instru��o condicional do operador tern�rio �:
		 */
		int numero = 5;
		
		boolean condicaoDeTeste = numero > 0;
		
		String seExpressaoVerdadeira = numero + " � maior que 0";
		String seExpressaoFalsa = numero + " n�o � maior que 0";
		String resultado = condicaoDeTeste ? seExpressaoVerdadeira : seExpressaoFalsa;
		
		System.out.printf("%s", resultado);
	}
}