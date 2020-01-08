package com.ocajexam.chapter.two;

import com.ocajexam.chapter.two.model.FishingSession;

public class Exercicio2_3 {

	static FishingSession fishingSession = new FishingSession();

	public static void main(String[] args) {
		fishingSession.setSession("active");
		int piecesOfBait = 5;
		piecesOfBait = 0; // A raposa roubou toda a isca!
//		do {
//			/* Verifica se há iscas disponíveis */
//			if (fishingSession.isBaitAvailable() == false) {
//				fishingSession.setBaitAvailable(true);
//				piecesOfBait--;
//			}
//		} while (piecesOfBait != 0);

		// código refatorado
		while (piecesOfBait != 0) {
			if (fishingSession.isBaitAvailable() == false) {
				fishingSession.setBaitAvailable(true);
				piecesOfBait--;
			}
		}
	}
}