package it.unical.demacs.ingsw2019.PracticeTestB;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class MuseumsTest {
	
	private static BritishMuseum bm;
	private static LouvreMuseum lm;
	private static RandomMuseum rm;
	
	@BeforeClass
	public static void init()
	{
		System.out.println("init");
		bm = new BritishMuseum();
		lm = new LouvreMuseum();
		rm = new RandomMuseum(100);
	}
	
	@Test
	public void test1()
	{
		System.out.println("primo");
		double medio_lm = lm.getAverageRate();
		double medio_bm = bm.getAverageRate();
		
		Assert.assertTrue(lm.getAverageRate() > bm.getAverageRate());
	}
	
	@Test
	public void test2()
	{
		System.out.println("due");
		double medio_lm = lm.getAverageRate();
		double medio_rm = rm.getAverageRate();
		
		Assert.assertTrue(lm.getAverageRate() > rm.getAverageRate());
		
	}
	
	@Test
	public void test3()
	{
		RandomMuseum rm1 = new RandomMuseum(1000);
		RandomMuseum rm2 = new RandomMuseum(1000);
		
		double valoreAssoluto = Math.abs(rm1.getAverageRate()-rm2.getAverageRate());
	
		Assert.assertTrue(valoreAssoluto < 1.5);
	}

}
