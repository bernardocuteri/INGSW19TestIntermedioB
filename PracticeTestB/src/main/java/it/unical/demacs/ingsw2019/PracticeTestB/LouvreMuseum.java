package it.unical.demacs.ingsw2019.PracticeTestB;

import java.util.Arrays;

public class LouvreMuseum extends Museum {

	public LouvreMuseum() {
		super("Louvre Museum", Arrays.asList(
				new ArtWork("Monalisa", "Leonardo da Vinci", 10),
				new ArtWork("Venus de Milo", "Alexandros of Antioch", 7),
				new ArtWork("Psyche Revived by Cupid's Kiss", "	Antonio Canova", 8)));
	}

}
