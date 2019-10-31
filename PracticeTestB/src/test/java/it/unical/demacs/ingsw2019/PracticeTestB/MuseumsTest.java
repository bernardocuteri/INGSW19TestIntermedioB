package it.unical.demacs.ingsw2019.PracticeTestB;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

public class MuseumsTest {


	private static BritishMuseum bm;
	private static LouvreMuseum lm;
	private static RandomMuseum rm;
	private static RandomMuseum rm1;
	private static RandomMuseum rm2;
	
	@BeforeClass
	public static void init() {
		bm = new BritishMuseum();
		lm = new LouvreMuseum();
		rm = new RandomMuseum(100);
		rm1 = new RandomMuseum(1000);
		rm2 = new RandomMuseum(1000);
	}
	
	@Test
	public void test1 () {
		assertEquals(false, bm.getAverageRate()>lm.getAverageRate());
	}
	
	@Test
	public void test2() {
		assertEquals(false, rm.getAverageRate()>lm.getAverageRate());
	}
	
	 @Test 
	 public void test3() {
		 assertEquals(true, rm1.getAverageRate()-rm2.getAverageRate() > -1.5 && rm1.getAverageRate()-rm2.getAverageRate() < 1.5);
	 }
		
}
