package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class MuseumsTest {
	
	private static LouvreMuseum louvre;
	private static BritishMuseum british;
	
	@BeforeClass
	public static void initMuseums() {
		louvre = new LouvreMuseum();
		british = new BritishMuseum();
	}

	//un metodo che verifichi che il punteggio medio di una 
	//istanza di LouvreMuseum sia superiore al punteggio 
	//medio di una istanza di BritishMuseum
	@Test
	public void louvreBritishAverageRateTest() {
		assertTrue(louvre.getAverageRate()>british.getAverageRate());
	}
	
	/* un metodo che verifichi che il punteggio medio 
	 * di una istanza di LouvreMuseum sia superiore al 
	 * punteggio medio di una istanza di RandomMuseum con 100 opere casuali 
	 */
	@Test
	public void louvreRandomAverageRateTest() {
		RandomMuseum random = new RandomMuseum(100);
		assertTrue(louvre.getAverageRate()>random.getAverageRate());
	}
	
	/*un metodo che verifichi che la differenza in valore assoluto 
	 * tra i punteggi medi di due istanze di RandomMuseum contenenti 
	 * 1000 opere sia inferiore a 1.5
	 */
	@Test
	public void absoluteValueTest() {
		RandomMuseum r1 = new RandomMuseum(1000);
		RandomMuseum r2 = new RandomMuseum(1000);
		double diff = Math.abs((r1.getAverageRate()-r2.getAverageRate()));
		assertTrue(diff<1.5);
	}
}
