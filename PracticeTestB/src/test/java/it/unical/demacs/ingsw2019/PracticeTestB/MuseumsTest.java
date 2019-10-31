package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;


public class MuseumsTest {
	
	private BritishMuseum britishMuseum = new BritishMuseum();
	private LouvreMuseum louvreMuseum = new LouvreMuseum();
	private RandomMuseum randomMuseum1;
	private RandomMuseum randomMuseum2;
	
	@SuppressWarnings("deprecation")
	@Test
	public void firstTest() {
		Assert.assertFalse(britishMuseum.getAverageRate()>louvreMuseum.getAverageRate());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void secondTest() {
		randomMuseum1 = new RandomMuseum(100);
		Assert.assertTrue(louvreMuseum.getAverageRate()>randomMuseum1.getAverageRate());
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void thirdTest() {
		randomMuseum1 = new RandomMuseum(1000);
		randomMuseum2 = new RandomMuseum(1000);
		double differenza = randomMuseum1.getAverageRate() - randomMuseum2.getAverageRate();
		if(differenza < 0) { 
			differenza  = differenza *(-1);
		}
		Assert.assertTrue(differenza<1.5);
	}

}
