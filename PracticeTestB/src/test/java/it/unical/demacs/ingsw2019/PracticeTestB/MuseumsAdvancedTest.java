package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MuseumsAdvancedTest {

	
	@Test (expected = RuntimeException.class)
	public void emptyException()
	{
		Museum Random = new RandomMuseum(0);
		Random.getAverageRate();

	}
	
	@Test (timeout = 2000)
	public void instanceTimeoutException()
	{
		Museum Random = new RandomMuseum(1000);

	}
	
}
