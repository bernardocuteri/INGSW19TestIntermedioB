package it.unical.demacs.ingsw2019.PracticeTestB;

import org.junit.Test;

public class MuseumsExtraTest 
{
	private RandomMuseum random;
	
	@Test (expected = RuntimeException.class)
	public void getAverageRateWorks() {
		random = new RandomMuseum(0);
		random.getAverageRate();
	}
	
	@Test (timeout = 2000)
	public void time() {
		random = new RandomMuseum(1000);
	}
}
