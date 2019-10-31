package it.unical.demacs.ingsw2019.PracticeTestB;

import org.junit.Test;

public class MuseumsExtraTest {
	
	@Test(expected = RuntimeException.class)
	public void empty() {
		RandomMuseum r = new RandomMuseum(0);
		r.getAverageRate();
	}
	
	@Test(timeout = 2000)
	public void instance() {
		RandomMuseum r = new RandomMuseum(1000);
	}

}
