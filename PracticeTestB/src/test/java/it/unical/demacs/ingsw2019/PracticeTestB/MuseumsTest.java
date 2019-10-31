package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MuseumsTest {

	private LouvreMuseum louvre = new LouvreMuseum();
	
	@Test
	public void testLouvreBritish() {
		BritishMuseum british = new BritishMuseum();
		assertEquals(louvre.getAverageRate()>british.getAverageRate(), true);
	}
	
	/*
	 * un metodo che verifichi che il punteggio medio di una istanza di LouvreMuseum
	 *  sia superiore al punteggio medio di una istanza di RandomMuseum con 100 opere casuali 
	 */
	
	@Test
	public void testLouvreRandom() {
		RandomMuseum r = new RandomMuseum(100);
		assertEquals(louvre.getAverageRate()>r.getAverageRate(), true);
	}
	
	/*un metodo che verifichi che la differenza in valore assoluto 
	 * tra i punteggi medi di due istanze di RandomMuseum contenenti 1000 opere sia inferiore a 1.5
	 */
	
	@Test
	public void testRandom() {
		RandomMuseum r = new RandomMuseum(1000);
		RandomMuseum s = new RandomMuseum(1000);
		
		double differenza = r.getAverageRate() - s.getAverageRate();
		if(differenza<0)
			differenza*=-1;
		
		assertEquals(differenza<1.5, true);
	}
	
	
	@After
	public void endTest() {
		System.out.println("test terminato");
	}
	
	
	
}
