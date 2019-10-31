package it.unical.demacs.ingsw2019.PracticeTestB;

import org.junit.Test;

public class MuseumExtraTest {

	@Test(expected = RuntimeException.class)
	public void averageExceptionWork()
	{
		RandomMuseum random = new RandomMuseum(0);
		
		random.getAverageRate();
	}
	
	@Test(timeout = 2000)
	public void averegeTimeWork()
	{
		RandomMuseum random = new RandomMuseum(1000);
	}
}
