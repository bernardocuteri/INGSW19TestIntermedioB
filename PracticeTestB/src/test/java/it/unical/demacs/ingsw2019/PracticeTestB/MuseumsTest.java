package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MuseumsTest {
	
	@Test
	public void averageLouvreBritishWork()
	{
		LouvreMuseum louvre = new LouvreMuseum();
		BritishMuseum british = new BritishMuseum();
		
		assertEquals(true, louvre.getAverageRate() >  british.getAverageRate() );
	}
	
	@Test
	public void averageLouvreRandomWork()
	{
		LouvreMuseum louvre = new LouvreMuseum();
		RandomMuseum random = new RandomMuseum(100);
		
		assertEquals(true, louvre.getAverageRate() >  random.getAverageRate() );
	}
	
	@Test
	public void differenceRandomWork()
	{
		RandomMuseum random = new RandomMuseum(1000);
		RandomMuseum random2 = new RandomMuseum(1000);
		
		double difference = Math.abs(random.getAverageRate() - random2.getAverageRate());
		
		assertEquals(true, difference < 1.5);
		
	}
}
