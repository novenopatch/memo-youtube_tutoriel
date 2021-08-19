public class Player// application test du principe de surchage de mehode
{
    private String pName;
    private int pLevel;
/*
le contructeur player ici présent permet de simuler les fonction avec des argument optionnelle et par defaut comme cela se fait facilememt dans d'autre language de programmation comme python
*/
    public Player()
    {
        this.pName = "inconnu";
        this.pLevel = 1;
        System.out.println(this.pName + "-" + this.pLevel);
    }

    public Player(String name)
    {
        this.pName = name;
        this.pLevel = 1;
        System.out.println(this.pName + "-" + this.pLevel);
    }

    public Player(String name, int level)//et bien je ne savais pas que en java une fonction pouvait prendre plusieurs argument de type différent 
    {
        this.pName = name;
        this.pLevel = level;
        System.out.println(this.pName + "-" + this.pLevel);
    }
    public void attack()
    {
        System.out.println(this.pName + "- Attaque la cible");
    }
}