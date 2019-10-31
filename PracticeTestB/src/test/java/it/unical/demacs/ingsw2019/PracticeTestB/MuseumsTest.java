package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;



public class MuseumsTest {
	
	
	private static BritishMuseum b=new BritishMuseum();
	private static LouvreMuseum l=new LouvreMuseum();
	private static RandomMuseum r=new RandomMuseum(100);
	
	private static RandomMuseum r1=new RandomMuseum(1000);
	private static RandomMuseum r2=new RandomMuseum(1000);
	
	/*un metodo che verifichi che il punteggio medio di
	 *  una istanza di LouvreMuseum sia superiore al punteggio medio di 
	 *  una istanza di BritishMuseum
	 */
	@Test
	public void LouvreMaggioreBritishTest() {
		
		Assert.assertTrue(l.getAverageRate()> b.getAverageRate());
	}
	
	/*un metodo che verifichi che il punteggio medio
	 *  di una istanza di LouvreMuseum sia superiore
	 *   al punteggio medio di una istanza di RandomMuseum con 100 opere casuali 
	 */
	@Test
	public void LouvreMaggioreRandom100Test() {
		
		Assert.assertTrue(l.getAverageRate()> r.getAverageRate());
	}
	
	/*
	 * un metodo che verifichi che la differenza
	 *  in valore assoluto tra i punteggi medi di due
	 *   istanze di RandomMuseum contenenti 1000 opere sia inferiore a 1.5
	 * 
	 */
	@Test
	public void diffValoreAssolutoRandomTest() {
		double x=r1.getAverageRate();
		double y=r2.getAverageRate();
		double diff=Math.abs(x-y);
		Assert.assertTrue(diff <1.5);
	}
}
