import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main2{
    public static void main(String[] args){

        List<Jouet> jouets = new ArrayList<>();
        jouets.add(new Jouet("voiture", 20, "Voiture",5));
        jouets.add(new Jouet("Moto", 50, "Moto",10));
        jouets.add(new Jouet("Castiel", 60, "SuperNatural",45));
        jouets.add(new Jouet("Chuck", 1000, "Dieu",75));
        jouets.add(new Jouet("Carlos", 2110, "Une personne",90));
        jouets.add(new Jouet("opastiel", 20, "SuperNatural",15));
        jouets.add(new Jouet("yphuck", 2034, "yphunch",95));
        jouets.add(new Jouet("JohnCarlos", 12333,"iture",0));

        for(Jouet jouet : jouets){
            System.out.println( "Jouet:" + jouet.getName()+ "(" + jouet.getPrix()+ "$ " +  jouet.getDescription()+ " " + jouet.getPromo()+"%promo" +")");
        }
        System.out.println("Apres le tri");
         /*
        Collections.sort(jouets, new Comparator<Jouet>(){
            public int compare(Jouet jouet1, Jouet jouet2){
                /*
                if(jouet1.getPrix > jouet2.getPrix()){
                    return 1;
                }
                else{
                    return 0;
                }
                */
                //la premiere option aussi marche
               // return jouet1.getPrix() - jouet2.getPrix();
                 /*
            }
       
			
        });
         */
        Collections.sort(jouets,new PrixComparator());
        for(Jouet jouet : jouets){
            System.out.println( "Jouet:" + jouet.getName()+ "(" + jouet.getPrix()+ "$ " +  jouet.getDescription()+ " " + jouet.getPromo()+"%promo" +")");
        }

    }
}