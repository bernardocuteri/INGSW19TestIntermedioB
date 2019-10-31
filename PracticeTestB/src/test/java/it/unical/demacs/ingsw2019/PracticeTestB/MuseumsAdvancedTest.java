package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class MuseumsAdvancedTest {
	
	
	@Test(expected = RuntimeException.class)
	public void noArtworkExceptionWorks() {
		Museum museum;
		List<ArtWork> empty = null;
		System.out.println("test noArtworkException.");
		museum = new Museum("empty", empty);
		museum.getAverageRate();
	}
	
	@Test(timeout = 2000)
	public void twoRandomMuseumWorks() {
		System.out.println("test twoRandomMuseum.");
		RandomMuseum rM = new RandomMuseum(1000);
	}

}
