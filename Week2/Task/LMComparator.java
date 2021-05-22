import java.util.*;

public class LMComparator implements Comparator<QuakeEntry> {
    public int compare(QuakeEntry qe1, QuakeEntry qe2) {
        String s1=qe1.getInfo();
        String s2=qe2.getInfo();
        String[] xx=s1.split("\\W+");
        String[] yy=s2.split("\\W+");
        String w1=xx[xx.length-1];
        String w2=yy[yy.length-1];
//        System.out.println(w1+" "+w2);
        if(w1.compareTo(w2)!=0){
//            System.out.println(w1);
            return w1.compareTo(w2);
        }
        return Double.compare(qe1.getMagnitude(),qe2.getMagnitude());
    }
}
