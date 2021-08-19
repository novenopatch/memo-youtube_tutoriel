import java.util.StringTokenizer;

public class App {

    /*  
        StringBuilder(asynchrone)//le monothread est largement plus rapide que le multi-thread
        Monothreade ; 1 seul thread

        StringBuffer (synchroniser, thread-safe)
            Multi-threde : plusieurs threads


        StringBuilder / StringBuffer : muable (contenue modifiable)

            > length() , capacity()
            > append(<str>) le append mets toujours a la fin / insert(<index>, <str>)

            //quartaMeravigliaGoldenBlue
            //sextaGoldenblue
            //primeraGoldenBlue
            //jinQuartaGoldenBlue


    */
    public static void main(String[] args)
    {
            String s = "news/titre-de-la-news/14";
            StringTokenizer st = new StringTokenizer(s, "/");//on peut rajouter le parametre ,true pour recuperer les delimiteur
            int i =0;//j'ai rajouter ca pour faire plus cool
            String nom = "part";
            while(st.hasMoreTokens())
                {   
                    i++;
                    
                    System.out.println(nom+ i + " ".concat(st.nextToken()));
                }
            StringBuilder sBuilder = new StringBuilder();

            System.out.println("\n"+sBuilder);
            System.out.println(sBuilder.length());
            System.out.println(sBuilder.capacity());
            
            sBuilder.append("Bonjour");
            System.out.println(sBuilder);
            System.out.println(sBuilder.length());
            System.out.println(sBuilder.capacity());

            sBuilder.append(" cela fonction on dirait");
            System.out.println(sBuilder);
            System.out.println(sBuilder.length());
            System.out.println(sBuilder.capacity());



    }
    
}