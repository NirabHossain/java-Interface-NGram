import java.util.*;

public class MatchAllFilter implements Filter
{
    private ArrayList<Filter> filters;
    private String name;
    
    public MatchAllFilter() { 
        filters=new ArrayList<Filter>();
    }

    public void addFilter(Filter f){
        filters.add(f);
        System.out.println(f.toString());
    }
    
    public void Names(Filter f){
        name=f.toString();
        //System.out.
    }
    
    public boolean satisfies(QuakeEntry qe) { 
        for(Filter f: filters)if(!f.satisfies(qe))return false;
        return true;
    }

}
