public class App {
    public static void main(String []agrs)
    {
        System.out.println(Licence.getNumbreOfRegistration());
        Licence l = new Licence(2020);
        l.setExpiration(2050);
        System.out.println(l.getExpiration());

        Licence t = new Licence(2020);
        Licence z = new Licence(2020);
    }
    
}