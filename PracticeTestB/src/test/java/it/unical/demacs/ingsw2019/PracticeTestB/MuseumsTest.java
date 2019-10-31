package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MuseumsTest {

	private   BritishMuseum bMuseo;
	private   LouvreMuseum lMuseo;
	private   RandomMuseum rMuseo1;
	private   RandomMuseum rMuseo2;
	@Test
	public void testLouvreMaggioreDiBritish() {
		bMuseo=new BritishMuseum();
		lMuseo=new LouvreMuseum();
		assertEquals(true,lMuseo.getAverageRate()>bMuseo.getAverageRate());
	}
	@Test
	public void testLouvreMaggioreDiRandom100() {
		rMuseo1=new RandomMuseum(100);
		lMuseo=new LouvreMuseum();
		assertEquals(true, lMuseo.getAverageRate()>rMuseo1.getAverageRate());
	}
	@Test
	public void testFraDueRandom() {
		rMuseo1=new RandomMuseum(1000);
		rMuseo2=new RandomMuseum(1000);
		if(rMuseo1.getAverageRate()>rMuseo2.getAverageRate())
			assertEquals(1.5, rMuseo1.getAverageRate()-rMuseo2.getAverageRate(), 10);
		assertEquals(1.5, rMuseo2.getAverageRate()-rMuseo1.getAverageRate(), 10);
	}
}
