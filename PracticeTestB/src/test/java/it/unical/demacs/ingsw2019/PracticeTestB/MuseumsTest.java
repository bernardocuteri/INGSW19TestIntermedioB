package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MuseumsTest {
	
	@Test
	public void louvreMuseumBritishAverageTest() {
		
		LouvreMuseum louvreMuseum = new LouvreMuseum();
		BritishMuseum britishMuseum = new BritishMuseum();
		double aL = louvreMuseum.getAverageRate();
		double aB = britishMuseum.getAverageRate();
		assertTrue(aL>aB);
		
	}
	
	@Test
	public void louvreMuseumRandomAverageTest() {
		LouvreMuseum louvreMuseum = new LouvreMuseum();
		RandomMuseum randomMuseum = new RandomMuseum(100);
		double aL = louvreMuseum.getAverageRate();
		double aR = randomMuseum.getAverageRate();
		assertTrue(aL>aR);
	}
	
	@Test
	public void randomMuseumAverageTest() {
		RandomMuseum randomMuseum = new RandomMuseum(1000);
		RandomMuseum randomMuseum2 = new RandomMuseum(1000);
		double aL = randomMuseum.getAverageRate();
		double aR = randomMuseum2.getAverageRate();
		double diff;
		if(aL>aR)
			diff = aL-aR;
		else
			diff = aR-aL;
		assertTrue(diff<1.5);	
	}
	
	
}
