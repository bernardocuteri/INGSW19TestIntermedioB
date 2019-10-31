package it.unical.demacs.ingsw2019.PracticeTestB;

import org.junit.Test;

public class MuseumAdvancedTest {
	@Test(expected=RuntimeException.class)
	public void museoSenzaOpere() {
		RandomMuseum r=new RandomMuseum(0);
		double n=r.getAverageRate();
	}
	@Test(timeout=2000)
	public void testConTimeout() {
		RandomMuseum r=new RandomMuseum(1000);
	}

}
