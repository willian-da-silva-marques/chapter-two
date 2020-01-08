package com.ocajexam.chapter.two;

import java.util.Random;

import com.ocajexam.chapter.two.enums.ClamBait;

/**
 * @since 08/01/2020
 * @author willian
 * 
 * A instrução condicional switch é usada para comparar o valor de sua
 * expressão com o valor associado a uma palavra-chave case. Se os
 * valores coincidirem as instruções associadas a cláusula case
 * coincidente serão executadas, a menos que uma instrução break seja
 * encontrada, estas são opcionais e causam o término imediato da
 * instrução switch. A expressão da instrução switch deve ter como
 * resultado os tipos: byte, short, int ou char. As classes wrappers dos
 * tipos Byte, Short, Integer e Character também são permitidas porque
 * sofrem unboxing automático.
 */
public class InstrucaoCondicionalSwitch {

	public static void main(String[] args) {
		/**
		 * A forma geral da instrução condicional if-then-else é:
		 */
		int expressao = 5;
		switch (expressao) {
		case 1:
			System.out.printf("case %d%n", expressao);
			break;
		case 2:
			System.out.printf("case %d%n", expressao);
			break;
		case 3:
			System.out.printf("case %d%n", expressao);
			break;
		case 4:
			System.out.printf("case %d%n", expressao);
			break;
		default:
			System.out.printf("default %d%n", expressao);
			break;
		}

		// Exemplo 1
		System.out.printf("%s%n", generatedRandomFish());
		
		// Exemplo 2
		getClamBait();
	}

	private static void getClamBait() {
		ClamBait bait = ClamBait.SALTED;
		switch (bait) {
		default:
			System.out.println("No bait!");
			break;
		case FRESH:
			System.out.println("Fresh clams");
			break;
		case SALTED:
			System.out.println("Salted clams");
			break;
		case ARTIFICIAL:
			System.out.println("Artificial clams");
			break;
		}
	}

	private static String generatedRandomFish() {
		String randomFish = null;
		int randomNumber = new Random().nextInt(4);// O número gerado poderá ser: 0, 1, 2 ou 3
		switch (randomNumber) {
		case 0:
			randomFish = "Blue Fish";
			break;
		case 1:
			randomFish = "Red Drum";
			break;
		case 2:
			randomFish = "Striped Bass";
			break;
		default:
			randomFish = "Unknown Fish Type";
			break;
		}
		return randomFish;
	}
}