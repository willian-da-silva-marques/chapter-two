package com.ocajexam.chapter.one;

public class InstrucaoDeExpressaoDeAtribuicao {

	public static void main(String[] args) {
		
		//Exemplo 1
		/**
		 * Declara��o da vari�vel
		 */
		int nomeDaVariavel;
		
		/**
		 * Instru��o de Express�o de Atribui��o
		 */
		nomeDaVariavel = 100;
		
		//------------------------------------------x------------------------------------------
		
		System.out.printf("nomeDaVariavel: %d%n", nomeDaVariavel);
		
		// Exemplo 2
		/**
		 * Declara��o de vari�veis seguida da instru��o de express�o de atribui��o
		 */
		int fishInTank = 100;
		int fishInCooler = 50;
		
		//declara��o 		  //express�o
		int totalFish = fishInTank + fishInCooler;//-->instru��o de express�o de atribui��o
		System.out.printf("totalFish: %d%n", totalFish);
		
		// Exemplo 3
		/**
		 * Erro de compila��o: Type mismatch: cannot convert from String to int
		 */
		//int numeroDoTipoInt = "USO_INV�LIDO_DE_UMA_STRING";
	}

}
