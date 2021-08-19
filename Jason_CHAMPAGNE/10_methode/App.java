
/*




*/
public class App 
{
    public static void main(String [] args)
    {
        

        prog();
        say("Hello !");

        Player p1 = new Player();
        Player p2 = new Player("Jay");
        Player p3 = new Player("Jay", 8);
        p1.attack();
        
    }
    public static void prog()//void il ne retourne rien
    {
        
        System.out.println("First methode");

        int number = getNumberTwo();
        System.out.println(number);

    }
    public static int getNumberTwo()//int retourne un int
    {
        return 2;
    }
    public static void say(String msg)//il prend en parametre un string
    {
        System.out.println(msg);
    }
    public static void test(String msg, int nb)//il prend en parametre un string puis un int
    {
        System.out.println(msg);
    }
    //surchage de mehode
    public static int sum(int a , int b)//en java on peut avoir deux methode portant le meme nom mais ca peut presenter des erreur si les methode ont trop de similitude en commun
    {
        return a + b;
    }
    public static double sum(double a , double b)//a l'execution java trouvera tout seul quelle sum choisir en fonction des parametre entrer
    {
        return a + b;
    }
    //les methode
}