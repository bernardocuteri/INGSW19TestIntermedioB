package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MuseumsTest {


	@Test
	public void LouvreMediumHigherBritishMedium() {
		LouvreMuseum louvre = new LouvreMuseum(); 
		BritishMuseum british = new BritishMuseum(); 
		
		//System.out.println(louvre.getAverageRate() + " " + british.getAverageRate());
		assertTrue(louvre.getAverageRate()>british.getAverageRate()); 
	}
	@Test
	public void LouvreMediumHigherRandomMedium() {
		LouvreMuseum louvre = new LouvreMuseum(); 
		RandomMuseum random = new RandomMuseum(100); 
		
		//System.out.println(louvre.getAverageRate() + " " + random.getAverageRate());
		assertTrue(louvre.getAverageRate()>random.getAverageRate());
	}
	@Test
	public void differenceWorks() {
		RandomMuseum random = new RandomMuseum(1000); 
		RandomMuseum random_Second = new RandomMuseum(1000); 
		System.out.println(Math.abs(random.getAverageRate()-random_Second.getAverageRate()));
		assertTrue(Math.abs(random.getAverageRate()-random_Second.getAverageRate())<1.5); 
	}
}
