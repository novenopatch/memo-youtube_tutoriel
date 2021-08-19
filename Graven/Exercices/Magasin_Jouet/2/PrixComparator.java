
import java.util.Comparator;
public class PrixComparator implements  Comparator<Jouet>{
    public int compare(Jouet jouet1, Jouet jouet2){
        
        if(jouet1.getPrix() == jouet2.getPrix()){
            return jouet1.compareTo(jouet2);
        }
        
        return jouet2.getPrix() - jouet1.getPrix();
    }
}