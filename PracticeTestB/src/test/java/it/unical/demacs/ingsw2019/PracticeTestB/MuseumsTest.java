package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MuseumsTest {
	
	@Test
	public void moreThan() {
		LouvreMuseum louvreMuseum = new LouvreMuseum();
		BritishMuseum britishMuseum = new BritishMuseum();
		boolean check = louvreMuseum.getAverageRate() > britishMuseum.getAverageRate();
		assertEquals(true, check);
	}
	
	@Test
	public void moreThanRandom() {
		LouvreMuseum louvreMuseum = new LouvreMuseum();
		RandomMuseum randomMuseum = new RandomMuseum(100);
		boolean check = louvreMuseum.getAverageRate() > randomMuseum.getAverageRate();
		assertEquals(true, check);
	}
	
	@Test
	public void difference() {
		RandomMuseum r1 = new RandomMuseum(1000);
		RandomMuseum r2 = new RandomMuseum(1000);
		float diff = (float) Math.abs(r1.getAverageRate() - r2.getAverageRate());
		boolean check = diff < 1.5;
		assertEquals(true, check);
	}
}
