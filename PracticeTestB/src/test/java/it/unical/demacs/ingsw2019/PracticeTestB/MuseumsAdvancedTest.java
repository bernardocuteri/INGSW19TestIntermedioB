package it.unical.demacs.ingsw2019.PracticeTestB;

import org.junit.Test;

public class MuseumsAdvancedTest {
	
	@Test(expected = RuntimeException.class)
	public void testExceptionEmptyArtWork()
	{
		RandomMuseum random = new RandomMuseum(0);
		random.getAverageRate();
	}
	
	@Test(timeout = 2000)
	public void testTimeoutRandomMuseum()
	{
		RandomMuseum random = new RandomMuseum(1000);
	}

}
