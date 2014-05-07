package ch.psturz.anotation;

public interface IMode
{    
    public void setModeNbr(int modeNbr);
    public int getModeNbr();
    public void setResolutionStepsMM(double resolution);
    public double getResolutionStepsMM();
    public void setHomeOffset(double homeOffset);
    public double getHomeOffset();
    public void setHomeOffsetMC(double homeOffsetMC);
    public double getHomeOffsetMC();
    public void  setResolutionRevolution(double resolution);
    public double  getResolutionRevolution();   
    public Object getData();
}