package com.ocajexam.chapter.two;

import java.util.ArrayList;
import java.util.List;

import com.ocajexam.chapter.two.model.Alfabeto;

/**
 * @since 08/01/2020
 * @author willian
 * 
 * O laço for melhorado, foreach ou for in ou ainda enhanced for é usado para iterar sobre um array, 
 * uma coleção ou um objeto que implemente a interfaze iterable
 */
public class InstrucaoDeIteracaoForEach {

	public static void main(String[] args) throws ClassNotFoundException {
		/**
		 * A forma geral da instrução condicional foreach é:
		 */
		Alfabeto alfabeto = new Alfabeto();
		List<String> colecao = alfabeto.getLetras();
		
		for (String nomeDaVariavel : colecao) {
			System.out.printf("%s%n",nomeDaVariavel);
		}
		System.out.println();

		//Exemplo 1
		int hookSizes[] = {1,1,1,2,2,4,5,5,5,6,7,8,8,9};
		for (int hook : hookSizes) System.out.println(hook + " ");
		
		System.out.println();
		
		//Exemplo 2
		List<Integer> hookSizesList = new ArrayList<>();
		hookSizesList.add(1);
		hookSizesList.add(4);
		hookSizesList.add(5);
		for (Integer hook : hookSizesList) System.out.println(hook + " ");
	}
}