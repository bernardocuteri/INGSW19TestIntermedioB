package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
public class MuseumsAdvancedTest {
	
	/*
	 * un metodo che verifica che getAverageRate() sollevi un’eccezione su un museo senza opere
	 */
	
	private List<ArtWork> lista = new ArrayList<ArtWork>();
	Museum m = new Museum("M1",lista);
	
	@Test(expected = RuntimeException.class)
	public void test1() {
		m.getAverageRate();
	}
	
	@Test(timeout=2000)
	public void test2() throws InterruptedException {
		RandomMuseum rm = new RandomMuseum(1000);
	}

}
