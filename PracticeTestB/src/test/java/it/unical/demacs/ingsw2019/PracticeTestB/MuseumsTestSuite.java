package it.unical.demacs.ingsw2019.PracticeTestB;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({MuseumsTest.class, MuseumsAdvancedTest.class})
public class MuseumsTestSuite {
	
	@BeforeClass
	public void before()
	{
		System.out.println("Test suite inizio.");
	}
	
	@AfterClass
	public void after()
	{
		System.out.println("Test suite finito.");
	}

}
