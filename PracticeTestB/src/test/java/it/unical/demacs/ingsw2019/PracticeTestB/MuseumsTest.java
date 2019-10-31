package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertTrue;
import java.lang.Math;

import org.junit.Test;

public class MuseumsTest 
{
	private LouvreMuseum louvre = new LouvreMuseum();
	private BritishMuseum british = new BritishMuseum();
	private RandomMuseum random;
	
	@Test
	public void higherLouvreThanBritish() {
		double louvreRate = louvre.getAverageRate();
		double britishRate = british.getAverageRate();
		assertTrue(louvreRate > britishRate);
	}
	
	@Test
	public void higherLouvreThanRandom() {
		double louvreRate = louvre.getAverageRate();
		random = new RandomMuseum(100);
		double randomRate = random.getAverageRate();
		assertTrue(louvreRate > randomRate);
	}
	
	public void absoluteRateDifference() {
		random = new RandomMuseum(1000);
		RandomMuseum rand = new RandomMuseum(1000);
		double randomRate = random.getAverageRate();
		double randRate = rand.getAverageRate();
		assertTrue(Math.abs(randomRate - randRate) < 1.5);
	}
}
