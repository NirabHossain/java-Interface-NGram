public class DistanceFilter implements Filter
{
    private double Max;
    private Location loc;
    
    public DistanceFilter(Location min, double max) { 
        loc = min;Max=max;
    }

    public boolean satisfies(QuakeEntry qe) { 
        return (qe.getLocation().distanceTo(loc) < Max ); 
    } 

}
