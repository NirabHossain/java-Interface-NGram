
/**
 * Write a description of DepthFilter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DepthFilter implements Filter
{
    private double Min,Max; 
    
    public DepthFilter(double min, double max) { 
        Min = min;Max=max;
    }

    public boolean satisfies(QuakeEntry qe) { 
        return (qe.getDepth() >= Min && qe.getDepth() <= Max); 
    } 

}
