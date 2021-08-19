import java.util.Random;
import java.util.Scanner;

public class Game{
    public static void main(String []args){

        Random r = new Random();
        int justprix = r.nextInt(200);
        int prix = 0;
        int essaie = 0;
        
        while(justprix != prix){

            System.out.println("Entrez un numero compris entre 0 et 200:");

             System.out.println("Le justprix : " + justprix);
            Scanner scan = new Scanner(System.in);
            try{
                prix = scan.nextInt();
                if(prix > justprix){
                    System.out.println("Le nombre est moins");
                }
                else if (prix < justprix){
                    System.out.println("Le nombre est plus");
                }
                essaie++;
            }
            catch(Exception e)
            {
                System.out.println("LOl Tu as essayer de faire planter mon programme");
            }
           
            
        }
        

        System.out.println("Le justprix : " + justprix + " en "+ essaie + " essais");
        

    }
   
}