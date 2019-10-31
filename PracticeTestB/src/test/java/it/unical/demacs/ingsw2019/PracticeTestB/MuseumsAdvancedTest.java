package it.unical.demacs.ingsw2019.PracticeTestB;

import java.util.ArrayList;
import java.lang.RuntimeException;

import org.junit.Test;

public class MuseumsAdvancedTest {

	@Test(expected = RuntimeException.class)
	public void checkExceptionEmptyMuseumTest() {
		Museum museum = new Museum("prova", new ArrayList<ArtWork>());
		museum.getAverageRate();
	}
	
	@Test(timeout = 2000)
	public void checkRandomMuseumInLessThanTwoSecondsPossibleTest() {
		RandomMuseum random1 = new RandomMuseum(1000);
	}

}
