public class App {
    /*
        int tab[] / int[] tab
        int tab[] = {1,2,3}
        int tab[] = new int[3]
        int tab[] = new int[]{1,2,3}
    */
    public static void printTab(int[] t)
    {
        for (int element : t)
            System.out.println(element);
    }
    public static void main(String [] args)
    {
        int tab[] = new int[3];//les donnes sont contenues bizaremment
        //int [] tab, tab2;
        //int tab[], tab2
        int tab2[] = new int[]{1,2,3};//tab2 est composer des entiers 1,2,3

        System.out.println(tab[0]);//pour afficher la premiere valeur du tableau
        

        //parcours
        for(i=0; i < tab.length ; i++)
        {
            System.out.println(i);
        }
        
        for(int el: tab)//pour chaque element du tab stocke dans el// cete boucle est prevue pour parcourir des tableau
            System.out.println(el);



        //tableau a deux dimenssion
        int [][] tab2d = {
            {1,2,3},//ligne
            {4,5,6}//colonne
        };
        System.out.println(tab2d[1][1]);//pour afficher le 5
        for(int i= 0; i< tab2d.length ; ++i)
            for(int j ; j< tab2d[i].lenght; ++j)
                System.out.println(tab2d[i][j]);

        for(int[] i : tab2d)
            for(int number : i)
                System.out.println(number);
        
   

    }
    
}