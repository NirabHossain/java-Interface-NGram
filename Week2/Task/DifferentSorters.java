
/**
 * Write a description of class DifferentSorters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;

public class DifferentSorters {
    public void sortWithCompareTo() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/earthQuakeDataWeekDec6Sample2.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        Collections.sort(list);
        for(QuakeEntry qe: list) System.out.println(qe);
	    int quakeNumber = 600;
            System.out.println("Print quake entry in position " + quakeNumber);
            System.out.println(list.get(quakeNumber));
        
    }

    public void sortByMagnitude() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedata.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        Collections.sort(list, new MagnitudeComparator());
        for(QuakeEntry qe: list) System.out.println(qe);
    }


    public void TitleDepthSort() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/earthQuakeDataWeekDec6Sample1.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        Collections.sort(list, new TDComparator());
        //for(QuakeEntry qe: list) System.out.println(qe);
	    int quakeNumber = 500;
            System.out.println("Print quake entry in position " + quakeNumber);
            System.out.println(list.get(quakeNumber));        
    }



    public void LastMagnitudeSort() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/earthQuakeDataWeekDec6Sample1.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        Collections.sort(list, new LMComparator());
        //for(QuakeEntry qe: list) System.out.println(qe.getInfo());
	    int quakeNumber = 500;
            System.out.println("Print quake entry in position " + quakeNumber);
            System.out.println(list.get(quakeNumber));        
    }

    public void sortByDistance() {
        EarthQuakeParser parser = new EarthQuakeParser();
        String source = "data/nov20quakedata.atom";
        ArrayList<QuakeEntry> list  = parser.read(source);
        // Location is Durham, NC
        Location where = new Location(35.9886, -78.9072);
        Collections.sort(list, new DistanceComparator(where));
        for(QuakeEntry qe: list) System.out.println(qe);
    }
    public void tstt(){
        String s="I, Want to: be alone!";
        String[] s1=s.split("\\W+");
        System.out.println(s1[s1.length-1]);
        for(String s2:s1)System.out.println(s2);
        
    }
    
}
