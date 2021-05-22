import edu.duke.*;
import java.util.*;

public class QuakeSortDemo {
    
    public void testSort(){
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedata.atom";
        
        ArrayList<QuakeEntry> list  = parser.read(source);
        Collections.sort(list);
        
        for(QuakeEntry qe: list) {
            System.out.println(qe);
        }
    }
}
