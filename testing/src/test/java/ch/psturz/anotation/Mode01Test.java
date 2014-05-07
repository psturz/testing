package ch.psturz.anotation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class Mode01Test {

	 @Test
	    public void testGetData()
	    {
	        IMode01 m = new Mode01();
	        m.setResolutionStepsMM(11.111);
	        m.setHomeOffset(-10.0);
	        m.setHomeOffsetMC(0.0);
	        m.setResolutionRevolution(0);
	        
	        
	        
	        List<DownloadPar> pars = (List<DownloadPar>) m.getData();
	        pars.stream().forEach((p) -> {System.out.println(p);
	                                      System.out.println("---");
	                                      System.out.println(p.getValue());});
	    }

}
