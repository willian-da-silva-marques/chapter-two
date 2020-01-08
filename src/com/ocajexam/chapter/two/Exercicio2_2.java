package com.ocajexam.chapter.two;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercicio2_2 {

	public static void main(String[] args) {
		List<Float> fishLengthList = Arrays.asList(10.0f, 15.5f, 18.0f, 29.5f, 45.5f);
		// Usando a maneira antiga [LEGADO]
		Iterator<Float> iterator = fishLengthList.iterator();
		System.out.println("Iterator");
		while (iterator.hasNext()) {
			Float next = iterator.next();
			if(next > 28)
				System.out.println(next);
		}
		
		// Usando for
		System.out.println("\nFor");
		for (int i = 0; i < fishLengthList.size(); i++) {
			if(fishLengthList.get(i) > 28)
				System.out.println(fishLengthList.get(i));
		}
		
		System.out.println("\nForeach");
		// Usando for melhorado/for in/foreach/enhanced for
		for (Float f : fishLengthList) {
			if(f > 28)
				System.out.println(f);
		}
	}
}