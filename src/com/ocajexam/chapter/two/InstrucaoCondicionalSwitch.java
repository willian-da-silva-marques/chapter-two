package com.ocajexam.chapter.two;

import java.util.Random;

import com.ocajexam.chapter.two.enums.ClamBait;

/**
 * @since 08/01/2020
 * @author willian
 * 
 * A instru��o condicional switch � usada para comparar o valor de sua
 * express�o com o valor associado a uma palavra-chave case. Se os
 * valores coincidirem as instru��es associadas a cl�usula case
 * coincidente ser�o executadas, a menos que uma instru��o break seja
 * encontrada, estas s�o opcionais e causam o t�rmino imediato da
 * instru��o switch. A express�o da instru��o switch deve ter como
 * resultado os tipos: byte, short, int ou char. As classes wrappers dos
 * tipos Byte, Short, Integer e Character tamb�m s�o permitidas porque
 * sofrem unboxing autom�tico.
 */
public class InstrucaoCondicionalSwitch {

	public static void main(String[] args) {
		/**
		 * A forma geral da instru��o condicional if-then-else �:
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
		int randomNumber = new Random().nextInt(4);// O n�mero gerado poder� ser: 0, 1, 2 ou 3
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