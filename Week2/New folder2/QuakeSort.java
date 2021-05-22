import java.util.*;

public class QuakeSort {
    public int getSmallestMagnitude(ArrayList<QuakeEntry> quakes, int from) {
        int minIdx = from;
        for (int i = from +1; i < quakes.size(); i++) {
            if (quakes.get(i).getDepth() > quakes.get(minIdx).getDepth()) {
                minIdx = i;
                System.out.println(minIdx+" "+i);
            }
        }
        return minIdx;
    }
    
    public void sortByMagnitude(ArrayList<QuakeEntry> in) {
        for(int i = 0; i < 70; i++) {
            int minIdx = getSmallestMagnitude(in, i);
            QuakeEntry qi = in.get(i);
            QuakeEntry qmin = in.get(minIdx);
            in.set(i, qmin);
            in.set(minIdx, qi); 
        }
    }
    public void testSort(){
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/earthQuakeDataDec6sample1.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        sortByMagnitude(list);
        int i=1;
        for(QuakeEntry qe: list)System.out.println((i++)+": "+qe);
    }
    
}
