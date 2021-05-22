import java.util.*;

public class TDComparator implements Comparator<QuakeEntry> {
    public int compare(QuakeEntry qe1, QuakeEntry qe2) {
        if(qe1.getInfo().compareTo( qe2.getInfo())!=0)return qe1.getInfo().compareTo( qe2.getInfo());
        return Double.compare(qe1.getDepth(),qe2.getDepth());
    }
}
