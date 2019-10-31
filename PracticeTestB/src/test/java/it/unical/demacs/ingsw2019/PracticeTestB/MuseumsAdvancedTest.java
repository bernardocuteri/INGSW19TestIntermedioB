package it.unical.demacs.ingsw2019.PracticeTestB;

import java.util.List;

import org.junit.Test;

public class MuseumsAdvancedTest {

	public MuseumsAdvancedTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test(expected = RuntimeException.class)
	public void runtimeThrowsException() {
		String name="prado";
		
		List<ArtWork> l=null;
		
		Museum museum = new Museum(name, l);
		
		museum.getAverageRate();
	}
	
	@Test(timeout = 2000)
	public void timeoutThrowsException() {
		
		Museum museum = new RandomMuseum(1000);
		
	}
}
