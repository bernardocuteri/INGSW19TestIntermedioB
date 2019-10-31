package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MuseumsTest {
	
	private static BritishMuseum Bm;
	private static LouvreMuseum Lm;
	private static RandomMuseum Rm;
	private static RandomMuseum Rm2;
	
	@BeforeClass
	public static void prepareClassWorks() {
		System.out.println("Init of class");
		Bm = new BritishMuseum();
		Lm = new LouvreMuseum();
	}
	
	@Test
	public void LouvreBetterThanBritish() {
		System.out.println("Checking that: Avarage Louvre > Avarage British");
		double L= Lm.getAverageRate();
		double B= Bm.getAverageRate();
		double expectedValue;
		if(L>B) 
			expectedValue=L;
		else
			expectedValue=B;
		assertEquals(expectedValue, Lm.getAverageRate(),0);
	}
	
	@Test
	public void LouvreBetterThanRandom() {
		System.out.println("Checking that: Avarage Louvre > Avarage Random");
		Rm = new RandomMuseum(100);
		double L= Lm.getAverageRate();
		double R= Rm.getAverageRate();
		double expectedValue;
		if(L>R) 
			expectedValue=L;
		else
			expectedValue=R;
		assertEquals(expectedValue, Lm.getAverageRate(),0);
		
	}
	
	@Test
	public void AbsoulteDifference() {
		System.out.println("Checking that: |Avare Louvre - Avarage Random| <1.5");
		Rm = new RandomMuseum(1000);
		Rm2= new RandomMuseum(1000);
		double R = Rm.getAverageRate();
		double R2 = Rm2.getAverageRate();
		double difference;
		if(R2>R)
			difference = R2-R;
		else
			difference = R-R2;
		System.out.println(difference);
		boolean check;
		if(difference <1.5)
			check=true;
		else
			check=false;
		assertEquals(true, check);
	}
	
}
