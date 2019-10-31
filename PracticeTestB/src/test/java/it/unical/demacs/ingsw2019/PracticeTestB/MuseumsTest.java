package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MuseumsTest
{
	public static LouvreMuseum lm;
	public static BritishMuseum bm;
	public static RandomMuseum rm;
	public static RandomMuseum rmMille_first;
	public static RandomMuseum rmMille_second;
	@BeforeClass
	public static void init()
	{
		lm = new LouvreMuseum();
		bm = new BritishMuseum();
		rm = new RandomMuseum(100);
		rmMille_first = new RandomMuseum(1000);
		rmMille_second = new RandomMuseum(1000);
	}
	@Test
	public void louvreMaggBritishTest()
	{
		assertEquals(true, this.louvreMaggiore(lm.getAverageRate(), bm.getAverageRate()));
	}
	@Test
	public void louvreMaggRandomTest()
	{
		assertEquals(true, this.louvreMaggiore(lm.getAverageRate(), rm.getAverageRate()));
	}
	@Test
	public void avgMinoreDiSogliaTest()
	{
		assertEquals(true, this.inferioreDi(rmMille_first.getAverageRate(), rmMille_second.getAverageRate(), 1.5));
	}
	public boolean louvreMaggiore(double a, double b)
	{
		return a > b;
	}
	public boolean inferioreDi(double a, double b, double soglia)
	{
		double res = Math.abs(a - b);
		return res < soglia;
	}
}
