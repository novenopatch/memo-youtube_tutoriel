import java.util.*;
public class App {
    public static void main(String[] args)//throws Exception
    {
        Scanner sc = new Scanner(System.in);

        try//il ne peut y avoir que un try
        {
        System.out.print("Annee de naissance : ");
        int yearOfBirth = sc.nextInt();
        System.out.println(yearOfBirth);
        }
        catch(InputMismatchException e)// plein de catch specifique au moins specifique
        {
            System.out.println("La date de naissance entrer n'est pas valide");
        }
        catch(Exception e)
        {
            System.out.println("LOlo");
        }
        finally{
            System.out.println("il s'execute quoi qu'il arrive! ");
            e.printStackTrace();//cette ligne permet d'afficher la pile du message d'erreur//e.getMessage() recupere le message d'erreur
        }

            
    }
    
}