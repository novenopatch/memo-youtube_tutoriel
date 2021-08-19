import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main1{
    public static void main(String[] args){

        List<String> jouets = new ArrayList<>();
        jouets.add("voiture");
        jouets.add("Moto");
        jouets.add("Castiel");
        jouets.add("Chuck");
        jouets.add("Carlos");
        jouets.add("opastiel");
        jouets.add("yphuck");
        jouets.add("JohnCarlos");

        for(String jouet : jouets){
            System.out.println(jouet);
        }
        System.out.println("Apres le tri");
        Collections.sort(jouets);
        for(String jouet : jouets){
            System.out.println(jouet);
        }

    }
}