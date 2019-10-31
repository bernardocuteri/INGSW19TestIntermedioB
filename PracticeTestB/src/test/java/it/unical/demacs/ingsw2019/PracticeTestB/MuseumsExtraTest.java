package it.unical.demacs.ingsw2019.PracticeTestB;

import org.junit.Test;

public class MuseumsExtraTest {

	//un metodo che verifica che getAverageRate() 
	//sollevi un’eccezione su un museo senza opere
	@Test(expected = RuntimeException.class)
	public void emptyMuseumTest() {
		Museum empty = new Museum("emptyMuseum", null);
		empty.getAverageRate();
	}
	
	//un metodo che verifica che è possibile istanziare un 
	//RandomMuseum con n pari a 1000 entro 2 secondi
	 @Test(timeout = 2000)
	 public void timeTest() {
		 RandomMuseum random = new RandomMuseum(1000);
	 }
}
