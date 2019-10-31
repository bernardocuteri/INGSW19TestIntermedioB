package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MuseumsAdvancedTest {

	/*un metodo che verifica che getAverageRate() 
	 * sollevi un’eccezione su un museo senza opere
	 */
	private Museum m = new Museum("prova", null);
	
	
	@Test(expected = RuntimeException.class)
	public void testNoOpere() {
		m.getAverageRate();
	}
	
	/*
	 * un metodo che verifica che è possibile istanziare 
	 * un RandomMuseum con n pari a 1000 entro 2 secondi 
	 */

	@Test(timeout=2000)
	public void testVeloce() {
		new RandomMuseum(1000);
	}
}
