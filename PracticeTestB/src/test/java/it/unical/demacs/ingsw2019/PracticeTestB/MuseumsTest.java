package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class MuseumsTest {
	/*static BritishMuseum b;
	static LouvreMuseum l;
	static RandomMuseum r;
	
	@Before
	static public void inizialize() {
		b= new BritishMuseum();
		l= new LouvreMuseum();
		r= new RandomMuseum(5);
	}*/
	
	@Test
	public void medialb() {
		BritishMuseum r = new BritishMuseum();
		LouvreMuseum l= new LouvreMuseum();
		boolean ok=false;
		if(l.getAverageRate()>r.getAverageRate())
			ok=true;
		assertTrue(ok);
				
	}
	
	@Test
	public void medialr() {
		RandomMuseum r = new RandomMuseum(100);
		LouvreMuseum l = new LouvreMuseum();
		boolean ok=false;
		if(l.getAverageRate()>r.getAverageRate())
			ok=true;
		assertTrue(ok);
	}
	
	@Test
	public void assoluto() {
		RandomMuseum r1= new RandomMuseum(1000);
		RandomMuseum r2= new RandomMuseum(1000);
		boolean ok= false;
		double n, n2;
		if(r1.getAverageRate()>r2.getAverageRate()) {
			n=r1.getAverageRate();
			n2=r2.getAverageRate();
		}
		else {
			n=r2.getAverageRate();
			n2=r1.getAverageRate();
		}
		if(n-n2<1.5)
			ok=true;
		assertTrue(ok);
		
	}


}
