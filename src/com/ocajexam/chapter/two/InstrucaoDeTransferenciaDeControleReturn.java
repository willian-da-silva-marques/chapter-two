package com.ocajexam.chapter.two;

/**
 * @since 08/01/2020
 * @author willian
 *
 * A instru��o de transfer�ncia de controle return serve para sairmos de um m�todo 
 * e opcionalmente retornarmos um valor expecpifico como uma express�o
 * a instru��o de return sem valor de retorno deve ter a palhavra-chave "void" na declara��o do m�todo 
 */
public class InstrucaoDeTransferenciaDeControleReturn {

	public static void main(String[] args) {
		/**
		 * A forma geral da instru��o return e:
		 */
//		return expressao;

		
		//Exemplo 1
		System.out.println(getTotalFishTypes(100, 50, 70));
	}

	private static int getTotalFishTypes(int saltWaterFishTotal, int freshWaterFishTotal, int brackishFishTotal) {
		int fishTypesTotal = saltWaterFishTotal + freshWaterFishTotal + brackishFishTotal;
		return fishTypesTotal;
	}

}
