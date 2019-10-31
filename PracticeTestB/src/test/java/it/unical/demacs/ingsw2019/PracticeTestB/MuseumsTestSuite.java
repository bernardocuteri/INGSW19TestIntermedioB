package it.unical.demacs.ingsw2019.PracticeTestB;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class MuseumsTestSuite {
	
	@RunWith(value=Suite.class)
	@SuiteClasses(value={MuseumsTestSuite.class, MuseumsAdvancedTest.class})
	public class allTest {

	}
}
