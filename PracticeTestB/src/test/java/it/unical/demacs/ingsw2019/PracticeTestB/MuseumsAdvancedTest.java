package it.unical.demacs.ingsw2019.PracticeTestB;

import org.junit.BeforeClass;
import org.junit.Test;

public class MuseumsAdvancedTest {
    public static RandomMuseum randomMuseum;
    @BeforeClass
    public static void setUp(){
        randomMuseum = new RandomMuseum(0);
    }

    @Test(expected = RuntimeException.class)
    public void zeroOnAverage(){
        randomMuseum.getAverageRate();
    }

    @Test(timeout = 2000)
    public void randomIn2seconds(){
        RandomMuseum rand = new RandomMuseum(1000);
    }
}
