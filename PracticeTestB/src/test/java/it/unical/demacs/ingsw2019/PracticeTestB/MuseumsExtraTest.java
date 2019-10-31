package it.unical.demacs.ingsw2019.PracticeTestB;

import org.junit.Test;

public class MuseumsExtraTest {
	
	
	@Test(expected = RuntimeException.class)
	public void invalidMuseumAverage() {
			Museum museum = new Museum("Ciccio", null);
			museum.getAverageRate();
			
	}
	
	@Test(timeout = 2000)
	public void randomMuseumInstance() {
		RandomMuseum randomMuseum = new RandomMuseum(1000);
	}

}
