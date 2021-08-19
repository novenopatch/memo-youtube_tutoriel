public class App
{
    public static void main(String[] args) 
    {
        /* prog();
         System.out.println(Rien());//on peut appeller une methode à travers une autre
         System.out.println(test(7 , 12));
         System.out.println(test(7.2, 12.2));

    }
    public static void prog()//methode  prog identique au fonction dans d'autre language(methode ne renvoi rien)
    {
        System.out.println("Bonjour");
    }
    public static int Rien()
    {
        return 2;//elle return deux
    }
    // l'exemple de surchage de methode est dangereuse car c'est java qui décide de la méthode á utiliser
    public static int test ( int a, int b)
    {
        return a + b;
    }
    public static double test ( double a, double b)
    {
        return a + b;
    }
    */
    Player P1 = new Player();
    Player P2 = new Player("Jason");
    Player P3 = new Player("Jason", 6);
    P1.attack();
    }
}