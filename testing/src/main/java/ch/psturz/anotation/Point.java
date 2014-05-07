package ch.psturz.anotation;

public class Point<T1 extends Number, T2 extends Number> implements Comparable<Point>
{
    private final T1 x;
    private final T2 y;
 
    /**
     * 
     * @param x
     * @param y 
     */
    public Point(T1 x, T2 y) 
    {
        this.x = x;
        this.y = y;
    }

    public Point()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @return 
     */
    public T1 getX()
    {
        return x;
    }

    /**
     * 
     * @return 
     */
    public T2 getY()
    {
        return y;
    }

    /**
     * 
     * @param o
     * @return 
     */
    @Override
    public int compareTo(Point o)
    {
       return new Double(x.doubleValue()).compareTo(o.getX().doubleValue());
    }

    @Override
    public String toString()
    {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return new Point(x.doubleValue(), y.doubleValue()); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object o)
    {
        if(o == null)
        {
            return false;
        }
        else if(this == o) {
            return true;
        }
        else if(o instanceof Point)
        {
            return ((Point)o).y.doubleValue() == this.y.doubleValue() && 
                    Math.abs(((Point)o).x.doubleValue() - this.x.doubleValue()) < 0.005 ;
        } 
        else 
        {
            return false;
        }
    }

    @Override
    public int hashCode()
    {
        return(11 * x.hashCode()) ^ (53 * y.hashCode());
    }
    
    
    
}


