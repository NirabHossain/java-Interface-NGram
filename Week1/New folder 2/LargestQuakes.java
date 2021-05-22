import java.util.*;

public class LargestQuakes
{
   public ArrayList<QuakeEntry> getLargest(ArrayList<QuakeEntry> quakeData, int howMany){
        ArrayList<QuakeEntry> copy = new ArrayList<QuakeEntry>(quakeData);
        ArrayList<QuakeEntry> ret = new ArrayList<QuakeEntry>();
        for(int j=0; j < howMany; j++) {
            double max = Double.MIN_VALUE;
            int idx=0;
            for(int k=1; k < copy.size(); k++){
                QuakeEntry quake = copy.get(k);
                double loc = quake.getMagnitude();
                if (max<loc) {max = loc;idx=k;}
            }
          
            ret.add(copy.get(idx));
            copy.remove(idx);
        }
        return ret;
   }
    
   public void findLargestQuakes(){
       EarthQuakeParser parser = new EarthQuakeParser();
		String source = "data/nov20quakedata.atom";
		ArrayList<QuakeEntry> list  = parser.read(source);
		System.out.println("read data for " + list.size());
		ArrayList<QuakeEntry> close = getLargest(list, 50);
		for(int k=0; k < close.size(); k++){
			QuakeEntry entry = close.get(k);
			System.out.println(entry);
		}
		System.out.println("number found: " + close.size());
   }
}
