package it.unical.demacs.ingsw2019.PracticeTestB;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// che aggrega le classi MuseumsTest e MuseumsAdvancedTest in una test suite

@RunWith(Suite.class)
@SuiteClasses({ MuseumsTest.class, MuseumsAdvancedTest.class })
public class MuseumsTestSuite {
}
