package ch.psturz.anotation;

public class DownloadPar {
	 private final int value;
	    private String description;
	    
	    public DownloadPar(Point<Double, Integer> point) 
	    {
	        value = point.getY();
	        description = point.toString();
	    }
	    
	    public DownloadPar(int value) 
	    {
	        this.value = value;
	        description = "" + value;
	    }

	    public int getValue()
	    {
	        return value;
	    }

	    @Override
	    public String toString()
	    {
	        return description;
	    }

}
