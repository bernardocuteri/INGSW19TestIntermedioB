package it.unical.demacs.ingsw2019.PracticeTestB;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class MuseumsTest {
    public static LouvreMuseum louvreMuseum;
    public static BritishMuseum britishMuseum;
    public static RandomMuseum randomMuseum100;
    public static RandomMuseum randomMuseum1000a;
    public static RandomMuseum randomMuseum1000b;

    @BeforeClass
    public static void setUp(){
        louvreMuseum = new LouvreMuseum();
        britishMuseum = new BritishMuseum();
        randomMuseum100 = new RandomMuseum(100);
        randomMuseum1000a = new RandomMuseum(1000);
        randomMuseum1000b = new RandomMuseum(1000);
    }
    @Test
    public void louvreBrithisAverage(){
        assertTrue(louvreMuseum.getAverageRate() > britishMuseum.getAverageRate());
    }
    @Test
    public void louvreRandomAverage(){
        assertTrue(louvreMuseum.getAverageRate() > randomMuseum100.getAverageRate());
    }
    @Test
    public void differenceBetweenRandoms(){
        assertTrue(Math.abs(randomMuseum1000a.getAverageRate() - randomMuseum1000b.getAverageRate())<1.5);
    }
}
