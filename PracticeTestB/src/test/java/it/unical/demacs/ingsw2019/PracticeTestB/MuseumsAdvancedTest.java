package it.unical.demacs.ingsw2019.PracticeTestB;

import org.junit.Test;

public class MuseumsAdvancedTest {

	// un metodo che verifica che getAverageRate() sollevi
	// un’eccezione su un museo senza opere

	@Test(expected = RuntimeException.class)
	public void AverageRateExceptionTest() {
		Museum random_instance = new RandomMuseum(0);
		random_instance.getAverageRate();
	}

	// un metodo che verifica che è possibile istanziare un
	// RandomMuseum con n pari a 1000 entro 2 secondi

	// Timeout = 2s * 1000 = 2000ms

	@Test(timeout = 2000)
	public void InstanceTimeoutWorks() {
		@SuppressWarnings("unused")
		Museum random_instance = new RandomMuseum(1000);
	}

}
