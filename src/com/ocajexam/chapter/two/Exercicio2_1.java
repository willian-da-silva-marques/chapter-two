package com.ocajexam.chapter.two;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Exercicio2_1 {

	public static void main(String[] args) {
		int i = new Random().nextInt(11);
		List<String> meses = Arrays.asList("JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO",
				"SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO");

		String mes = null;

		for (int j = 0; j < meses.size(); j++) {
			if (i == j) {
				mes = meses.get(j);
			}
		}

		// instrução condicional switch avaliando String
		switch (mes) {
		case "JANEIRO":
			System.out.printf("%s", mes);
			break;
		case "FEVEREIRO":
			System.out.printf("%s", mes);
			break;
		case "MARÇO":
			System.out.printf("%s", mes);
			break;
		case "ABRIL":
			System.out.printf("%s", mes);
			break;
		case "MAIO":
			System.out.printf("%s", mes);
			break;
		case "JUNHO":
			System.out.printf("%s", mes);
			break;
		case "JULHO":
			System.out.printf("%s", mes);
			break;
		case "AGOSTO":
			System.out.printf("%s", mes);
			break;
		case "SETEMBRO":
			System.out.printf("%s", mes);
			break;
		case "OUTUBRO":
			System.out.printf("%s", mes);
			break;
		case "NOVEMBRO":
			System.out.printf("%s", mes);
			break;
		case "DEZEMBRO":
			System.out.printf("%s", mes);
			break;
		default:
			System.err.println("MÊS INVÁLIDO!");
			break;
		}
	}
}