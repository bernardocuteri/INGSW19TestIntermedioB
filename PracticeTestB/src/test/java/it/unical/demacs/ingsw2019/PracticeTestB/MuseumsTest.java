package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MuseumsTest {
	
	
	private static LouvreMuseum louvre;
	private static BritishMuseum british;
	private static int result = 0;
	
	private static RandomMuseum random;


	@BeforeClass
	public static void prepareAll(){
		System.out.println("Init LouvreMuseum class");
		louvre = new LouvreMuseum();
		british = new BritishMuseum();
		
		random = new RandomMuseum(100);

	}

	@Test
	public void LouvreMuseumAverageScoreRespectToBritishMusem(){
		System.out.println("LouvreMuseum Average Score respect BritishMuseum");
		double louvreScore = louvre.getAverageRate();
		double britishScore = british.getAverageRate();
				
		if (louvreScore > britishScore)
			result = 1;
		else if (louvreScore < britishScore)
			result = 2;
		else
			result = 3;
		
		assertEquals(1, result);
		
	}
	
	@Test
	public void LouvreMuseumAverageScoreRespectToRandomMuseum(){
		System.out.println("LouvreMuseum Average Score respect RandomMuseum");
		double louvreScore = louvre.getAverageRate();
		double randomScore = random.getAverageRate();
				
		if (louvreScore > randomScore)
			result = 1;
		else if (louvreScore < randomScore)
			result = 2;
		else
			result = 3;
		
		assertEquals(1, result);	

	}

	@AfterClass
	public static void print() {
		if (result == 1) {
			System.out.print("Louvreß");
		}
	}

}
