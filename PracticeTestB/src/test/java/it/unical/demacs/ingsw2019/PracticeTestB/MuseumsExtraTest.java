package it.unical.demacs.ingsw2019.PracticeTestB;


import org.junit.Test;

public class MuseumsAdvancedTest {

	private static RandomMuseum Rm;
	
	@Test(expected = RuntimeException.class)
	public void EmptyMuseum() {
		Rm = new RandomMuseum(0);
		Rm.getAverageRate();
	}
	
	@Test(timeout =2000)
	public void QuickInit() {
		Rm = new RandomMuseum(1000);
	}
}
