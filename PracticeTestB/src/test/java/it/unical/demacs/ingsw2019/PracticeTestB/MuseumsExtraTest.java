package it.unical.demacs.ingsw2019.PracticeTestB;

import java.util.List;

import org.junit.Test;

public class MuseumsExtraTest  {

	@Test(expected = RuntimeException.class)
	public void excOne(){
		List<ArtWork> s = null ;
	Museum m = new Museum("",s);
	m.getAverageRate();
	}
	
	@Test(timeout = 1000 )
	public void excTwo(){
	RandomMuseum m = new RandomMuseum(1000);
	}
}
