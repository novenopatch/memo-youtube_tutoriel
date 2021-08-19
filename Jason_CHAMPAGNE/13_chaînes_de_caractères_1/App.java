public class App 
{   /*
        String : immuaable(contenu non modifiable) 
            >concat() -> plus rapide que "+"
            >lenght()
            >toUpperCase(), toLowerCase(), trim()<-vire les espaces avant et apres la chaine, replace()<-s.replace("b","t")
            >charAt(<indice>) exemple: s.charAt(8)
            > substring(<index>, <nb>)
            >s.equals(2) retourne true ou false
            >compareTo(<str>) utilise la table assci pour comparer le code de s a celui de s2(s-s2)


        


    */
    public static void main(String[] args)
    {
        String s = "Bonjour";
        String s2 = "tout le monde";
        System.out.println(s.concat(" ").concat(s2));
    }
    
}