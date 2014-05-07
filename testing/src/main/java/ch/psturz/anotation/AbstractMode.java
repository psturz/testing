package ch.psturz.anotation;

import java.lang.reflect.Field;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractMode implements IMode
{

    private double resolutionStepsMM;

    private double homeOffsetMC;

    private double resolutionRevolution;

    private double homeOffset;

    @Send(order = 0, createData = AbstractMode.RawValue.class)
    private int modeNbr;
    
    @Override
    public void setModeNbr(int modeNbr)
    {
        this.modeNbr = modeNbr;
    }

    @Override
    public int getModeNbr()
    {
        return modeNbr;
    }

    @Override
    public void setResolutionStepsMM(double resolutionStepsMM)
    {
        this.resolutionStepsMM = resolutionStepsMM;
    }

    @Override
    public double getResolutionStepsMM()
    {
        return resolutionStepsMM;
    }

    @Override
    public void setHomeOffsetMC(double homeOffsetMC)
    {
        this.homeOffsetMC = homeOffsetMC;
    }

    @Override
    public double getHomeOffsetMC()
    {
        return homeOffsetMC;
    }

    @Override
    public void setResolutionRevolution(double resolutionRevolution)
    {
        this.resolutionRevolution = resolutionRevolution;
    }

    @Override
    public double getResolutionRevolution()
    {
        return resolutionRevolution;
    }

    @Override
    public void setHomeOffset(double homeOffset)
    {
        this.homeOffset = homeOffset;
    }

    @Override
    public double getHomeOffset()
    {
        return homeOffset;
    }
    

    public class Steps implements DataCreator
    {

        @Override
        public void createDownLoadData(List<DownloadPar> pars, Object o, Field field)
        {
            try
            {
            double dummy =  getHomeOffset();
            pars.add(new DownloadPar((short)((field.getDouble(o) + getHomeOffset()) * getResolutionStepsMM())));
            } catch (IllegalArgumentException | IllegalAccessException ex)
            {
                Logger.getLogger(AbstractMode.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public class RawValue implements DataCreator
    {
        @Override
        public void createDownLoadData(List<DownloadPar> pars, Object o, Field field)
        {
            try
            {
            pars.add(new DownloadPar((short)((field.getDouble(o) + getHomeOffset()) * getResolutionStepsMM())));
            } catch (IllegalArgumentException | IllegalAccessException ex)
            {
                Logger.getLogger(AbstractMode.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
