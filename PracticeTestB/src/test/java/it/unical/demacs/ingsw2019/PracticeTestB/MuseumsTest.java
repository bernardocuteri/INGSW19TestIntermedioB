package it.unical.demacs.ingsw2019.PracticeTestB;

import org.junit.Test;

import junit.framework.Assert;

public class MuseumsTest {
	
	private BritishMuseum bm = new BritishMuseum();
	private LouvreMuseum lm = new LouvreMuseum();
	private RandomMuseum rm = new RandomMuseum(100);
	private RandomMuseum rm2 = new RandomMuseum(1000);
	private RandomMuseum rm3 = new RandomMuseum(1000);
	/*
	 * un metodo che verifichi che il punteggio medio di una istanza di LouvreMuseum sia superiore al punteggio medio di una istanza di BritishMuseum

	 */
	
	@Test
	public void test1() {
		//louvre museum > british museum
		System.out.println("media di british museum: "+bm.getAverageRate());
		System.out.println("media di louvre museum: "+lm.getAverageRate());
		Assert.assertFalse(bm.getAverageRate()>lm.getAverageRate());
	}
	
	
	/*
	 * un metodo che verifichi che il punteggio medio di una istanza di LouvreMuseum sia superiore al punteggio medio di una istanza di RandomMuseum con 100 opere casuali 
	 */
	@Test
	public void test2() {
		//punteggio medio di louvreM > punteggio medio di istanza di RandomM con 100 opere
		System.out.println("media di random museum: "+rm.getAverageRate());
		System.out.println("media di louvre museum: "+lm.getAverageRate());
		Assert.assertTrue(lm.getAverageRate()>rm.getAverageRate());
	
	}
	
	/*
	 * un metodo che verifichi che la differenza in valore assoluto tra i punteggi medi di due istanze di RandomMuseum contenenti 1000 opere sia inferiore a 1.5
	 */
	
	@Test
	public void test3() {
		//abs(diff) tra Random1 - Random2 di 1000 <1.5
		
		//rm2,rm3
		
		double differenza = rm2.getAverageRate() - rm3.getAverageRate();
		if(differenza < 0) { //fare abs meglio
			differenza  = differenza *(-1);
		}
		System.out.println("Differenza: "+differenza);
		Assert.assertTrue(differenza<1.5);
		
	}
}
