package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class MuseumsExtraTest  {
	@Test  (expected = RuntimeException.class)
	public void museoSenzaOpere() {
		Museum m=new Museum("Philadelphia", null);
		m.getAverageRate();
	}
	@Test (timeout=2000)
	public void tempo2Secondi() {
		RandomMuseum m1=new RandomMuseum(1000);
	}
}
