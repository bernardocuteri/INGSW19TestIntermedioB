package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MuseumsTest {
	
	@Test
	public void testAverageLouvreBetterBritish()
	{
		LouvreMuseum louve = new LouvreMuseum();
		BritishMuseum british = new BritishMuseum();
		
		assertEquals(true, louve.getAverageRate() > british.getAverageRate());
	}
	
	@Test
	public void testAverageLouvreBetterRandom100()
	{
		LouvreMuseum louve = new LouvreMuseum();
		RandomMuseum random = new RandomMuseum(100);
		
		assertEquals(true, louve.getAverageRate() > random.getAverageRate());
	}
	
	@Test
	public void testDifferenceAbsRandomMuseum()
	{

		RandomMuseum random1 = new RandomMuseum(1000);
		RandomMuseum random2 = new RandomMuseum(1000);
		
		double result = random1.getAverageRate() - random2.getAverageRate();
		if(result < 0)
			result *= -1;
		
		result = result - 1.5;
		assertEquals(true, result < 0);
	}
	

}
