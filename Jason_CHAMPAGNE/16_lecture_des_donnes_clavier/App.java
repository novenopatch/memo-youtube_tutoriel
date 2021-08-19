import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App 
{   
    /*
        BufferedReader -> synchrome
                         thread-safe
                         lecture de chaine de carateres(String)
                         tampon de 8192 carateres

                    -read() : lire un caratere
                    -readLine() : lire un chaine
                    -skipe(N) : ignore N caratere

        Scanner  -> asynchrone  //elle est plus lente
                    not thread-safe
                    lecture de donnee + parsing(verification de donnes)
                    tampon de 1024 caracteres
                -nextLine()
                -nextChar()
                -nextByte()
                -nextFloat()
                -nextDouble()
                -nextInt()
                -nextBoolean()

    */
    
    public static void main (String[] args) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);//tread-safe

        System.out.print("Comment t'appelles-tu ? ");
        String name = br.readLine();
        System.out.println(name.concat(" cela marche"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Acceder a quel niveau ? ");
        int game_level = sc.nextInt();

        System.out.println("vous avez saisie: "+game_level);


    }
    
}