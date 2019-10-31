package it.unical.demacs.ingsw2019.PracticeTestB;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class MuseumAdvancedTest {

	private static RandomMuseum rm1;
	private static RandomMuseum rm2;
	
	@BeforeClass
	public static void init() {
		rm1 = new RandomMuseum(0);
	}
	
	@Test(expected = RuntimeException.class)
	public void testException() {
		rm1.getAverageRate();
	}
	
	@Test(timeout=2)
	public void testTime(){
		rm2 = new RandomMuseum(1000);
	}
	
}
