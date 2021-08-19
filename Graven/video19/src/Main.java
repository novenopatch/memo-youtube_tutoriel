import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public  static void main(String[] args){
        //comparator
        //compparable
        List<Toy> jouets = new ArrayList<>();
        jouets.add(new Toy("lu garu",17, "",30));
        jouets.add(new Toy("garu",20,"riri", 10));
        jouets.add(new Toy("laru",90, "Li", 20));
        jouets.add(new Toy("luli", 23, "lo", 44));
        //trier cette liste par ordre alphabétique:
       // Collections.sort(jouets);

        Collections.sort(jouets, new PriceComparator());
        for(Toy jouet: jouets){
            System.out.println(jouet.getName() +"-"+jouet.getPrice() +"$ :"+ jouet.getDescription() + "promo:"+ jouet.getPromo());
        }

    }
}
