package it.unical.demacs.ingsw2019.PracticeTestB;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class MuseumsAdvancedTest {
	
	private static Museum museo;
	private static RandomMuseum rm;
	private static List<ArtWork> lista;
	
	@BeforeClass
	public static void init()
	{
		lista = null;
		museo = new Museum("Museo",lista);
	}
	
	@Test(expected = RuntimeException.class)
	public void test1()
	{	
		museo.getAverageRate();
	}
	
	@Test (timeout = 2000)
	public void test2()
	{
		rm=new RandomMuseum(1000);
	}

}
