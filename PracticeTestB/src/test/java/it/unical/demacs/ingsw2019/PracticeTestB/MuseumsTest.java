package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.math.*;
import org.junit.Before;
import org.junit.Test;

public class MuseumsTest {

	@Before
	public void prepareAllWorks(){
		System.out.println("Init Museum class");
	}
	
	@Test
	public void moreLouvreThanBritishWorks(){
		System.out.println("moreLouvreThanBritishTest");
		
		Museum louvreMuseum = new LouvreMuseum();
		Museum britishMuseum = new BritishMuseum();
		boolean moreLouvreThanBritish = false;
		
		if(louvreMuseum.getAverageRate()>britishMuseum.getAverageRate())
			moreLouvreThanBritish = true;
		
		assertEquals(moreLouvreThanBritish,true);
	}
	
	@Test
	public void moreLouvreThanRandomWorks(){
		System.out.println("moreLouvreThanRandomTest");
		
		Museum randomMuseum = new RandomMuseum(100);
		Museum louvreMuseum = new LouvreMuseum();
		boolean moreLouvreThanBritish = false;
		
		if(louvreMuseum.getAverageRate()>randomMuseum.getAverageRate())
			moreLouvreThanBritish = true;
		
		assertEquals(moreLouvreThanBritish,true);
	}
	
	@Test
	public void compareRandomMuseumRateWorks(){
		System.out.println("compareRandomMuseumRateTest");
		
		Museum randomMuseum1 = new RandomMuseum(1000);
		Museum randomMuseum2 = new RandomMuseum(1000);
		
		boolean differenceCondition = false;
		
		double difference = Math.abs(randomMuseum1.getAverageRate()-randomMuseum2.getAverageRate());
		
		if(difference<1.5)
			differenceCondition = true;
		
		assertEquals(differenceCondition,true);
	}
}
