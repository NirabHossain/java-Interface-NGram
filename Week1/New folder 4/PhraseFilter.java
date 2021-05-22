public class PhraseFilter implements Filter
{
    String typ,phrase;
    
    public PhraseFilter(String any, String s) { 
        typ=any;
        phrase=s;
    }

    public boolean satisfies(QuakeEntry qe) { 
        return (
            (typ=="start" && qe.getInfo().startsWith(phrase))||
            (typ=="end" && qe.getInfo().endsWith(phrase))||
            (typ=="any" && qe.getInfo().contains(phrase))
        ); 
    } 

}
