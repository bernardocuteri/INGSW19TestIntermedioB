package it.unical.demacs.ingsw2019.PracticeTestB;


import java.util.Arrays;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class MuseumsAdvancedTest {
	
	@Rule
	public ExpectedException exceptionRule=ExpectedException.none();
	
	
	@Test
	public void museoSenzaOpere()
	{
		exceptionRule.expect(RuntimeException.class);
		
		Museum museum=new Museum("testMuseum", Arrays.asList());
		
		museum.getAverageRate();
	}
	
	@Test(timeout = 2000)
	public void istanzaEntroDueSecondi()
	{
		Museum museum=new RandomMuseum(1000);
	}
}
