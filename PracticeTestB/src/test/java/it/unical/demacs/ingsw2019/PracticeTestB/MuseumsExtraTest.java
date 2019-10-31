package it.unical.demacs.ingsw2019.PracticeTestB;

import org.junit.Test;

public class MuseumsExtraTest {

	@Test( expected = RuntimeException.class)
	public void noOneArtwork(){
		LouvreMuseum louvre = null; 
		
		louvre.getAverageRate(); 
	}
	@Test (timeout = 2)
	public void twoSecondsRandom() {
		
		RandomMuseum random= new RandomMuseum(1000); 
		
	}
}
