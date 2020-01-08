package com.ocajexam.chapter.one;

public class InstrucaoDeExpressaoDeAtribuicao {

	public static void main(String[] args) {
		
		//Exemplo 1
		/**
		 * Declaração da variável
		 */
		int nomeDaVariavel;
		
		/**
		 * Instrução de Expressão de Atribuição
		 */
		nomeDaVariavel = 100;
		
		//------------------------------------------x------------------------------------------
		
		System.out.printf("nomeDaVariavel: %d%n", nomeDaVariavel);
		
		// Exemplo 2
		/**
		 * Declaração de variáveis seguida da instrução de expressão de atribuição
		 */
		int fishInTank = 100;
		int fishInCooler = 50;
		
		//declaração 		  //expressão
		int totalFish = fishInTank + fishInCooler;//-->instrução de expressão de atribuição
		System.out.printf("totalFish: %d%n", totalFish);
		
		// Exemplo 3
		/**
		 * Erro de compilação: Type mismatch: cannot convert from String to int
		 */
		//int numeroDoTipoInt = "USO_INVÁLIDO_DE_UMA_STRING";
	}

}
