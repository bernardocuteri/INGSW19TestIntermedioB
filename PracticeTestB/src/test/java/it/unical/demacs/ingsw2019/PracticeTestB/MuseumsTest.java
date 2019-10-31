package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MuseumsTest {
	
	
	@Test
	public void averageWorks()
	{
		Museum Louvre = new LouvreMuseum();
		Museum British = new BritishMuseum();	
		
		assertEquals(true, Louvre.getAverageRate() > British.getAverageRate());

	}
	
	@Test
	public void averageWithRandomMuseumWorks()
	{
		Museum Louvre = new LouvreMuseum();
		Museum Random = new RandomMuseum(100);
		
		assertEquals(true, Louvre.getAverageRate() > Random.getAverageRate());

	}
	
	@Test
	public void differenceRandomWorks()
	{
		Museum RandomA = new RandomMuseum(1000);
		Museum RandomB = new RandomMuseum(1000);
		
		assertEquals(true, (RandomA.getAverageRate() - RandomB.getAverageRate()) < 1.5);

	}


}
