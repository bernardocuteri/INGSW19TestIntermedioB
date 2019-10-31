package it.unical.demacs.ingsw2019.PracticeTestB;

import java.util.Arrays;

public class BritishMuseum extends Museum {

	public BritishMuseum() {
		super("British Museum", Arrays.asList(
				new ArtWork("Rosetta Stone", "unknown", 9),
				new ArtWork("Ramses II", "unknown", 7),
				new ArtWork("Amenofi III", "unknown", 8)));
	
	}

}
