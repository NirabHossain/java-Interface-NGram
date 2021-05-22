import java.util.*;

public class QuakeSort {
    public QuakeEntry getSmallestMagnitude(ArrayList<QuakeEntry> quakes) {
        QuakeEntry min = quakes.get(0);
        for(QuakeEntry q: quakes) {
            if (q.getDepth() > min.getDepth()) {
                min = q;
            }
        }
        return min;
    }
    
    public ArrayList<QuakeEntry> sortByMagnitude(ArrayList<QuakeEntry> in) {
        ArrayList<QuakeEntry> out = new ArrayList<QuakeEntry>();
        //while(!in.isEmpty()) {
        for(int k=0;k<70;k++){    
            QuakeEntry minElement = getSmallestMagnitude(in); 
            in.remove(minElement);                            
            out.add(minElement);
        }
        return out;
    }
    
    public int getLargestDepth(ArrayList<QuakeEntry> quakes, int from){
        
        return idx;
    }
    
    /* tester method to use in BlueJ Get largest Depth */
    public void testSort(){
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedata.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        list = sortByMagnitude(list);
        for(QuakeEntry qe: list) {
            System.out.println(qe);
        }
    }

}
