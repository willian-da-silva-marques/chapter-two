package com.ocajexam.chapter.two;

/**
 * @since 08/01/2020
 * @author willian
 *
 * Instrução rotulada é usada para fornecer um rótulo pré-fixado a uma instrução.
 * Pode ser usada com as instruções de tranferência de controle: continue e break 
 */
public class InstrucoesRotuladas {

	public static void main(String[] args) {
		 labeledBreakTest();
		 labeledContinueTest();
		 generateTablesOfPairs();
	}

	private static void labeledBreakTest() {
		myBreakLabel: while (true) {
			System.out.println("While loop 1");
			while (true) {
				System.out.println("While loop 2");
				while (true) {
					System.out.println("While loop 3");
					break myBreakLabel;
				}
			}
		}
	}

	private static void labeledContinueTest() {
		myContinueLabel: while (true) {
			System.out.println("While loop 1");
			while (true) {
				System.out.println("While loop 2");
				while (true) {
					System.out.println("While loop 3");
					continue myContinueLabel;
//					while (true) { // Ocorre o erro: Unreachable code
//						System.out.println("While loop 4");
//					}
				}
			}
		}
	}

	private static void generateTablesOfPairs() {
		int i = 0;
		labelWhile: while (i < 11) {
			if (i % 2 != 0) {
				i++;
				continue labelWhile;
			}
			for (int j = 0; j < 11; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			i++;
		}
	}
}
