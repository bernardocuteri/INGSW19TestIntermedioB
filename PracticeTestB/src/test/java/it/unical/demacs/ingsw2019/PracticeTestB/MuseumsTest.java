package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MuseumsTest {

	@Test
	public void punteggioMedioIstanza()
	{
		Museum louvre=new LouvreMuseum();
		Museum british=new BritishMuseum();
		
		assertTrue(louvre.getAverageRate()>british.getAverageRate());
	}
	
	@Test
	public void punteggioMedioMaggioreRandom()
	{
		Museum louvre=new LouvreMuseum();
		Museum random=new RandomMuseum(100);
		
		assertTrue(louvre.getAverageRate()>random.getAverageRate());
	}
	
	@Test
	public void differenzaValoreAssoluto()
	{
		Museum random1=new RandomMuseum(1000);
		Museum random2=new RandomMuseum(1000);
		
		double diff=random1.getAverageRate()-random2.getAverageRate();
		diff=diff*(-1);
		
		assertTrue(diff<1.5);
	}
	
	
}
