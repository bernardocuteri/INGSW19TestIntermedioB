package it.unical.demacs.ingsw2019.PracticeTestB;



import org.junit.Test;

public class MuseumsAdvancedTest {
	
	private static RandomMuseum rm = new RandomMuseum(0);
	
	
	@Test(expected = RuntimeException.class)
	public  void eccezzione1() {
		rm.getAverageRate();
	}
	
	
	@Test(timeout = 2)
	public void possibileIstanzazione() {
		RandomMuseum rm = new RandomMuseum(1000);
	}
	
	
}
