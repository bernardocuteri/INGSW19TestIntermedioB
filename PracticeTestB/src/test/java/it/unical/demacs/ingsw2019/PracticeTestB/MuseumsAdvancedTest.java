package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.*;

import org.junit.Test;



public class MuseumsAdvancedTest {
	
	private static LouvreMuseum l;
	private static RandomMuseum r;

	/*
	 * un metodo che verifica che getAverageRate() sollevi un’eccezione su un museo senza opere

	 */
	
	@Test(expected = RuntimeException.class)
	public void ExceptionMuseoVuotoTest() {
		l.getAverageRate();
	}
	/*
	 * un metodo che verifica che è possibile istanziare
	 *  un RandomMuseum con n pari a 1000 entro 2 secondi 
	 */
	@Test(timeout=2000)
	public void IstanziaRandomTest() {
		r=new RandomMuseum(1000);
	}
}
