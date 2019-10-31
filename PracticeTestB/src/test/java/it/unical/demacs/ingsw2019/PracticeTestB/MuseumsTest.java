package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MuseumsTest {

	// un metodo che verifichi che il punteggio medio
	// di una istanza di LouvreMuseum sia superiore al
	// punteggio medio di una istanza di BritishMuseum

	@Test
	public void averageMuseumsWorks() {
		Museum british_instance = new BritishMuseum();
		Museum louvre_instance = new LouvreMuseum();
		assertEquals(true, louvre_instance.getAverageRate() > british_instance.getAverageRate());
	}

	// un metodo che verifichi che il punteggio medio di una istanza di
	// LouvreMuseum sia superiore al punteggio medio di una istanza
	// di RandomMuseum con 100 opere casuali

	@Test
	public void averageLouvreVsRandomMuseumWorks() {
		Museum louvre_instance = new LouvreMuseum();
		Museum random_instance = new RandomMuseum(100);
		assertEquals(true, louvre_instance.getAverageRate() > random_instance.getAverageRate());

	}

	// un metodo che verifichi che la differenza in valore assoluto tra i
	// punteggi medi di due istanze di RandomMuseum contenenti
	// 1000 opere sia inferiore a 1.5

	@Test
	public void absoluteDifferenceWorks() {
		Museum random_first = new RandomMuseum(1000);
		Museum random_second = new RandomMuseum(1000);

		double difference = random_first.getAverageRate() - random_second.getAverageRate();
		difference = Math.abs(difference);
		assertEquals(true, difference < 1.5);
	}

}
