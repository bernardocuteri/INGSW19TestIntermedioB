package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MuseumsTest {
	@Test
	public void punteggioMedio() {
		BritishMuseum b=new BritishMuseum();
		LouvreMuseum l=new LouvreMuseum();
		assertEquals(true,l.getAverageRate()>b.getAverageRate());
		
		
	}
	@Test
	public void punteggioMedioRandom() {
		LouvreMuseum l=new LouvreMuseum();
		RandomMuseum r=new RandomMuseum(100);
		assertEquals(true,l.getAverageRate()>r.getAverageRate());
	}
	@Test
	public void differenzaAssoluta() {
		RandomMuseum r=new RandomMuseum(1000);
		RandomMuseum ran=new RandomMuseum(1000);
		assertEquals(true,(r.getAverageRate()-ran.getAverageRate())<1.5);
		
	}
	
}
