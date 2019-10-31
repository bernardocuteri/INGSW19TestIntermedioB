package it.unical.demacs.ingsw2019.PracticeTestB;


import org.junit.Test;


public class MuseumAdvancedTest {

	@Test (expected = RuntimeException.class)
	public void eccezioneSenzaOpere()
	{
		RandomMuseum museo= new RandomMuseum(0);
		museo.getAverageRate();
	}
	
	@Test (timeout=2000)
	public void instanziareRandomCon1000In2Secondi()
	{
		RandomMuseum museo= new RandomMuseum(1000);
	}
}
