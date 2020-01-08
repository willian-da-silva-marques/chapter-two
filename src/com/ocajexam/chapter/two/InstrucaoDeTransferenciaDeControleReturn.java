package com.ocajexam.chapter.two;

/**
 * @since 08/01/2020
 * @author willian
 *
 * A instrução de transferência de controle return serve para sairmos de um método 
 * e opcionalmente retornarmos um valor expecpifico como uma expressão
 * a instrução de return sem valor de retorno deve ter a palhavra-chave "void" na declaração do método 
 */
public class InstrucaoDeTransferenciaDeControleReturn {

	public static void main(String[] args) {
		/**
		 * A forma geral da instrução return e:
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
