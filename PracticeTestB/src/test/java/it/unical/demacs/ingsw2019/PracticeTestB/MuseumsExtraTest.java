package it.unical.demacs.ingsw2019.PracticeTestB;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class MuseumsExtraTest 
{
	public static Museum m;
	public static RandomMuseum rm;
	@BeforeClass
	public static void init()
	{
		String name = "lab31b Museum";
		List<ArtWork> aw = null;
		m = new Museum(name, aw);
	}
	@Test(expected = RuntimeException.class)
	public void avgException()
	{
		double avg = m.getAverageRate();
		/*
		 * ...
		 */
	}
	@Test(timeout = 2000)
	public void rmInst()
	{
		rm = new RandomMuseum(1000);
	}
}
