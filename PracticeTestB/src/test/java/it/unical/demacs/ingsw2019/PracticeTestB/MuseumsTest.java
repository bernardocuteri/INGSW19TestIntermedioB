package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class MuseumsTest {

	private static BritishMuseum bM;
	private static LouvreMuseum  lM;
	private static RandomMuseum rM;
	
	@BeforeClass
	public static void initialize() {
		System.out.println("Inizializzazione musei.");
		bM = new BritishMuseum();
		lM = new LouvreMuseum();
		rM = new RandomMuseum(100);
	}

	@Test
	public void avarageRateLouvreBritishWorks() {
		System.out.println("test avarageRateLouvreBritish.");
		Boolean check = false;
		if(lM.getAverageRate() > bM.getAverageRate())
			check = true;
		assertTrue(check);
	}
	
	@Test
	public void avarageRateLouvreRandomWorks() {
		System.out.println("test avarageRateLouvreRandom.");
		Boolean check = false;
		if(lM.getAverageRate() > rM.getAverageRate())
			check = true;
		assertTrue(check);
	}
	
	@Test
	public void avarageRateRandomWorks() {
		System.out.println("test avarageRateRandom.");
		rM = new RandomMuseum(1000);
		RandomMuseum rM2 = new RandomMuseum(1000);
		Boolean check = false;
		if(rM.getAverageRate() - rM2.getAverageRate() < 1.5 && rM.getAverageRate() > rM2.getAverageRate())
			check = true;
		else if(rM2.getAverageRate() - rM.getAverageRate() < 1.5 && rM.getAverageRate() < rM2.getAverageRate())
			check = true;
		assertTrue(check);
	}
}
