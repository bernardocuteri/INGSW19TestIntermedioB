package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class MuseumsAdvancedTest {
	
	private RandomMuseum randomMuseum;
	
	@Test(expected = RuntimeException.class)
	public void trisThrowsExceptionPlay() {
		randomMuseum = new RandomMuseum(0);
		randomMuseum.getAverageRate();
	}
	
	@Test(timeout = 2000)
	public void timingLose() {
		randomMuseum = new RandomMuseum(1000);
	}
}
