package ch.psturz.anotation;

import java.util.List;

public class Mode01 extends AbstractMode implements IMode01
{
    @Send(order=5, createData = AbstractMode.RawValue.class)
    public int accTimeFwd; // RampePosVor
    
    @Send(order=10, createData = AbstractMode.RawValue.class)
    private int accTimeRev; // RampePosZurueck
    
    @Send(order=20, createData = AbstractMode.RawValue.class)
    private int velFwd; // VelPosVor
    
    @Send(order=30, createData = AbstractMode.RawValue.class)
    private int velRev; // VelPosZurueck
    
    @Send(order=40)
    private double positionA;
    
    @Send(order=50)
    private double positionB;
    
    @Send(order=60)
    private double camN1A1ABOn;
    
    @Send(order=70)
    private double camN1A1ABOff;
    
    @Send(order=80)
    private double camN2A1ABOn;
    
    @Send(order=90)
    private double camN2A1ABOff;
    
    @Send(order=100)
    private double camN3A1ABOn;
    
    @Send(order=110)
    private double camN3A1ABOff;
    
    @Send(order=120)
    private double camN4A1ABOn;
    
    @Send(order=130)
    private double camN4A1ABOff;
    
    @Send(order=140)
    private double camN1A2ABOn;
    
    @Send(order=150)
    private double camN1A2ABOff;
    
    @Send(order=160)
    private double camN2A2ABOn;
    
    @Send(order=170)
    private double camN2A2ABOff;
    
    @Send(order=180)
    private double camN3A2ABOn;
    
    @Send(order=190)
    private double camN3A2ABOff;
    
    @Send(order=200)
    private double camN4A2ABOn;
    
    @Send(order=210)
    private double camN4A2ABOff;
    
    @Send(order=220)
    private double camN1A1BAOn;
    
    @Send(order=230)
    private double camN1A1BAOff;
    
    @Send(order=240)
    private double camN2A1BAOn;
    
    @Send(order=250)
    private double camN2A1BAOff;
    
    @Send(order=260)
    private double camN3A1BAOn;
    
    @Send(order=270)
    private double camN3A1BAOff;
    
    @Send(order=280)
    private double camN4A1BAOn;
    
    @Send(order=290)
    private double camN4A1BAOff;
    
    @Send(order=300)
    private double camN1A2BAOn;
    
    @Send(order=310)
    private double camN1A2BAOff;
    
    @Send(order=320)
    private double camN2A2BAOn;
    
    @Send(order=330)
    private double camN2A2BAOff;
    
    @Send(order=340)
    private double camN3A2BAOn;
    
    @Send(order=350)
    private double camN3A2BAOff;
    
    @Send(order=360)
    private double camN4A2BAOn;
    
    @Send(order=370)
    private double camN4A2BAOff;
    
    //@Send(order=380, createData = AbstractSchneiderMode.RawValue.class)
    private int camMode;


    @Override
    public int getAccTimeFwd()
    {
        return accTimeFwd;
    }

    @Override
    public void setAccTimeFwd(int accTimeFwd)
    {
        this.accTimeFwd = accTimeFwd;
    }

    @Override
    public int getAccTimeRev()
    {
        return accTimeRev;
    }

    @Override
    public void setAccTimeRev(int accTimeRev)
    {
        this.accTimeRev = accTimeRev;
    }

    @Override
    public int getVelFwd()
    {
        return velFwd;
    }

    @Override
    public void setVelFwd(int velFwd)
    {
        this.velFwd = velFwd;
    }

    @Override
    public int getVelRev()
    {
        return velRev;
    }

    @Override
    public void setVelRev(int velRev)
    {
        this.velRev = velRev;
    }
    
    @Override
    public double getPositionA()
    {
        return positionA;
    }
    
    @Override
    public void setPositionA(double positionA)
    {
        this.positionA = positionA;
    }
    
    @Override
    public double getPositionB()
    {
        return positionB;
    }
    
    @Override
    public void setPositionB(double positionB)
    {
        this.positionB = positionB;
    }
    
    @Override
    public double getCamN1A1ABOn()
    {
        return camN1A1ABOn;
    }
    
    @Override
    public void setCamN1A1ABOn(double camN1A1ABOn)
    {
        this.camN1A1ABOn = camN1A1ABOn;
    }
    
    @Override
    public double getCamN1A1ABOff()
    {
        return camN1A1ABOff;
    }
    
    @Override
    public void setCamN1A1ABOff(double camN1A1ABOff)
    {
        this.camN1A1ABOff = camN1A1ABOff;
    }
    
    @Override
    public double getCamN2A1ABOn()
    {
        return camN2A1ABOn;
    }
    
    @Override
    public void setCamN2A1ABOn(double camN2A1ABOn)
    {
        this.camN2A1ABOn = camN2A1ABOn;
    }
    
    @Override
    public double getCamN2A1ABOff()
    {
        return camN2A1ABOff;
    }
    
    @Override
    public void setCamN2A1ABOff(double camN2A1ABOff)
    {
        this.camN2A1ABOff = camN2A1ABOff;
    }
    
    @Override
    public double getCamN3A1ABOn()
    {
        return camN3A1ABOn;
    }
    
    @Override
    public void setCamN3A1ABOn(double camN3A1ABOn)
    {
        this.camN3A1ABOn = camN3A1ABOn;
    }
    
    @Override
    public double getCamN3A1ABOff()
    {
        return camN3A1ABOff;
    }
    
    @Override
    public void setCamN3A1ABOff(double camN3A1ABOff)
    {
        this.camN3A1ABOff = camN3A1ABOff;
    }
    
    @Override
    public double getCamN4A1ABOn()
    {
        return camN4A1ABOn;
    }
    
    @Override
    public void setCamN4A1ABOn(double camN4A1ABOn)
    {
        this.camN4A1ABOn = camN4A1ABOn;
    }
    
    @Override
    public double getCamN4A1ABOff()
    {
        return camN4A1ABOff;
    }
    
    @Override
    public void setCamN4A1ABOff(double camN4A1ABOff)
    {
        this.camN4A1ABOff = camN4A1ABOff;
    }
    
    @Override
    public double getCamN1A2ABOn()
    {
        return camN1A2ABOn;
    }
    
    @Override
    public void setCamN1A2ABOn(double camN1A2ABOn)
    {
        this.camN1A2ABOn = camN1A2ABOn;
    }

    @Override
    public double getCamN1A2ABOff()
    {
        return camN1A2ABOff;
    }
    
    @Override
    public void setCamN1A2ABOff(double camN1A2ABOff)
    {
        this.camN1A2ABOff = camN1A2ABOff;
    }
    
    @Override
    public double getCamN2A2ABOn()
    {
        return camN2A2ABOn;
    }
    
    @Override
    public void setCamN2A2ABOn(double camN2A2ABOn)
    {
        this.camN2A2ABOn = camN2A2ABOn;
    }
    
    @Override
    public double getCamN2A2ABOff()
    {
        return camN2A2ABOff;
    }
    
    @Override
    public void setCamN2A2ABOff(double camN2A2ABOff)
    {
        this.camN2A2ABOff = camN2A2ABOff;
    }
    
    @Override
    public double getCamN3A2ABOn()
    {
        return camN3A2ABOn;
    }
    
    @Override
    public void setCamN3A2ABOn(double camN3A2ABOn)
    {
        this.camN3A2ABOn = camN3A2ABOn;
    }
    
    @Override
    public double getCamN3A2ABOff()
    {
        return camN3A2ABOff;
    }
    
    @Override
    public void setCamN3A2ABOff(double camN3A2ABOff)
    {
        this.camN3A2ABOff = camN3A2ABOff;
    }
    
    @Override
    public double getCamN4A2ABOn()
    {
        return camN4A2ABOn;
    }
    
    @Override
    public void setCamN4A2ABOn(double camN4A2ABOn)
    {
        this.camN4A2ABOn = camN4A2ABOn;
    }
    
    @Override
    public double getCamN4A2ABOff()
    {
        return camN4A2ABOff;
    }
    
    @Override
    public void setCamN4A2ABOff(double camN4A2ABOff)
    {
        this.camN4A2ABOff = camN4A2ABOff;
    }
    
    @Override
    public double getCamN1A1BAOn()
    {
        return camN1A1BAOn;
    }
    
    @Override
    public void setCamN1A1BAOn(double camN1A1BAOn)
    {
        this.camN1A1BAOn = camN1A1BAOn;
    }
    
    @Override
    public double getCamN1A1BAOff()
    {
        return camN1A1BAOff;
    }

    @Override
    public void setCamN1A1BAOff(double camN1A1BAOff)
    {
        this.camN1A1BAOff = camN1A1BAOff;
    }
    
    @Override
    public double getCamN2A1BAOn()
    {
        return camN2A1BAOn;
    }
    
    @Override
    public void setCamN2A1BAOn(double camN2A1BAOn)
    {
        this.camN2A1BAOn = camN2A1BAOn;
    }

    @Override
    public double getCamN2A1BAOff()
    {
        return camN2A1BAOff;
    }
    
    @Override
    public void setCamN2A1BAOff(double camN2A1BAOff)
    {
        this.camN2A1BAOff = camN2A1BAOff;
    }
    
    @Override
    public double getCamN3A1BAOn()
    {
        return camN3A1BAOn;
    }
    
    @Override
    public void setCamN3A1BAOn(double camN3A1BAOn)
    {
        this.camN3A1BAOn = camN3A1BAOn;
    }
    
    @Override
    public double getCamN3A1BAOff()
    {
        return camN3A1BAOff;
    }
    
    @Override
    public void setCamN3A1BAOff(double camN3A1BAOff)
    {
        this.camN3A1BAOff = camN3A1BAOff;
    }
    
    @Override
    public double getCamN4A1BAOn()
    {
        return camN4A1BAOn;
    }
    
    @Override
    public void setCamN4A1BAOn(double camN4A1BAOn)
    {
        this.camN4A1BAOn = camN4A1BAOn;
    }
    
    @Override
    public double getCamN4A1BAOff()
    {
        return camN4A1BAOff;
    }
    
    @Override
    public void setCamN4A1BAOff(double camN4A1BAOff)
    {
        this.camN4A1BAOff = camN4A1BAOff;
    }
    
    @Override
    public double getCamN1A2BAOn()
    {
        return camN1A2BAOn;
    }
    
    @Override
    public void setCamN1A2BAOn(double camN1A2BAOn)
    {
        this.camN1A2BAOn = camN1A2BAOn;
    }
    
    @Override
    public double getCamN1A2BAOff()
    {
        return camN1A2BAOff;
    }
    
    @Override
    public void setCamN1A2BAOff(double camN1A2BAOff)
    {
        this.camN1A2BAOff = camN1A2BAOff;
    }
    
    @Override
    public double getCamN2A2BAOn()
    {
        return camN2A2BAOn;
    }
    
    @Override
    public void setCamN2A2BAOn(double camN2A2BAOn)
    {
        this.camN2A2BAOn = camN2A2BAOn;
    }
    
    @Override
    public double getCamN2A2BAOff()
    {
        return camN2A2BAOff;
    }
    
    @Override
    public void setCamN2A2BAOff(double camN2A2BAOff)
    {
        this.camN2A2BAOff = camN2A2BAOff;
    }
    
    @Override
    public double getCamN3A2BAOn()
    {
        return camN3A2BAOn;
    }
    
    @Override
    public void setCamN3A2BAOn(double camN3A2BAOn)
    {
        this.camN3A2BAOn = camN3A2BAOn;
    }
    
    @Override
    public double getCamN3A2BAOff()
    {
        return camN3A2BAOff;
    }
    
    @Override
    public void setCamN3A2BAOff(double camN3A2BAOff)
    {
        this.camN3A2BAOff = camN3A2BAOff;
    }
    
    @Override
    public double getCamN4A2BAOn()
    {
        return camN4A2BAOn;
    }
    
    @Override
    public void setCamN4A2BAOn(double camN4A2BAOn)
    {
        this.camN4A2BAOn = camN4A2BAOn;
    }
    
    @Override
    public double getCamN4A2BAOff()
    {
        return camN4A2BAOff;
    }
    
    @Override
    public void setCamN4A2BAOff(double camN4A2BAOff)
    {
        this.camN4A2BAOff = camN4A2BAOff;
    }
    
    @Override
    public int getCamMode()
    {
        return camMode;
    }
    
    @Override
    public void setCamMode(int camMode)
    {
        this.camMode = camMode;
    }

    @Override
    public Object getData()
    {
        List<DownloadPar> pars = DownloadDataCreator.createData(this);
        return pars;
    }
}
