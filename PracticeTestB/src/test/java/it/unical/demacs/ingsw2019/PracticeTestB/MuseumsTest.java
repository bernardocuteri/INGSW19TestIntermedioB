package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MuseumsTest {
	
	@Test
	public void louvreAverageRateGreaterThanBritishTest() {
		LouvreMuseum louvre = new LouvreMuseum();
		BritishMuseum british = new BritishMuseum();
		assertTrue(louvre.getAverageRate() > british.getAverageRate());
	}
	
	@Test
	public void louvreAverageRateGreaterThanRandomTest() {
		LouvreMuseum louvre = new LouvreMuseum();
		RandomMuseum random = new RandomMuseum(100);
		assertTrue(louvre.getAverageRate() > random.getAverageRate());
	}
	
	@Test
	public void randomAverageRateDifferenceLessThanTest() {
		RandomMuseum random1 = new RandomMuseum(100);
		RandomMuseum random2 = new RandomMuseum(100);
		double difference = Math.abs(random1.getAverageRate() - random2.getAverageRate());
		assertTrue(difference < 1.5);
	}

}
