public class MagFilter implements Filter{
    private double magMin,maxMag; 
    
    public MagFilter(double min, double max) { 
        magMin = min;
        maxMag=max;
    } 

    public boolean satisfies(QuakeEntry qe) { 
        return (qe.getMagnitude() >= magMin && qe.getMagnitude() <=maxMag); 
    } 

}
