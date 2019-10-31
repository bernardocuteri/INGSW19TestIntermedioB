package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MuseumsTest {
	
	private static BritishMuseum bm = new BritishMuseum();
	private static LouvreMuseum lm = new LouvreMuseum();
	private static RandomMuseum rm = new RandomMuseum(100);
	private static RandomMuseum rm1 = new RandomMuseum(1000);
	private static RandomMuseum rm2 = new RandomMuseum(1000);
	
	@Test
	public void verificaMedia() {
		assertTrue(lm.getAverageRate() > bm.getAverageRate());
	}
	
	@Test
	public void verificaMedia2() {
		assertTrue(lm.getAverageRate() > rm.getAverageRate());
	}
	
	@Test 
	public void valoreAssoluto() {
		double differenza = rm1.getAverageRate() - rm2.getAverageRate();
		if(differenza < 0)
			differenza = differenza * -1;
		assertTrue(differenza < 1.5);
	}
}
