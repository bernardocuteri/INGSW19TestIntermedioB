package it.unical.demacs.ingsw2019.PracticeTestB;

import java.util.List;

public class Museum {

	private String name;

	private List<ArtWork> artworks;

	public Museum(String name, List<ArtWork> artworks) {
		super();
		this.name = name;
		this.artworks = artworks;
	}

	public String getName() {
		return name;
	}
	
	/*
	 * Calcola il punteggio (rate) medio delle opere del museo
	 */
	public double getAverageRate() {
		if(artworks.isEmpty()) {
			throw new RuntimeException("Artworks is empty");
		}
		double rate = 0;
		for (ArtWork a : artworks) {
			rate += a.getRate();
		}
		return rate / artworks.size();
	}
	

	public void addArtWork(ArtWork a) {
		artworks.add(a);
	}
}
