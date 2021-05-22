import java.util.*;
import edu.duke.*;

public class QuakeSortInPlace {
    int ic=0;
    public QuakeSortInPlace() {}
   
    public int getSmallestMagnitude(ArrayList<QuakeEntry> quakes, int from) {
        int minIdx = from;
        for (int i=from+1; i< quakes.size(); i++) {
            if (quakes.get(i).getMagnitude() < quakes.get(minIdx).getMagnitude()) {
                minIdx = i;
                System.out.println(minIdx);
            }
        }
        return minIdx;
    }    
    public void sortByMagnitude(ArrayList<QuakeEntry> in) {
       int mm=0;
       for (int i=0; i<in.size(); i++) {
            int minIdx = getSmallestMagnitude(in,i);
            QuakeEntry qi = in.get(i);
            QuakeEntry qmin = in.get(minIdx);
            in.set(i,qmin);
            in.set(minIdx,qi);
            mm=minIdx;
        }
    }
    public void testSort2() {
        EarthQuakeParser parser = new EarthQuakeParser(); 
        String source = "data/earthquakeDataWeekDec6Sample2.atom";
        //String source = "data/nov20quakedata.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);  
       
        System.out.println("read data for "+list.size()+" quakes");    
        sortByMagnitude(list);
        for (QuakeEntry qe: list) { 
            //System.out.println(qe);
        }
    }
public void onePassBubbleSort(ArrayList<QuakeEntry> quakeData, int numSorted){
        for(int i = 0; i < quakeData.size()-1-numSorted; i++){

            QuakeEntry curr = quakeData.get(i);
            QuakeEntry next = quakeData.get(i+1);
            if(curr.getMagnitude()>next.getMagnitude()){
                quakeData.set(i,next);
                quakeData.set(i+1,curr);
            }
        }
    }

public void sortByMagnitudeWithBubbleSortWithCheck(ArrayList<QuakeEntry> in){
        int n = 0,i = 0; 
        while(i<=in.size()){
           if(checkInSortedOrder(in))break;
           onePassBubbleSort(in,i);  
           n++;i++;
           //System.out.println("Printing Quakes after pass: "+n);
           //for (QuakeEntry qe: in)System.out.println(qe.getMagnitude()+"\t");//.getMagnitude()           
           
        }
        System.out.println("Number of passes required: "+(n));
   } 
   public boolean checkInSortedOrder(ArrayList<QuakeEntry> in){
       double val=in.get(0).getMagnitude();
       for(QuakeEntry q: in){
           if(val<=q.getMagnitude())val=q.getMagnitude();
           else return false;
       }
       return true;
   }
    public void testSort() {
        EarthQuakeParser parser = new EarthQuakeParser(); 
        String source = "data/earthquakeDataWeekDec6Sample2.atom";
        //String source = "data/nov20quakedata.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);  
       
        System.out.println("read data for "+list.size()+" quakes");    
        sortByMagnitudeWithBubbleSortWithCheck(list);
        //for(QuakeEntry qe: list)System.out.println(qe);]        
    }
}
