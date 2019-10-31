package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

public class MuseumsTest {
	@Test
	public void testUno(){	
		LouvreMuseum l= new LouvreMuseum();	
		BritishMuseum b= new BritishMuseum();
		boolean k = false;
		if(l.getAverageRate()>b.getAverageRate())k=true;
		assertEquals(k,true);
	}
	@Test
	public void testDue(){	
		
		LouvreMuseum l= new LouvreMuseum();	
		RandomMuseum b= new RandomMuseum(100);
		assertEquals(l.getAverageRate()>b.getAverageRate(),true);
	}
	@Test
	public void testTre(){	
		RandomMuseum l= new RandomMuseum(1000);	
		RandomMuseum b= new RandomMuseum(1000);
		int s= (int) (l.getAverageRate()-b.getAverageRate());
		boolean k = false;
		if(s<1.5) k =true;
		assertEquals(k,true);
	}

}
