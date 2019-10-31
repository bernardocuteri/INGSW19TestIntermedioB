package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MuseumsTest 
{
	@Test
	public void punteggioLouvreMaggioreDiBritish()
	{
		LouvreMuseum louvremuseum= new LouvreMuseum();
		BritishMuseum britishmuseum= new BritishMuseum();
		assertEquals(true, louvremuseum.getAverageRate()>britishmuseum.getAverageRate());
	}
	
	@Test
	public void punteggioLouvreMaggioreDiRandomCon100Opere()
	{
		LouvreMuseum louvremuseum= new LouvreMuseum();
		RandomMuseum randommuseum= new RandomMuseum(100);
		assertEquals(true, louvremuseum.getAverageRate()>randommuseum.getAverageRate());
	}
	
	@Test
	public void differenzaTraDueRandomInferioreA1eMezzo()
	{
		RandomMuseum primoRandom= new RandomMuseum(1000);
		RandomMuseum secondoRandom= new RandomMuseum(1000);
		double differenza= primoRandom.getAverageRate()-secondoRandom.getAverageRate();
		if (differenza<0)
			differenza*=-1.0;
		assertEquals(true, differenza<1.5);
	}
}
