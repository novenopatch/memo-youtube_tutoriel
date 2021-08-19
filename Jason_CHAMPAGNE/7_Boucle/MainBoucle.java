/*


*/



public class MainBoucle 
{
    public static void main(String []args)
    {
        int i =0 ;
        int j = 9;
        int t = 0;
        

        while(i <=10)
        {
            int c=0;
            c= i*j;
            System.out.println( j+" * "+ i + "= " +c);
            i ++;
        }
        System.out.println("\t Suite du programme");
        while(t!=10)
        {
            System.out.println(t);

            if (t==7)
            {
                System.out.println(t);
                break;//il a aussi continue
            }
            t++;
        }
        Sytem.out.println("Suite");
        int b= 1;
        do
        {
            b ++;
            if(b==5){
                continue;
            }
            System.out.println(b);
        }
        while(b !=1);

        int f;
        for(f=0; f!=10 ; f++)// boucle for: initialisation, condition d'arret, incrementation
        {
            System.out.println(f);
        }

    }
}