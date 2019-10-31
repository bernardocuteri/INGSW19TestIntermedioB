package it.unical.demacs.ingsw2019.PracticeTestB;

import java.util.List;

import org.junit.Test;

public class MuseumsAdvancedTest {
	
	@Test(expected = RuntimeException.class)
	public void test1() {
		List<ArtWork> artworks=null;
		Museum b= new Museum("ciao",artworks);
		b.getAverageRate();
		
	}
	
	@Test(timeout = 2000)
	public void timelim() {
		RandomMuseum r= new RandomMuseum(1000);
	}
}
