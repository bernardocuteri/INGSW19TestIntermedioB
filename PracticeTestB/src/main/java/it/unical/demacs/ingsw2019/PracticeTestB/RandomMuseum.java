package it.unical.demacs.ingsw2019.PracticeTestB;

import java.util.ArrayList;
import java.util.Random;

public class RandomMuseum extends Museum {

	/*
	 * Istanzia un museo con n opere il cui punteggio (rate) è un numero casuale nell'intervallo [0,10]
	 */
	public RandomMuseum(int n) {
		super("Random Museum", new ArrayList<>());
		Random rand = new Random();
		for(int i=0;i<n;i++) {
			addArtWork(new ArtWork("", "", rand.nextInt(11)));
		}
	}
	

	
}
